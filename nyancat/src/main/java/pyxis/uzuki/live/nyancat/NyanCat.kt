package pyxis.uzuki.live.nyancat

import android.content.Intent
import android.os.Bundle

object NyanCat {

    @JvmStatic
    fun d(message: String) {
        NyanCatGlobal.logger.d(message)
    }

    @JvmStatic
    fun d(message: String, vararg args: Any) {
        NyanCatGlobal.logger.d(message, *args)
    }

    @JvmStatic
    fun d(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.d(t, message, *args)
    }

    @JvmStatic
    fun <T> d(lists: List<T>) {
        NyanCatGlobal.logger.d(lists)
    }

    @JvmStatic
    fun <T> d(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.d(delimiter, lists)
    }

    @JvmStatic
    fun d(`object`: Any) {
        NyanCatGlobal.logger.d(`object`)
    }

    @JvmStatic
    fun <K, V> d(map: Map<K, V>) {
        NyanCatGlobal.logger.d(map)
    }

    @JvmStatic
    fun <K, V> d(delimiter: CharSequence, map: Map<K, V>) {
        NyanCatGlobal.logger.d(delimiter, map)
    }

    @JvmStatic
    fun d(bundle: Bundle) {
        NyanCatGlobal.logger.d(bundle)
    }

    @JvmStatic
    fun d(delimiter: CharSequence, bundle: Bundle) {
        NyanCatGlobal.logger.d(delimiter, bundle)
    }

    @JvmStatic
    fun d(intent: Intent) {
        NyanCatGlobal.logger.d(intent)
    }

    @JvmStatic
    fun d(delimiter: CharSequence, intent: Intent) {
        NyanCatGlobal.logger.d(delimiter, intent)
    }

    @JvmStatic
    fun i(message: String) {
        NyanCatGlobal.logger.i(message)
    }

    @JvmStatic
    fun i(message: String, vararg args: Any) {
        NyanCatGlobal.logger.i(message, *args)
    }

    @JvmStatic
    fun i(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.i(t, message, *args)
    }

    @JvmStatic
    fun <T> i(lists: List<T>) {
        NyanCatGlobal.logger.i(lists)
    }

    @JvmStatic
    fun <T> i(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.i(delimiter, lists)
    }

    @JvmStatic
    fun i(`object`: Any) {
        NyanCatGlobal.logger.i(`object`)
    }

    @JvmStatic
    fun <K, V> i(map: Map<K, V>) {
        NyanCatGlobal.logger.i(map)
    }

    @JvmStatic
    fun <K, V> i(delimiter: CharSequence, map: Map<K, V>) {
        NyanCatGlobal.logger.i(delimiter, map)
    }

    @JvmStatic
    fun i(bundle: Bundle) {
        NyanCatGlobal.logger.i(bundle)
    }

    @JvmStatic
    fun i(delimiter: CharSequence, bundle: Bundle) {
        NyanCatGlobal.logger.i(delimiter, bundle)
    }

    @JvmStatic
    fun i(intent: Intent) {
        NyanCatGlobal.logger.i(intent)
    }

    @JvmStatic
    fun i(delimiter: CharSequence, intent: Intent) {
        NyanCatGlobal.logger.i(delimiter, intent)
    }

    @JvmStatic
    fun w(message: String) {
        NyanCatGlobal.logger.w(message)
    }

    @JvmStatic
    fun w(message: String, vararg args: Any) {
        NyanCatGlobal.logger.w(message, *args)
    }

    @JvmStatic
    fun w(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.w(t, message, *args)
    }

    @JvmStatic
    fun <T> w(lists: List<T>) {
        NyanCatGlobal.logger.w(lists)
    }

    @JvmStatic
    fun <T> w(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.w(delimiter, lists)
    }

    @JvmStatic
    fun w(`object`: Any) {
        NyanCatGlobal.logger.w(`object`)
    }

    @JvmStatic
    fun w(t: Throwable) {
        NyanCatGlobal.logger.w(t)
    }

    @JvmStatic
    fun <K, V> w(map: Map<K, V>) {
        NyanCatGlobal.logger.w(map)
    }

