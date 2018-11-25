package com.example.varianttecnology.kotlinmultiplechoicequiz.Common

import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.Category
import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.CurrentQuestion
import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.Question
import com.example.varianttecnology.kotlinmultiplechoicequiz.QuestionFragment

object Common {

    val TOTAL_TIME = 20*60*1000 //20min
    var answerSheetListFiltered:MutableList<CurrentQuestion> = ArrayList()
    var answerSheetList:MutableList<CurrentQuestion> = ArrayList()
    var questionList:MutableList<Question> = ArrayList()
    var selectedCategory:Category?=null

    var fragmentList:MutableList<QuestionFragment> = ArrayList()

    var selected_values:MutableList<String> = ArrayList()

    var timer = 0
    var right_answer_count=0
    var wrong_answer_count=0
    var no_answer_count=0
    var data_question=StringBuilder()




    val KEY_GO_TO_QUESTION: String? ="position_go_to"
    val KEY_BACK_FROM_RESULT:String? = "back_from_result"


    enum class ANSWER_TYPE{
        NO_ANSWER,
        RIGHT_ANSWER,
        WRONG_ANSWER
    }
}