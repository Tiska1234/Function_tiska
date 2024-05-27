package com.example.function_saeful

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val angka = findViewById<EditText>(R.id.input)
        val cekBtn = findViewById<Button>(R.id.cekBtn)

        cekBtn.setOnClickListener {
            cekNilai(angka.text.toString().toInt())

        }
    }

    private fun cekNilai(angka: Int) {
        if (angka<75 ) {
            Toast.makeText(this,"Dibawah Rata-Rata",Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this,"Diatas Rata-Rata",Toast.LENGTH_SHORT).show()
        }
    }
}