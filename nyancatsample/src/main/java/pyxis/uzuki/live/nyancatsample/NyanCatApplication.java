package pyxis.uzuki.live.nyancatsample;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import pyxis.uzuki.live.nyancat.NyanCatStatic;
import pyxis.uzuki.live.nyancat.config.NyanCatConfig;
import pyxis.uzuki.live.nyancat.config.TriggerTiming;
import pyxis.uzuki.live.nyancat.printer.LogFilePrinter;

/**
 * NyanCat
 * Class: NyanCatApplication
 * Created by Pyxis on 2017-10-30.
 * <p>
 * Description:
 */

public class NyanCatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        List<LogFilePrinter> printerList = new ArrayList<>();
        printerList.add(new CustomLogFilePrinter(this, "log.txt"));

        NyanCatConfig config = new NyanCatConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
        NyanCatStatic.breedNyanCat(config, printerList);
    }
}
