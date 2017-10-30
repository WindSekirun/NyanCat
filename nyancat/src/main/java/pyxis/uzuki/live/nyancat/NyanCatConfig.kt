package pyxis.uzuki.live.nyancat

/**
 * NyanCat
 * Class: NyanCatConfig
 * Created by Pyxis on 2017-10-30.
 *
 * Description:
 */

data class NyanCatConfig(val packageName: String, val debug: Boolean = false, val debuggable: TriggerTiming = TriggerTiming.ALL)

enum class TriggerTiming {
    ONLY_DEBUG, ALL
}