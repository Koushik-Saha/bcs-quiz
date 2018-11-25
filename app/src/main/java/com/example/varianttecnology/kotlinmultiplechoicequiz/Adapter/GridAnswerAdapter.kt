package com.example.varianttecnology.kotlinmultiplechoicequiz.Adapter

import android.content.Context
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.varianttecnology.kotlinmultiplechoicequiz.Common.Common
import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.CurrentQuestion
import com.example.varianttecnology.kotlinmultiplechoicequiz.R
import kotlinx.android.synthetic.main.layout_grid_answer_item.view.*
import java.text.FieldPosition

class GridAnswerAdapter(internal var context: Context,
                        internal var answerSheetList: List<CurrentQuestion>):
    RecyclerView.Adapter<GridAnswerAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.layout_grid_answer_item,p0,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return answerSheetList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (answerSheetList[position].type == Common.ANSWER_TYPE.RIGHT_ANSWER)
            holder.question_item.setBackgroundResource(R.drawable.grid_item_right_answer)
        else if (answerSheetList[position].type == Common.ANSWER_TYPE.WRONG_ANSWER)
            holder.question_item.setBackgroundResource(R.drawable.grid_item_wrong_answer)
        else
            holder.question_item.setBackgroundResource(R.drawable.grid_item_no_answer)

    }

    inner class MyViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {


        internal var question_item:View
        init {
            question_item = itemView.findViewById(R.id.question_item) as View
        }


    }
}