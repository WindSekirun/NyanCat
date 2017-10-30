package pyxis.uzuki.live.nyancat;

import android.util.Log;

import java.util.ArrayList;

import pyxis.uzuki.live.nyancat.printer.CatPrinter;
import pyxis.uzuki.live.nyancat.utils.EmptyStateKt;

/**
 * NyanCat
 * Class: NyanCatLogger
 * Created by Pyxis on 2017-10-30.
 * <p>
 * Description:
 */

public abstract class NyanCatLogger {

    protected abstract ArrayList<CatPrinter> getPrinters();

    protected abstract String getTag();

    public abstract void addPrinter(CatPrinter printer);

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

    public void i(String message) {
        println(Log.INFO, message, null);
    }

    public void i(String message, Object... args) {
        println(Log.INFO, format(message, args), null);
    }

    public void i(Throwable t, String message, Object... args) {
        println(Log.INFO, format(message, args), t);
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

    public void v(String message) {
        println(Log.VERBOSE, message, null);
    }

    public void v(String message, Object... args) {
        println(Log.VERBOSE, format(message, args), null);
    }

    public void v(Throwable t, String message, Object... args) {
        println(Log.VERBOSE, format(message, args), t);
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
