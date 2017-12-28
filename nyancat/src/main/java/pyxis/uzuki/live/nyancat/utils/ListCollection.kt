package pyxis.uzuki.live.nyancat.utils

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
        builder.append("position %s → %s%s".format(i, item.toString(), delimiter))
    }
    return builder.toString()
}