package com.thiago.sesion3_dami.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.thiago.sesion3_dami.R
import com.thiago.sesion3_dami.model.User

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txtUser = findViewById<EditText>(R.id.txtUser)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = txtUser.text.toString()
            val password = txtPassword.text.toString()

            if (User.getUsers().any { it.user == user && it.password == password }){
                val intent = Intent(this, TiendaActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Bad Credentials", Toast.LENGTH_SHORT).show()
            }
        }

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}