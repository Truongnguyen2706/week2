package com.exercises.week2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        textView5.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }
        button3.setOnClickListener{
            Toast.makeText(this, "Successful!", Toast.LENGTH_LONG).show()
        }
    }


}