package gg.rsmod.game.sync.segment

import gg.rsmod.game.model.Direction
import gg.rsmod.game.model.entity.Npc
import gg.rsmod.game.model.entity.Player
import gg.rsmod.game.sync.SynchronizationSegment
import gg.rsmod.net.packet.GamePacketBuilder

/**
 * @author Tom <rspsmods@gmail.com>
 */
class AddLocalNpcSegment(val player: Player, val npc: Npc, private val requiresBlockUpdate: Boolean,
                         private val largeScene: Boolean) : SynchronizationSegment {

    override fun encode(buf: GamePacketBuilder) {
        var dx = npc.tile.x - player.tile.x
        var dz = npc.tile.z - player.tile.z

        if (!largeScene) {
            if (dx < Player.NORMAL_VIEW_DISTANCE) {
                dx += 32
            }
            if (dz < Player.NORMAL_VIEW_DISTANCE) {
                dz += 32
            }
        } else {
            if (dx < Player.LARGE_VIEW_DISTANCE) {
                dx += 256
            }
            if (dz < Player.LARGE_VIEW_DISTANCE) {
                dz += 256
            }
        }

        val id = if (npc.getTransmogId() != -1) npc.getTransmogId() else npc.id
        val facing = if (npc.lastFacingDirection != Direction.NONE) npc.lastFacingDirection else Direction.SOUTH
        buf.putBits(16, npc.index)
        buf.putBits(1, if (requiresBlockUpdate) 1 else 0)
        buf.putBits(14, id)
        buf.putBits(if (largeScene) 8 else 5, dz)
        buf.putBits(1, if (requiresBlockUpdate) 1 else 0)
        buf.putBits(1, 1) // When client receives this one , it will just change to 1 does not matter what it will be
        buf.putBits(32, 0) // Unsure wut it wants but if upper bit 1 is true => It will read 32 bits
        buf.putBits(if (largeScene) 8 else 5, dx)
        buf.putBits(3, facing.npcWalkValue)
    }
}