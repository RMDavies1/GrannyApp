package com.example.grannyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton : Button = findViewById(R.id.btnRegister)
        val loginButton : Button = findViewById(R.id.btnLogin)

        registerButton.setOnClickListener()
        {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()
            // Take to register screen
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener()
        {
            val errorMessage = "Please Register first!"
            val txtUsername:EditText = findViewById(R.id.txtUsername)
            val txtPassword:EditText = findViewById(R.id.txtPassword)
            var found: Boolean = false

            Login().AddOldUsers()
            var isAllowed:Boolean =Login().CheckUser(txtUsername.text.toString(), txtPassword.text.toString())
            if (isAllowed){
                val intent=Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this, "Wrong details entered", Toast.LENGTH_SHORT).show()
            }



        }
    }
}