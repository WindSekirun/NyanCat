package pyxis.uzuki.live.nyancatsample;

import android.app.Application;

import pyxis.uzuki.live.nyancat.NyanCatConfig;
import pyxis.uzuki.live.nyancat.NyanCatStatic;
import pyxis.uzuki.live.nyancat.TriggerTiming;

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
        NyanCatConfig config = new NyanCatConfig(getPackageName(), BuildConfig.DEBUG, TriggerTiming.ALL);
        NyanCatStatic.breedNyanCat(config);
    }
}
