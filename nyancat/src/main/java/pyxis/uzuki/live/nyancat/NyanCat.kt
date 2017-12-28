package pyxis.uzuki.live.nyancat

object NyanCat {

    @JvmStatic fun d(message: String) {
        NyanCatGlobal.logger.d(message)
    }

    @JvmStatic fun d(message: String, vararg args: Any) {
        NyanCatGlobal.logger.d(message, *args)
    }

    @JvmStatic fun d(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.d(t, message, *args)
    }

    @JvmStatic fun <T> d(lists: List<T>) {
        NyanCatGlobal.logger.d(lists)
    }

    @JvmStatic fun <T> d(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.d(delimiter, lists)
    }

    @JvmStatic fun d(`object`: Any) {
        NyanCatGlobal.logger.d(`object`)
    }

    @JvmStatic fun i(message: String) {
        NyanCatGlobal.logger.i(message)
    }

    @JvmStatic fun i(message: String, vararg args: Any) {
        NyanCatGlobal.logger.i(message, *args)
    }

    @JvmStatic fun i(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.i(t, message, *args)
    }

    @JvmStatic fun <T> i(lists: List<T>) {
        NyanCatGlobal.logger.i(lists)
    }

    @JvmStatic fun <T> i(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.i(delimiter, lists)
    }

    @JvmStatic fun i(`object`: Any) {
        NyanCatGlobal.logger.i(`object`)
    }

    @JvmStatic fun w(message: String) {
        NyanCatGlobal.logger.w(message)
    }

    @JvmStatic fun w(message: String, vararg args: Any) {
        NyanCatGlobal.logger.w(message, *args)
    }

    @JvmStatic fun w(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.w(t, message, *args)
    }

    @JvmStatic fun <T> w(lists: List<T>) {
        NyanCatGlobal.logger.w(lists)
    }

    @JvmStatic fun <T> w(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.w(delimiter, lists)
    }

    @JvmStatic fun w(`object`: Any) {
        NyanCatGlobal.logger.w(`object`)
    }

    @JvmStatic fun w(t: Throwable) {
        NyanCatGlobal.logger.w(t)
    }

    @JvmStatic fun e(t: Throwable) {
        NyanCatGlobal.logger.e(t)
    }

    @JvmStatic fun e(message: String) {
        NyanCatGlobal.logger.e(message)
    }

    @JvmStatic fun e(message: String, vararg args: Any) {
        NyanCatGlobal.logger.e(message, *args)
    }

    @JvmStatic fun e(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.e(t, message, *args)
    }

    @JvmStatic fun <T> e(lists: List<T>) {
        NyanCatGlobal.logger.e(lists)
    }

    @JvmStatic fun <T> e(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.e(delimiter, lists)
    }

    @JvmStatic fun e(`object`: Any) {
        NyanCatGlobal.logger.e(`object`)
    }

    @JvmStatic fun v(message: String) {
        NyanCatGlobal.logger.v(message)
    }

    @JvmStatic fun v(message: String, vararg args: Any) {
        NyanCatGlobal.logger.v(message, *args)
    }

    @JvmStatic fun v(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.v(t, message, *args)
    }

    @JvmStatic fun <T> v(lists: List<T>) {
        NyanCatGlobal.logger.v(lists)
    }

    @JvmStatic fun <T> v(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.v(delimiter, lists)
    }

    @JvmStatic fun v(`object`: Any) {
        NyanCatGlobal.logger.v(`object`)
    }

    @JvmStatic fun tag(tag: String): NyanCatLogger {
        return NyanCatGlobal.tag(tag)
    }
}