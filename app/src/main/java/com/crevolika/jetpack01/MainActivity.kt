package com.crevolika.jetpack01

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.compose.ui.semantics.text
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.crevolika.jetpack01.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
            .into(myImageView)
        val text = "Practice makes progress. Start now!"
        val spannableString = SpannableString(text)

        val start = 25 // Start index of the text portion
        val end = 35  // End index of the text portion
        val color = Color.RED // Color for the text portion

        val colorSpan = ForegroundColorSpan(color)
        spannableString.setSpan(colorSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Find the TextView by its ID
        val sampleSpanColorTextView: TextView = findViewById(R.id.sampleSpanColorTextView)

        // Now you can set the text
        sampleSpanColorTextView.text = spannableString

        val text2 = "Never give up on learning"
        val spannableString2 = SpannableString(text2)

        val start2 = 0 // Start index of the text portion
        val end2 = text2.length   // End index of the text portion
        val bgColor = Color.YELLOW // Background color for the text portion

        val bgColorSpan = BackgroundColorSpan(bgColor)
        spannableString2.setSpan(bgColorSpan, start2, end2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        binding.sampleSpanBackgroundTV.text = spannableString2
 /*       val text = "Click me for an action"
        val spannableString = SpannableString(text)

        val start = 0 // Start index of the text portion
        val end = text.length // End index of the text portion

        // Define the action to be performed when the text is clicked
        val clickableSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                // Action to perform when the text is clicked
                Toast.makeText(requireContext(), "Text Clicked!", Toast.LENGTH_SHORT).show()
            }
        }

        spannableString.setSpan(clickableSpan, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Enable clickable behavior on the TextView
        binding.sampleSpanClickableTV.movementMethod =
            android.text.method.LinkMovementMethod.getInstance()
        binding.sampleSpanClickableTV.text = spannableString
*/

    }
}