package gg.rsmod.game.message.handler

import gg.rsmod.game.action.ObjectPathAction
import gg.rsmod.game.message.MessageHandler
import gg.rsmod.game.message.impl.OpObjTMessage
import gg.rsmod.game.model.EntityType
import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.World
import gg.rsmod.game.model.attr.INTERACTING_ITEM
import gg.rsmod.game.model.attr.INTERACTING_ITEM_SLOT
import gg.rsmod.game.model.attr.INTERACTING_OBJ_ATTR
import gg.rsmod.game.model.entity.Client
import gg.rsmod.game.model.entity.GameObject
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.model.priv.Privilege
import java.lang.ref.WeakReference

class OpObjTHandler : MessageHandler<OpObjTMessage> {
    override fun handle(client: Client, world: World, message: OpObjTMessage) {
    if (message.slot < 0 || message.slot >= client.inventory.capacity) {
        return
    }

    if (!client.lock.canItemInteract()) {
        return
    }

    val item = client.inventory[message.slot] ?: return

    if (item.id != message.item) {
        return
    }

    // If the player can't move, do nothing
    if (!client.lock.canMove()) {
        return
    }

    // If the tile is too far away, do nothing
    val tile = Tile(message.x, message.z, client.tile.height)
    if (!tile.viewableFrom(client.tile, Player.TILE_VIEW_DISTANCE)) {
        return
    }

    // Get the region chunk that the object would belong to.
    val chunk = world.chunks.getOrCreate(tile)
    val obj = chunk.getEntities<GameObject>(tile, EntityType.STATIC_OBJECT, EntityType.DYNAMIC_OBJECT).firstOrNull { it.id == message.obj } ?: return

    if (message.movementType == 1 && world.privileges.isEligible(client.privilege, Privilege.ADMIN_POWER)) {
        val def = obj.getDef(world.definitions)
        client.moveTo(world.findRandomTileAround(obj.tile, radius = 1, centreWidth = def.width, centreLength = def.length) ?: obj.tile)
    }

    log(client, "Item on object: item=%d, slot=%d, obj=%d, x=%d, z=%d", message.item, message.slot, message.obj, message.x, message.z)

    client.stopMovement()
    client.closeInterfaceModal()
    client.interruptQueues()
    client.resetInteractions()

    client.attr[INTERACTING_ITEM] = WeakReference(item)
    client.attr[INTERACTING_ITEM_SLOT] = message.slot
    client.attr[INTERACTING_OBJ_ATTR] = WeakReference(obj)

    client.executePlugin(ObjectPathAction.itemOnObjectPlugin)
    }
}