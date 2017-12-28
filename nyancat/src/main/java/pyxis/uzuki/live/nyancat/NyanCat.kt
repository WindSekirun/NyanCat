package pyxis.uzuki.live.nyancat

/**
 * NyanCat
 * Class: NyanCat
 * Created by Pyxis on 2017-10-30.
 *
 *
 * Description:
 */

object NyanCat {

    @JvmStatic fun d(message: String) {
        NyanCatStatic.logger.d(message)
    }

    @JvmStatic fun d(message: String, vararg args: Any) {
        NyanCatStatic.logger.d(message, *args)
    }

    @JvmStatic fun d(t: Throwable, message: String, vararg args: Any) {
        NyanCatStatic.logger.d(t, message, *args)
    }

    @JvmStatic fun <T> d(lists: List<T>) {
        NyanCatStatic.logger.d(lists)
    }

    @JvmStatic fun <T> d(delimiter: CharSequence, lists: List<T>) {
        NyanCatStatic.logger.d(delimiter, lists)
    }

    @JvmStatic fun d(`object`: Any) {
        NyanCatStatic.logger.d(`object`)
    }

    @JvmStatic fun i(message: String) {
        NyanCatStatic.logger.i(message)
    }

    @JvmStatic fun i(message: String, vararg args: Any) {
        NyanCatStatic.logger.i(message, *args)
    }

    @JvmStatic fun i(t: Throwable, message: String, vararg args: Any) {
        NyanCatStatic.logger.i(t, message, *args)
    }

    @JvmStatic fun <T> i(lists: List<T>) {
        NyanCatStatic.logger.i(lists)
    }

    @JvmStatic fun <T> i(delimiter: CharSequence, lists: List<T>) {
        NyanCatStatic.logger.i(delimiter, lists)
    }

    @JvmStatic fun i(`object`: Any) {
        NyanCatStatic.logger.i(`object`)
    }

    @JvmStatic fun w(message: String) {
        NyanCatStatic.logger.w(message)
    }

    @JvmStatic fun w(message: String, vararg args: Any) {
        NyanCatStatic.logger.w(message, *args)
    }

    @JvmStatic fun w(t: Throwable, message: String, vararg args: Any) {
        NyanCatStatic.logger.w(t, message, *args)
    }

    @JvmStatic fun <T> w(lists: List<T>) {
        NyanCatStatic.logger.w(lists)
    }

    @JvmStatic fun <T> w(delimiter: CharSequence, lists: List<T>) {
        NyanCatStatic.logger.w(delimiter, lists)
    }

    @JvmStatic fun w(`object`: Any) {
        NyanCatStatic.logger.w(`object`)
    }

    @JvmStatic fun w(t: Throwable) {
        NyanCatStatic.logger.w(t)
    }

    @JvmStatic fun e(t: Throwable) {
        NyanCatStatic.logger.e(t)
    }

    @JvmStatic fun e(message: String) {
        NyanCatStatic.logger.e(message)
    }

    @JvmStatic fun e(message: String, vararg args: Any) {
        NyanCatStatic.logger.e(message, *args)
    }

    @JvmStatic fun e(t: Throwable, message: String, vararg args: Any) {
        NyanCatStatic.logger.e(t, message, *args)
    }

    @JvmStatic fun <T> e(lists: List<T>) {
        NyanCatStatic.logger.e(lists)
    }

    @JvmStatic fun <T> e(delimiter: CharSequence, lists: List<T>) {
        NyanCatStatic.logger.e(delimiter, lists)
    }

    @JvmStatic fun e(`object`: Any) {
        NyanCatStatic.logger.e(`object`)
    }

    @JvmStatic fun v(message: String) {
        NyanCatStatic.logger.v(message)
    }

    @JvmStatic fun v(message: String, vararg args: Any) {
        NyanCatStatic.logger.v(message, *args)
    }

    @JvmStatic fun v(t: Throwable, message: String, vararg args: Any) {
        NyanCatStatic.logger.v(t, message, *args)
    }

    @JvmStatic fun <T> v(lists: List<T>) {
        NyanCatStatic.logger.v(lists)
    }

    @JvmStatic fun <T> v(delimiter: CharSequence, lists: List<T>) {
        NyanCatStatic.logger.v(delimiter, lists)
    }

    @JvmStatic fun v(`object`: Any) {
        NyanCatStatic.logger.v(`object`)
    }

    @JvmStatic fun tag(tag: String): NyanCatLogger {
        return NyanCatStatic.tag(tag)
    }
}