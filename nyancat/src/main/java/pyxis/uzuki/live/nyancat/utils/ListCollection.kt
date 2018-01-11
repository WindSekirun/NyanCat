package pyxis.uzuki.live.nyancat.utils

import android.content.Intent
import android.os.Bundle

/**
 * NyanCat
 * Class: ListCollection
 * Created by Pyxis on 2017-12-28.
 *
 * Description:
 */

@JvmOverloads
fun <T> toListString(lists: List<T>, delimiter: CharSequence = "\n"): String {
    val builder = StringBuilder()
    for (i in 0 until lists.size) {
        val item = lists[i]
        builder.append("[$i] → [${item.toString()}]$delimiter")
    }
    return builder.toString()
}

@JvmOverloads
fun <K, V> toMapString(map: Map<K, V>, delimiter: CharSequence = "\n"): String {
    val builder = StringBuilder()
    val lists = map.entries.toList()
    (0 until lists.size)
            .map { lists[it] }
            .forEach { builder.append("[${it.key}] -> [${it.value}]$delimiter") }
    return builder.toString()
}

@JvmOverloads
fun toBundleString(bundle: Bundle, delimiter: CharSequence = "\n"): String {
    return toMapString(bundle.toMap(), delimiter)
}

@JvmOverloads
fun toIntentString(intent: Intent, delimiter: CharSequence = "\n"): String {
    return toBundleString(intent.extras, delimiter)
}

private fun Bundle.toMap(): HashMap<String, Any> = hashMapOf<String, Any>().apply {
    val keySet = keySet()
    for (item in keySet) {
        put(item, this@toMap.get(item))
    }
}