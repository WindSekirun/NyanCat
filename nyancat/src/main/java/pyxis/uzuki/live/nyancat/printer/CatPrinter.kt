package pyxis.uzuki.live.nyancat.printer

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

/**
 * NyanCat
 * Class: NyanCatLogger
 * Created by Pyxis on 2017-10-30.
 *
 * Description: Basic Printer class for NyanCat
 */
interface CatPrinter {
    fun println(priority: Int, @NotNull tag: String, @NotNull message: String, @Nullable t: Throwable?)
}
