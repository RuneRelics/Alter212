package gg.rsmod.game.fs.def

import gg.rsmod.game.fs.Definition
import io.netty.buffer.ByteBuf
import java.lang.IllegalStateException

/**
 * @author Tom <rspsmods@gmail.com>
 */
class VarpDef(override val id: Int) : Definition(id) {

    var configType = 0

    override fun decode(buf: ByteBuf, opcode: Int) {
        when (opcode) {
            5 -> configType = buf.readUnsignedShort()
            else -> throw IllegalStateException("Unknown opcode: $opcode in VarpDef")
        }
    }
}