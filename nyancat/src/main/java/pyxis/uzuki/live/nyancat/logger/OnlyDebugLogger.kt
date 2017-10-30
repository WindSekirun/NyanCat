package pyxis.uzuki.live.nyancat.logger

import pyxis.uzuki.live.nyancat.NyanCatLogger
import pyxis.uzuki.live.nyancat.printer.AndroidOnlyDebugLogPrinter
import pyxis.uzuki.live.nyancat.printer.CatPrinter
import pyxis.uzuki.live.nyancat.utils.getClassName
import pyxis.uzuki.live.nyancat.utils.simpleClassName
import java.util.*

/**
 * NyanCat
 * Class: DefaultLogger
 * Created by Pyxis on 2017-10-30.
 */

internal class OnlyDebugLogger(val debug: Boolean = false) : NyanCatLogger() {

    private val addList = arrayListOf<CatPrinter>()

    override fun getPrinters(): ArrayList<CatPrinter> {
        val list = arrayListOf<CatPrinter>()
        list.add(AndroidOnlyDebugLogPrinter(debug))
        list.addAll(addList)
        return list
    }

    override fun getTag(): String = getClassName().simpleClassName()

    override fun addPrinter(printer: CatPrinter) {
        addList.add(printer)
    }

    override fun clearPrinter() {
        addList.clear()
        addList.trimToSize()
    }
}