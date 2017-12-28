package pyxis.uzuki.live.nyancat;

import java.util.List;

/**
 * NyanCat
 * Class: NyanCat
 * Created by Pyxis on 2017-10-30.
 * <p>
 * Description:
 */

@SuppressWarnings("UnusedDeclaration")
public final class NyanCat {

    private NyanCat() {

    }

    public static void d(String message) {
        NyanCatStatic.logger.d(message);
    }

    public static void d(String message, Object... args) {
        NyanCatStatic.logger.d(message, args);
    }

    public static void d(Throwable t, String message, Object... args) {
        NyanCatStatic.logger.d(t, message, args);
    }

    public static <T> void d(List<T> lists) {
        NyanCatStatic.logger.d(lists);
    }

    public static <T> void d(CharSequence delimiter, List<T> lists) {
        NyanCatStatic.logger.d(delimiter, lists);
    }

    public static void d(Object object) {
        NyanCatStatic.logger.d(object);
    }

    public static void i(String message) {
        NyanCatStatic.logger.i(message);
    }

    public static void i(String message, Object... args) {
        NyanCatStatic.logger.i(message, args);
    }

    public static void i(Throwable t, String message, Object... args) {
        NyanCatStatic.logger.i(t, message, args);
    }

    public static <T> void i(List<T> lists) {
        NyanCatStatic.logger.i(lists);
    }

    public static <T> void i(CharSequence delimiter, List<T> lists) {
        NyanCatStatic.logger.i(delimiter, lists);
    }

    public static void i(Object object) {
        NyanCatStatic.logger.i(object);
    }

    public static void w(String message) {
        NyanCatStatic.logger.w(message);
    }

    public static void w(String message, Object... args) {
        NyanCatStatic.logger.w(message, args);
    }

    public static void w(Throwable t, String message, Object... args) {
        NyanCatStatic.logger.w(t, message, args);
    }

    public static <T> void w(List<T> lists) {
        NyanCatStatic.logger.w(lists);
    }

    public static <T> void w(CharSequence delimiter, List<T> lists) {
        NyanCatStatic.logger.w(delimiter, lists);
    }

    public static void w(Object object) {
        NyanCatStatic.logger.w(object);
    }

    public static void w(Throwable t) {
        NyanCatStatic.logger.w(t);
    }

    public static void e(Throwable t) {
        NyanCatStatic.logger.e(t);
    }

    public static void e(String message) {
        NyanCatStatic.logger.e(message);
    }

    public static void e(String message, Object... args) {
        NyanCatStatic.logger.e(message, args);
    }

    public static void e(Throwable t, String message, Object... args) {
        NyanCatStatic.logger.e(t, message, args);
    }

    public static <T> void e(List<T> lists) {
        NyanCatStatic.logger.e(lists);
    }

    public static <T> void e(CharSequence delimiter, List<T> lists) {
        NyanCatStatic.logger.e(delimiter, lists);
    }

    public static void e(Object object) {
        NyanCatStatic.logger.e(object);
    }

    public static void v(String message) {
        NyanCatStatic.logger.v(message);
    }

    public static void v(String message, Object... args) {
        NyanCatStatic.logger.v(message, args);
    }

    public static void v(Throwable t, String message, Object... args) {
        NyanCatStatic.logger.v(t, message, args);
    }

    public static <T> void v(List<T> lists) {
        NyanCatStatic.logger.v(lists);
    }

    public static <T> void v(CharSequence delimiter, List<T> lists) {
        NyanCatStatic.logger.v(delimiter, lists);
    }

    public static void v(Object object) {
        NyanCatStatic.logger.v(object);
    }

    public static NyanCatLogger tag(String tag) {
        return NyanCatStatic.tag(tag);
    }
}
