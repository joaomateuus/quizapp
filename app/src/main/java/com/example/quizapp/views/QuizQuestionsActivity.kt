package com.example.quizapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.R

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}