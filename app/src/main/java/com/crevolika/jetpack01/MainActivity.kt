package com.crevolika.jetpack01

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton
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
        setContentView(R.layout.checked_layout)
/*        findViewById<CheckBox>(R.id.checkBoxFries)
            .setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    // Checkbox is checked, implement the desired behavior here
                } else {
                    // Checkbox is unchecked, implement a different behavior here
                }
            }

        findViewById<CheckBox>(R.id.checkBoxSalad)
            .setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    // Checkbox is checked, implement the desired behavior here
                } else {
                    // Checkbox is unchecked, implement a different behavior here
                }
            }*/

        findViewById<Switch>(R.id.switchElement).setOnCheckedChangeListener { _, isChecked ->
            Log.d("CHECKBOXES", "Switch: $isChecked")
        }

        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // ToggleButton is turned on, implement the desired behavior here
            } else {
                // ToggleButton is turned off, implement a different behavior here
            }
        }

        findViewById<RadioGroup>(R.id.radioGroup).setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioA -> {
                    // radio button A is selected, implement the desired behavior here
                }
                R.id.radioB -> {
                    // radio button B is selected, implement a different behavior here
                }
                R.id.radioC -> {
                    // radio button C is selected, implement another behavior here
                }
            }
        }
        /*        enableEdgeToEdge()
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

                binding.sampleSpanBackgroundTV.text = spannableString2*/
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