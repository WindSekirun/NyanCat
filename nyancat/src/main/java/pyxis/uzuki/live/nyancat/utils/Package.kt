package pyxis.uzuki.live.nyancat.utils

import pyxis.uzuki.live.nyancat.NyanCatGlobal


/**
 * NyanCat
 * Class: Package
 * Created by Pyxis on 2017-10-30.
 *
 * Description: get ClassName / PackageName for calling instance
 */

fun String.simpleClassName(): String {
    val split = this.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    return if (split.isEmpty()) {
        this
    } else {
        val str = split[split.size - 1]
        if (str.contains('$')) {
            str.substring(0, str.indexOfFirst { it == '$' })
        } else {
            str
        }
    }
}

fun getClassName(): String {
    val stackTrace = Thread.currentThread().stackTrace
    val packageName = NyanCatGlobal.getPackageName()
    stackTrace.forEach {
        val className = it.className
        if (className.contains(packageName, false)) {
            return className
        }
    }

    return "Nyanyanyanyanyanyanya!"
}