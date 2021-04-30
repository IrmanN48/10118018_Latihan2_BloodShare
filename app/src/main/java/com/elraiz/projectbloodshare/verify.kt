package com.elraiz.projectbloodshare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//NIM      :10118018
//Nama     :Irman Novryansah
//Kelas    :IF-1
//Tanggal  : 01/05/2021

class verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val button = findViewById<Button>(R.id.btn_verifysend)
        button.setOnClickListener{
            val intent = Intent(this,profil::class.java)
            startActivity(intent)
        }
    }
}
