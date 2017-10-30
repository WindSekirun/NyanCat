package pyxis.uzuki.live.nyancatsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_sample.*
import pyxis.uzuki.live.nyancat.NyanCat
import pyxis.uzuki.live.nyancat.NyanCatStatic
import pyxis.uzuki.live.nyancat.printer.CatPrinter

/**
 * NyanCat
 * Class: KotlinActivity
 * Created by Pyxis on 2017-10-30.
 *
 * Description:
 */
class KotlinActivity : AppCompatActivity() {

    private val catPrinter = object : CatPrinter {
        override fun println(priority: Int, tag: String, message: String, t: Throwable?) {
            var newMessage = message
            if (t != null)
                newMessage += '\n' + Log.getStackTraceString(t)

            txtLogText.text = "${txtLogText.text}\n$newMessage"
            scrollView.post { scrollView.fullScroll(View.FOCUS_DOWN) }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        Glide.with(this).asGif().load(R.drawable.original).into(imageNyanCat)

        NyanCatStatic.logger.addPrinter(catPrinter)

        imageNyanCat.setOnClickListener {
            NyanCat.tag("NyanCatSample").e("message is %s", "nya!");
        }

        try {
            throw NullPointerException("easd")
        } catch (e: Exception) {
            NyanCat.e(e, "try-catch")
        }

    }
}