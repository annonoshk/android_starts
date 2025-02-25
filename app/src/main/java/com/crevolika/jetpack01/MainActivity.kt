package com.crevolika.jetpack01

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Callback
import com.squareup.picasso.MemoryPolicy
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.BlurTransformation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val myImageView: ImageView = findViewById(R.id.image)
        val logoUrl = "https://resources.jetbrains.com/storage/products/intellij-idea/img/meta/intellij-idea_logo_300x300.png"

        Picasso.get()
            .load(logoUrl)
            .fit().centerCrop()
            .rotate(90.0f)
            .transform(BlurTransformation(this))
            .into(myImageView)

/*        Picasso.get()
            .load(logoUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(myImageView)*/

        // callback
/*        Picasso.get()
            .load(logoUrl)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .into(myImageView, object : Callback {
                override fun onSuccess() {
                    Toast.makeText(this@MainActivity, "Success!", Toast.LENGTH_SHORT)
                        .show()
                }
                override fun onError(e: Exception?) {
                    Toast.makeText(this@MainActivity, "Error!", Toast.LENGTH_SHORT)
                        .show()
                }
            })*/
            // no cache, no store, Offline
/*            .networkPolicy(NetworkPolicy.NO_CACHE, NetworkPolicy.NO_STORE)
            .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)*/

        //setSpan(Object span, int start, int end, int flags)
        val text = "Practice makes progress. Start now!"
        val spannableString = SpannableString(text)

        val start = 25 // Start index of the text portion
        val end = 35  // End index of the text portion
        val color = Color.RED // Color for the text portion

        val colorSpan = ForegroundColorSpan(color)
        spannableString.setSpan(colorSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        sampleSpanColorTextView.text = spannableString //sets text to TextView

    }
}