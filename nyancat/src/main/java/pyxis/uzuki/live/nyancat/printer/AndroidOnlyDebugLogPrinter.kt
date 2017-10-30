package pyxis.uzuki.live.nyancat.printer

import android.util.Log

/**
 * NyanCat
 * Class: NyanCatLogger
 * Created by Pyxis on 2017-10-30.
 *
 * Description: 'Logger for Android.Log' class for NyanCat
 */
internal class AndroidOnlyDebugLogPrinter(val debug: Boolean = false) : CatPrinter {

    override fun println(priority: Int, tag: String, message: String, t: Throwable?) {
        var newMessage = message
        if (t != null)
            newMessage += '\n' + Log.getStackTraceString(t)

        if (debug)
            Log.println(priority, tag, message)
    }
}