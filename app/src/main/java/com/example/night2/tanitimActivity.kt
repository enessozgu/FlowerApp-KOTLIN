package com.example.night2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.night2.databinding.ActivityTanitimBinding

@Suppress("DEPRECATION")
class tanitimActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim= ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val cicekAdi = intent.getStringExtra("CICEK_ADI")
        val cicekAdiTextView: TextView = findViewById(R.id.textView5)

        val cicekBilgi = intent.getStringExtra("CICEK_INFO")
        val cicekBilgiTextView: TextView = findViewById(R.id.textView3)

        cicekAdiTextView.text = cicekAdi

        cicekBilgiTextView.text = cicekBilgi






    }
}