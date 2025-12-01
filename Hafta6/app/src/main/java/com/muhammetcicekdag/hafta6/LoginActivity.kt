package com.muhammetcicekdag.hafta6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val username_edittext = findViewById<EditText>(R.id.editTextUserName)
        val pasword_edittext = findViewById<EditText>(R.id.editTextPasword)
        val loginbutton = findViewById<Button>(R.id.buttonLogin)
        val registerLinkView = findViewById<TextView>(R.id.textViewRegisterLink)
        loginbutton.setOnClickListener {
            val username = username_edittext.text.toString()
            val pasword = pasword_edittext.text.toString()

            if (username == "ADMİN" && pasword == "1234") {
                Toast.makeText(this, getString(R.string.but_succes),  Toast.LENGTH_LONG).show()
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)


            }
            else
            {
                Toast.makeText(this, getString(R.string.login_error),  Toast.LENGTH_LONG).show()

            }



        }

    }
}


