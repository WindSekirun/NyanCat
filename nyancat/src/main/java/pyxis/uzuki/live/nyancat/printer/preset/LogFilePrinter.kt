package pyxis.uzuki.live.nyancat.printer.preset

import android.content.Context
import pyxis.uzuki.live.nyancat.NyanCatGlobal
import pyxis.uzuki.live.nyancat.printer.CatLoggerPrinter
import pyxis.uzuki.live.richutilskt.utils.asDateString
import pyxis.uzuki.live.richutilskt.utils.saveFile
import java.io.File

/**
 * NyanCat
 * Class: LogFilePrinter
 * Created by Pyxis on 2017-10-30.
 *
 * Description:
 */
open class LogFilePrinter(val context: Context, val fileName: String) : CatLoggerPrinter {
    override fun println(priority: Int, tag: String, message: String, t: Throwable?) {
        val formatted = getFormatMessage(priority, tag, message, t)
        val logFile = getLogFile()

        var appendedText = ""
        if (logFile.exists()) {
            appendedText += logFile.readText()
        }

        appendedText += System.getProperty("line.separator")
        appendedText += formatted

        saveFile(logFile.absolutePath, appendedText)
    }

    private fun Int.getPriorityString(): String {
        return when (this) {
            2 -> "V"
            3 -> "D"
            4 -> "I"
            5 -> "W"
            6 -> "E"
            7 -> "A"
            else -> "D"
        }
    }

    open fun getFormatMessage(priority: Int, tag: String, message: String, t: Throwable?)
            = "${System.currentTimeMillis().asDateString("yyyy-MM-dd HH:mm:ss")} " +
            "/${NyanCatGlobal.getPackageName()} ${priority.getPriorityString()}/$tag: $message"


    open fun getLogFile() = File(context.externalCacheDir, fileName)
}