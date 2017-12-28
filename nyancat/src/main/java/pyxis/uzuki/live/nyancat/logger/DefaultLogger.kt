package pyxis.uzuki.live.nyancat.logger

import pyxis.uzuki.live.nyancat.NyanCatLogger
import pyxis.uzuki.live.nyancat.printer.AndroidLogPrinter
import pyxis.uzuki.live.nyancat.printer.CatLoggerPrinter
import pyxis.uzuki.live.nyancat.utils.getClassName
import pyxis.uzuki.live.nyancat.utils.simpleClassName
import pyxis.uzuki.live.richutilskt.utils.isEmpty
import java.util.*

/**
 * NyanCat
 * Class: DefaultLogger
 * Created by Pyxis on 2017-10-30.
 *
 */

internal class DefaultLogger(private val tag: String = "") : NyanCatLogger() {
    private val addList = arrayListOf<CatLoggerPrinter>()

    override fun getPrinters(): ArrayList<CatLoggerPrinter> {
        val list = arrayListOf<CatLoggerPrinter>()
        list.add(AndroidLogPrinter())
        list.addAll(addList)
        return list
    }

    override fun getTag(): String {
        return if (tag.isEmpty())
            getClassName().simpleClassName()
        else
            tag
    }

    override fun addPrinter(printer: CatLoggerPrinter) {
        addList.add(printer)
    }

    override fun clearPrinter() {
        addList.clear()
        addList.trimToSize()
    }

    override fun getAddedPrinters(): ArrayList<CatLoggerPrinter> {
        return addList
    }
}
