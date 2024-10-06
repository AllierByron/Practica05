package com.example.practica05

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mail: EditText
    private lateinit var password: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.eTxtUsuario);
        password = findViewById(R.id.eTxtPassword);
    }

    fun ingresarMenu(view: View?){
        val usr = mail.text.toString().trim()
        val con = password.text.toString().trim()
        if(usr.equals("admin") && con.equals("12345")){
            val intent = Intent(this,MenuLateralActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Datos incorrectos, intente de nuevo.", Toast.LENGTH_SHORT).show()
        }
    }//ingresarMenu


    fun salirMenu(view: View?) {
        finish()
    }
}