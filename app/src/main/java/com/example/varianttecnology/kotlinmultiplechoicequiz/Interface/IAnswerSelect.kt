package com.example.varianttecnology.kotlinmultiplechoicequiz.Interface

import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.CurrentQuestion

interface IAnswerSelect {
    fun selectedAnswer():CurrentQuestion
    fun showCorrectAnswer()
    fun disableAnswer()
    fun resetQuestion()
}