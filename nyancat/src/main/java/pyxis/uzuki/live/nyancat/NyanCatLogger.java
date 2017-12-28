package pyxis.uzuki.live.nyancat;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import pyxis.uzuki.live.nyancat.printer.CatLoggerPrinter;
import pyxis.uzuki.live.nyancat.utils.EmptyStateKt;
import pyxis.uzuki.live.nyancat.utils.ListCollectionKt;

import static pyxis.uzuki.live.nyancat.utils.ListCollectionKt.toListString;

/**
 * NyanCat
 * Class: NyanCatLogger
 * Created by Pyxis on 2017-10-30.
 * <p>
 * Description:
 */

public abstract class NyanCatLogger {

    protected abstract ArrayList<CatLoggerPrinter> getPrinters();

    protected abstract ArrayList<CatLoggerPrinter> getAddedPrinters();

    protected abstract String getTag();

    public abstract void addPrinter(CatLoggerPrinter printer);

    public abstract void clearPrinter();

    public void d(String message) {
        println(Log.DEBUG, message, null);
    }

    public void d(String message, Object... args) {
        println(Log.DEBUG, format(message, args), null);
    }

    public void d(Throwable t, String message, Object... args) {
        println(Log.DEBUG, format(message, args), t);
    }

    public <T> void d(List<T> lists) {
        println(Log.DEBUG, toListString(lists), null);
    }

    public <T> void d(CharSequence delimiter, List<T> lists) {
        println(Log.DEBUG, toListString(lists, delimiter), null);
    }

    public void d(Object object) {
        println(Log.DEBUG, object.toString(), null);
    }

    public void i(String message) {
        println(Log.INFO, message, null);
    }

    public void i(String message, Object... args) {
        println(Log.INFO, format(message, args), null);
    }

    public void i(Throwable t, String message, Object... args) {
        println(Log.INFO, format(message, args), t);
    }

    public <T> void i(List<T> lists) {
        println(Log.INFO, toListString(lists), null);
    }

    public <T> void i(CharSequence delimiter, List<T> lists) {
        println(Log.INFO, toListString(lists, delimiter), null);
    }

    public void i(Object object) {
        println(Log.INFO, object.toString(), null);
    }

    public void w(String message) {
        println(Log.WARN, message, null);
    }

    public void w(String message, Object... args) {
        println(Log.WARN, format(message, args), null);
    }

    public void w(Throwable t, String message, Object... args) {
        println(Log.WARN, format(message, args), t);
    }

    public void w(Throwable t) {
        if (t == null) {
            t = EmptyStateKt.getDefaultException();
        }
        println(Log.WARN, t.getMessage(), t);
    }

    public <T> void w(List<T> lists) {
        println(Log.WARN, toListString(lists), null);
    }

    public <T> void w(CharSequence delimiter, List<T> lists) {
        println(Log.WARN, toListString(lists, delimiter), null);
    }

    public void w(Object object) {
        println(Log.WARN, object.toString(), null);
    }

    public void e(Throwable t) {
        if (t == null) {
            t = EmptyStateKt.getDefaultException();
        }
        println(Log.ERROR, t.getMessage(), t);
    }

    public void e(String message) {
        println(Log.ERROR, message, null);
    }

    public void e(String message, Object... args) {
        println(Log.ERROR, format(message, args), null);
    }

    public void e(Throwable t, String message, Object... args) {
        println(Log.ERROR, format(message, args), t);
    }

    public <T> void e(List<T> lists) {
        println(Log.ERROR, toListString(lists), null);
    }

    public <T> void e(CharSequence delimiter, List<T> lists) {
        println(Log.ERROR, toListString(lists, delimiter), null);
    }

    public void e(Object object) {
        println(Log.ERROR, object.toString(), null);
    }

    public void v(String message) {
        println(Log.VERBOSE, message, null);
    }

    public void v(String message, Object... args) {
        println(Log.VERBOSE, format(message, args), null);
    }

    public void v(Throwable t, String message, Object... args) {
        println(Log.VERBOSE, format(message, args), t);
    }

    public <T> void v(List<T> lists) {
        println(Log.VERBOSE, toListString(lists), null);
    }

    public <T> void v(CharSequence delimiter, List<T> lists) {
        println(Log.VERBOSE, toListString(lists, delimiter), null);
    }

    public void v(Object object) {
        println(Log.VERBOSE, object.toString(), null);
    }

    protected void println(int priority, String message, Throwable t) {
        String newMessage = EmptyStateKt.isEmptyDefault(message, "empty");
        NyanCatStatic.print(priority, getTag(), newMessage, t, getPrinters());
    }

    private static String format(String message, Object[] args) {
        if (message == null) {
            return "null";
        } else {
            return String.format(message, args);
        }
    }
}
