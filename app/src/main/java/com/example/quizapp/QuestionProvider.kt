package com.example.quizapp

import com.example.quizapp.model.Question

class QuestionProvider {
    public fun getQuestions(): List<Question> {
        val questionList = listOf(
            Question(
                1,
                "What is the largest land animal in the world ?",
                "Elephant",
                "Blue Whale",
                "Rino",
                "Hipo",
                "Elephant"
            ),
            Question(
                2,
                "What is the capital of Brazil ?",
                "Sao Paulo",
                "Brasilia",
                "Rio de janeiro",
                "Belo Horizonte",
                "Brasilia"
            ),
            Question(
                3,
                "What is the only gemstone formed by a living organism?",
                "Sapphire",
                "Diamond",
                "Amber",
                "Pearl",
                "Pearl"
            ),
            Question(
                4,
                "In what year did the Berlin wall fall ?",
                "1989",
                "1991",
                "1985",
                "1995",
                "1989"
            ),
            Question(
                5,
                "What is the largest planet in the Solar System ?",
                "Earth",
                "Saturn",
                "Jupiter",
                "Uranus",
                "Jupiter"
            ),
            Question(
                6,
                "Who wrote The Little Prince ?",
                "Antoine de Saint-Exupéry",
                "Jorge Amado",
                "Machado de Assis",
                "Carlos Drummond de Andrade",
                "Antoine de Saint-Exupéry"
            ),
            Question(
                7,
                "What is the smallest country in the world in terms of land area ?",
                "Monaco",
                "San Marino",
                "Liechtenstein",
                "Vatican City",
                "Vatican City"
            ),
            Question(
                8,
                "Who was the first person to step on the Moon?",
                "Neil Armstrong",
                "Buzz Aldrin",
                "Yuri Gagarin",
                "Alan Shepard",
                "Neil Armstrong"
            ),
            Question(
                9,
                "Who painted the Mona Lisa ?",
                "Pablo Picasso",
                "Leonardo da Vinci",
                "Michelangelo",
                "Salvador Dali",
                "Leonardo da Vinci"
            ),
            Question(
                10,
                "Which country has the largest population in the world ?",
                "Russia",
                "India",
                "China",
                "United States",
                "China"
            ),
            Question(
                11,
                "Which famous scientist developed the theory of relativity ?",
                "Isaac Newton",
                "Albert Einstein",
                "Galileo Galilei",
                "Charles Darwin",
                "Albert Einstein"
            )
        )
        return questionList.shuffled()
    }
}