package pyxis.uzuki.live.nyancatsample;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import java.io.File;

import pyxis.uzuki.live.nyancat.printer.preset.LogFilePrinter;

public class CustomLogFilePrinter extends LogFilePrinter {

    public CustomLogFilePrinter(@NotNull Context context, @NotNull String fileName) {
        super(context, fileName);
    }

    @NotNull
    @Override
    public String getFormatMessage(int priority, @NotNull String tag, @NotNull String message, @org.jetbrains.annotations.Nullable Throwable t) {
        return super.getFormatMessage(priority, tag, message, t);
    }

    @NotNull
    @Override
    public File getLogFile() {
        return super.getLogFile();
    }
}