package pyxis.uzuki.live.nyancatsample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // image resource come from http://www.nyan.cat
        Glide.with(this).asGif().load(R.drawable.original).into(imageNyanCat)

        btnKotlin.setOnClickListener {
            startActivity(Intent(this, KotlinActivity::class.java))
        }

        btnJava.setOnClickListener {

        }
    }
}