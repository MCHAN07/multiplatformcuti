package com.bsm.multiplatformcuti.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.bsm.multiplatformcuti.getHelloWorld // Mengimpor fungsi dari modul shared

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cari button berdasarkan id
        val buttonHello: Button = findViewById(R.id.buttonHello)

        buttonHello.setOnClickListener {
            // Panggil fungsi dari modul shared
            val message = getHelloWorld()

            // Tampilkan pesan dengan Toast
            Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
        }
    }
}
