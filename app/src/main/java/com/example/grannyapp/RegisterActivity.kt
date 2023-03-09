package com.example.grannyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnReg : Button = findViewById(R.id.btnReg)
        val name : EditText = findViewById(R.id.txtName)
        val userN : EditText = findViewById(R.id.txtRegUsername)
        val pass : EditText = findViewById(R.id.txtRegPassword)


        btnReg.setOnClickListener(){
            val d =  DB()
            d.strName = name.toString()
            d.strUsername = userN.toString()
            d.strPassword = pass.toString()

            val arrayList = arrayOf(d)


            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()
            // Take to register screen
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("ArrDB", arrayList) // crashes program when it gets to the next line???
            startActivity(intent)
        }
    }
}