package com.example.quizapp.model

data class Question(
    val id: Int,
    val question: String,
    val firstOption: String,
    val secondOption: String,
    val thirdOption: String,
    val fourthOption: String,
    val correctAnswer: String
)

