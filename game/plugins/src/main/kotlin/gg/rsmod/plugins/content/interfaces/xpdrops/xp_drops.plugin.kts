package gg.rsmod.plugins.content.interfaces.xpdrops

val INTERFACE_ID = 122
val SETUP_INTERFACE_ID = 137

on_button(interfaceId = 160, component = 1) {
    val option = player.getInteractingOption()

    if (option == 1) {
        player.toggleVarbit(Varbits.XP_DROPS_VISIBLE_VARBIT)
        if (player.getVarbit(Varbits.XP_DROPS_VISIBLE_VARBIT) == 1) {
            player.openInterface(INTERFACE_ID, InterfaceDestination.XP_COUNTER)
        } else {
            player.closeInterface(INTERFACE_ID)
        }
    } else if (option == 2 && player.lock.canInterfaceInteract()) {
        player.openInterface(dest = InterfaceDestination.MAIN_SCREEN, interfaceId = SETUP_INTERFACE_ID)
    }
}