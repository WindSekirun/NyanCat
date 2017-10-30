package pyxis.uzuki.live.nyancat

import pyxis.uzuki.live.nyancat.logger.DefaultLogger
import pyxis.uzuki.live.nyancat.logger.OnlyDebugLogger
import pyxis.uzuki.live.nyancat.printer.CatPrinter

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
    fun print(priority: Int, tag: String, message: String, t: Throwable?, printers: List<CatPrinter>?) {
        if (printers != null && !printers.isEmpty()) {
            for (i in printers.indices) {
                printers[i].println(priority, tag, message, t)
            }
        }
    }

    @JvmStatic
    fun breedNyanCat(config: NyanCatConfig) {
        this.config = config
        logger = if (config.debuggable == TriggerTiming.ONLY_DEBUG) {
            OnlyDebugLogger(config.debug)
        } else {
            DefaultLogger()
        }
    }

    fun getPackageName(): String {
        if (config == null) {
            throw NullPointerException("NyanCatConfig is not initialized. Please add NyanCatStatic.breedNyanCat(NyanCatConfig)")
        }

        return config?.packageName as String
    }
}
