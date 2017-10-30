package pyxis.uzuki.live.nyancat

import pyxis.uzuki.live.nyancat.config.NyanCatConfig
import pyxis.uzuki.live.nyancat.config.TriggerTiming
import pyxis.uzuki.live.nyancat.logger.DefaultLogger
import pyxis.uzuki.live.nyancat.logger.OnlyDebugLogger
import pyxis.uzuki.live.nyancat.printer.CatLoggerPrinter

/**
 * NyanCat
 * Class: NyanCatStatic
 * Created by Pyxis on 2017-10-30.
 *
 * Description:
 */
object NyanCatStatic {
    lateinit var logger: NyanCatLogger
    private var config: NyanCatConfig? = null

    @JvmStatic
    @Synchronized
    fun print(priority: Int, tag: String, message: String, t: Throwable?, printers: List<CatLoggerPrinter>?) {
        if (printers != null && !printers.isEmpty()) {
            for (i in printers.indices) {
                printers[i].println(priority, tag, message, t)
            }
        }
    }

    @JvmStatic
    fun breedNyanCat(config: NyanCatConfig) {
        this.config = config
        logger = if (getDebuggable()) {
            OnlyDebugLogger(config.debug)
        } else {
            DefaultLogger()
        }
    }

    @JvmStatic
    fun tag(tag: String): NyanCatLogger {
        val newLogger = if (getDebuggable()) OnlyDebugLogger(getDebugState(), tag) else  DefaultLogger(tag)

        for (printer in logger.printers) {
            newLogger.addPrinter(printer)
        }

        return newLogger
    }

    fun getPackageName(): String {
        if (config == null) {
            throw NullPointerException("NyanCatConfig is not initialized. Please add NyanCatStatic.breedNyanCat(NyanCatConfig)")
        }

        return config?.packageName as String
    }

    fun getDebuggable(): Boolean {
        if (config == null) {
            throw NullPointerException("NyanCatConfig is not initialized. Please add NyanCatStatic.breedNyanCat(NyanCatConfig)")
        }

        return config?.debuggable == TriggerTiming.ONLY_DEBUG
    }

    fun getDebugState(): Boolean {
        if (config == null) {
            throw NullPointerException("NyanCatConfig is not initialized. Please add NyanCatStatic.breedNyanCat(NyanCatConfig)")
        }

        return config?.debug ?: false
    }
}
