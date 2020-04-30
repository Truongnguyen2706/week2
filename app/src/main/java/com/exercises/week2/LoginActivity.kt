package com.exercises.week2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login.*
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        textView5.setOnClickListener{
            startActivity(Intent(this,SignUpActivity::class.java))
        }
        button3.setOnClickListener{
            Toast.makeText(this, "Successful!", Toast.LENGTH_LONG).show()
        }
    }


}