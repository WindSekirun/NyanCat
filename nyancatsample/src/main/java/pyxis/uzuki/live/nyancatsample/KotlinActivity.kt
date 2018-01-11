package pyxis.uzuki.live.nyancatsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_sample.*
import pyxis.uzuki.live.nyancat.NyanCat
import pyxis.uzuki.live.nyancat.NyanCatGlobal
import pyxis.uzuki.live.nyancat.printer.CatLoggerPrinter

/**
 * NyanCat
 * Class: KotlinActivity
 * Created by Pyxis on 2017-10-30.
 *
 * Description:
 */
class KotlinActivity : AppCompatActivity() {

    private val catPrinter = object : CatLoggerPrinter {
        override fun println(priority: Int, tag: String, message: String, t: Throwable?) {
            val builder = StringBuilder()
            builder.append("tag = ")
                    .append(tag)
                    .append(" message = ")
                    .append(message)

            if (t != null) {
                builder.append(Log.getStackTraceString(t))
            }

            txtLogText.text = txtLogText.text.toString() + "\n" + builder.toString()
            scrollView.post { scrollView.fullScroll(View.FOCUS_DOWN) }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        Glide.with(this).asGif().load(R.drawable.original).into(imageNyanCat)

        NyanCatGlobal.addPrinter(catPrinter)

        imageNyanCat.setOnClickListener {
            NyanCat.tag("NyanCatSample").e("message is %s", "nya!")
        }

        txtLogText.text = "==========="

//        val arrays = arrayListOf("A", "B", "C")
//        NyanCat.d(arrays)
//        NyanCat.d(1)

        val bundle = Bundle()
        bundle.putString("A", "B")

        val intent = Intent()
        intent.putExtra("A", "Intent")
        NyanCat.d(bundle)
        NyanCat.d(intent)
    }
}