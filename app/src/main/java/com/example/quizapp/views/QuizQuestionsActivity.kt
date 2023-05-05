package com.example.quizapp.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.core.os.HandlerCompat
import com.example.quizapp.R
import com.example.quizapp.QuestionProvider
import com.example.quizapp.model.Question

class QuizQuestionsActivity : AppCompatActivity() {
    private var currentIndex: Int = 0
    private var missedOptions: Int = 0
    private lateinit var questionList: List<Question>
    private lateinit var question: TextView
    private lateinit var optionOne: Button
    private lateinit var optionTwo: Button
    private lateinit var optionThree: Button
    private lateinit var optionFour: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
    }

    override fun onStart() {
        super.onStart()

        questionList = QuestionProvider().getQuestions()

        question = findViewById(R.id.question)
        optionOne = findViewById(R.id.option_one)
        optionTwo = findViewById(R.id.option_two)
        optionThree = findViewById(R.id.option_three)
        optionFour = findViewById(R.id.option_four)

        setupQuestions()

        optionOne.setOnClickListener {
            if (optionOne.text.toString() === questionList[currentIndex].correctAnswer) {
                optionOne.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                HandlerCompat.createAsync(mainLooper).postDelayed({
                    keepPlayingOrGetScore()
                }, 1000)

            } else {
                optionOne.backgroundTintList = getColorStateList(android.R.color.holo_red_dark)
                checkIfLostAllOptions(listOf(optionOne, optionTwo, optionThree, optionFour))
            }
        }

        optionTwo.setOnClickListener {
            if (optionTwo.text.toString() === questionList[currentIndex].correctAnswer) {

                optionTwo.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                HandlerCompat.createAsync(mainLooper).postDelayed({
                    keepPlayingOrGetScore()
                }, 1000)

            } else {
                Log.i("valor", optionTwo.text.toString())
                optionTwo.backgroundTintList = getColorStateList(android.R.color.holo_red_dark)
                checkIfLostAllOptions(listOf(optionOne, optionTwo, optionThree, optionFour))
            }
        }

        optionThree.setOnClickListener {
            if (optionThree.text.toString() === questionList[currentIndex].correctAnswer) {
                optionThree.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                HandlerCompat.createAsync(mainLooper).postDelayed({
                    keepPlayingOrGetScore()
                }, 1000)

            } else {
                optionThree.backgroundTintList = getColorStateList(android.R.color.holo_red_dark)
                checkIfLostAllOptions(listOf(optionOne, optionTwo, optionThree, optionFour))
            }
        }

        optionFour.setOnClickListener {
            if (optionFour.text.toString() === questionList[currentIndex].correctAnswer) {
                optionFour.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                HandlerCompat.createAsync(mainLooper).postDelayed({
                    keepPlayingOrGetScore()
                }, 1000)
            } else {
                optionFour.backgroundTintList = getColorStateList(android.R.color.holo_red_dark)
                checkIfLostAllOptions(listOf(optionOne, optionTwo, optionThree, optionFour))
            }
        }


    }

    private fun setupQuestions() {
        question.text = questionList[currentIndex].question
        optionOne.text = questionList[currentIndex].firstOption
        optionTwo.text = questionList[currentIndex].secondOption
        optionThree.text = questionList[currentIndex].thirdOption
        optionFour.text = questionList[currentIndex].fourthOption
    }

    private fun resetBg() {
        optionOne.backgroundTintList = getColorStateList(android.R.color.white)
        optionTwo.backgroundTintList = getColorStateList(android.R.color.white)
        optionThree.backgroundTintList = getColorStateList(android.R.color.white)
        optionFour.backgroundTintList = getColorStateList(android.R.color.white)
    }

    private fun checkIfLostAllOptions(buttonsList: List<Button>) {
        missedOptions++
        if (missedOptions === 3) {
            for (i in buttonsList) {
                if (i.text.toString() === questionList[currentIndex].correctAnswer) {
                    i.backgroundTintList = getColorStateList(android.R.color.holo_green_dark)
                }
            }
            missedOptions = 0
            HandlerCompat.createAsync(mainLooper).postDelayed({
                keepPlayingOrGetScore()
            }, 2000)
        }
    }

    private fun keepPlayingOrGetScore() {
        if (currentIndex < questionList.size - 1) {
            currentIndex++
            setupQuestions()
            resetBg()
        } else {
            println("JOGO ACABOU")
        }
    }
}