package com.example.night2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class tanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val cicekAdi = intent.getStringExtra("CICEK_ADI")
        val cicekAdiTextView: TextView = findViewById(R.id.textView5)

        val cicekBilgi = intent.getStringExtra("CICEK_INFO")
        val cicekBilgiTextView: TextView = findViewById(R.id.textView3)

        cicekAdiTextView.text = cicekAdi

        cicekBilgiTextView.text = cicekBilgi


    }
}