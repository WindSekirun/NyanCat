package pyxis.uzuki.live.nyancat.logger

import pyxis.uzuki.live.nyancat.NyanCatLogger
import pyxis.uzuki.live.nyancat.printer.AndroidLogPrinter
import pyxis.uzuki.live.nyancat.printer.CatPrinter
import pyxis.uzuki.live.nyancat.utils.getClassName
import pyxis.uzuki.live.nyancat.utils.simpleClassName
import java.util.*

/**
 * NyanCat
 * Class: DefaultLogger
 * Created by Pyxis on 2017-10-30.
 *
 */

class DefaultLogger : NyanCatLogger() {
    private val list = arrayListOf<CatPrinter>()

    init {
        list.add(AndroidLogPrinter())
    }

    override fun getPrinters(): ArrayList<CatPrinter> = list

    override fun getTag(): String = getClassName().simpleClassName()

    override fun addPrinter(printer: CatPrinter) {
        list.add(printer)
    }
}
