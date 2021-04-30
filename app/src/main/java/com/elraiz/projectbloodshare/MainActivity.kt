package com.elraiz.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//NIM      :10118018
//Nama     :Irman Novryansah
//Kelas    :IF-1
//Tanggal  : 01/05/2021
// Pembuatan halaman utama form registrasi
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicktext = findViewById<TextView>(R.id.txt_homeregister)
        clicktext.setOnClickListener{
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }
    }
}