    @JvmStatic
    fun <K, V> w(delimiter: CharSequence, map: Map<K, V>) {
        NyanCatGlobal.logger.w(delimiter, map)
    }

    @JvmStatic
    fun w(bundle: Bundle) {
        NyanCatGlobal.logger.w(bundle)
    }

    @JvmStatic
    fun w(delimiter: CharSequence, bundle: Bundle) {
        NyanCatGlobal.logger.w(delimiter, bundle)
    }

    @JvmStatic
    fun w(intent: Intent) {
        NyanCatGlobal.logger.w(intent)
    }

    @JvmStatic
    fun w(delimiter: CharSequence, intent: Intent) {
        NyanCatGlobal.logger.w(delimiter, intent)
    }

    @JvmStatic
    fun e(t: Throwable) {
        NyanCatGlobal.logger.e(t)
    }

    @JvmStatic
    fun e(message: String) {
        NyanCatGlobal.logger.e(message)
    }

    @JvmStatic
    fun e(message: String, vararg args: Any) {
        NyanCatGlobal.logger.e(message, *args)
    }

    @JvmStatic
    fun e(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.e(t, message, *args)
    }

    @JvmStatic
    fun <T> e(lists: List<T>) {
        NyanCatGlobal.logger.e(lists)
    }

    @JvmStatic
    fun <T> e(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.e(delimiter, lists)
    }

    @JvmStatic
    fun e(`object`: Any) {
        NyanCatGlobal.logger.e(`object`)
    }

    @JvmStatic
    fun <K, V> e(map: Map<K, V>) {
        NyanCatGlobal.logger.e(map)
    }

    @JvmStatic
    fun <K, V> e(delimiter: CharSequence, map: Map<K, V>) {
        NyanCatGlobal.logger.e(delimiter, map)
    }

    @JvmStatic
    fun e(bundle: Bundle) {
        NyanCatGlobal.logger.e(bundle)
    }

    @JvmStatic
    fun e(delimiter: CharSequence, bundle: Bundle) {
        NyanCatGlobal.logger.e(delimiter, bundle)
    }

    @JvmStatic
    fun e(intent: Intent) {
        NyanCatGlobal.logger.e(intent)
    }

    @JvmStatic
    fun e(delimiter: CharSequence, intent: Intent) {
        NyanCatGlobal.logger.e(delimiter, intent)
    }

    @JvmStatic
    fun v(message: String) {
        NyanCatGlobal.logger.v(message)
    }

    @JvmStatic
    fun v(message: String, vararg args: Any) {
        NyanCatGlobal.logger.v(message, *args)
    }

    @JvmStatic
    fun v(t: Throwable, message: String, vararg args: Any) {
        NyanCatGlobal.logger.v(t, message, *args)
    }

    @JvmStatic
    fun <T> v(lists: List<T>) {
        NyanCatGlobal.logger.v(lists)
    }

    @JvmStatic
    fun <T> v(delimiter: CharSequence, lists: List<T>) {
        NyanCatGlobal.logger.v(delimiter, lists)
    }

    @JvmStatic
    fun v(`object`: Any) {
        NyanCatGlobal.logger.v(`object`)
    }

    @JvmStatic
    fun <K, V> v(map: Map<K, V>) {
        NyanCatGlobal.logger.v(map)
    }

    @JvmStatic
    fun <K, V> v(delimiter: CharSequence, map: Map<K, V>) {
        NyanCatGlobal.logger.v(delimiter, map)
    }

    @JvmStatic
    fun v(bundle: Bundle) {
        NyanCatGlobal.logger.v(bundle)
    }

    @JvmStatic
    fun v(delimiter: CharSequence, bundle: Bundle) {
        NyanCatGlobal.logger.v(delimiter, bundle)
    }

    @JvmStatic
    fun v(intent: Intent) {
        NyanCatGlobal.logger.v(intent)
    }

    @JvmStatic
    fun v(delimiter: CharSequence, intent: Intent) {
        NyanCatGlobal.logger.v(delimiter, intent)
    }

    @JvmStatic
    fun tag(tag: String): NyanCatLogger {
        return NyanCatGlobal.tag(tag)
    }
}