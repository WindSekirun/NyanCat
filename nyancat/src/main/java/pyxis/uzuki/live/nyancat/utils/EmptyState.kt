package pyxis.uzuki.live.nyancat.utils

import pyxis.uzuki.live.richutilskt.utils.isEmpty

/**
 * NyanCat
 * Class: Strings
 * Created by Pyxis on 2017-10-30.
 *
 * Description: Extension function of various Type.
 */

const val DEFAULT_EXCEPTION_MSG = ""

fun String.isEmptyDefault(def: String = "") = if (!this.isEmpty()) this else def

fun getDefaultException() = Exception(DEFAULT_EXCEPTION_MSG)