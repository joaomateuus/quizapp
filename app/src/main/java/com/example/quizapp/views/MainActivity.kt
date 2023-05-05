package com.example.quizapp.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quizapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart();
        val startButton = findViewById<Button>(R.id.btn_start)
        val userName = findViewById<EditText>(R.id.user_name)

        startButton.setOnClickListener {
            if(userName.text.toString().isEmpty()){
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, QuizQuestionsActivity::class.java))
            }
        }
    }
}