package com.example.varianttecnology.kotlinmultiplechoicequiz.Adapter

import android.content.Context
import android.content.Intent
//import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.varianttecnology.kotlinmultiplechoicequiz.Common.Common
import com.example.varianttecnology.kotlinmultiplechoicequiz.Interface.IOnRecyclerViewItemClickListener
import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.Category
import com.example.varianttecnology.kotlinmultiplechoicequiz.Model.Question
import com.example.varianttecnology.kotlinmultiplechoicequiz.QuestionActivity
import com.example.varianttecnology.kotlinmultiplechoicequiz.R
import kotlinx.android.synthetic.main.layout_category_item.view.*

class CategoryAdapter(internal var context: Context,
                      internal var categoryList:List<Category>):
    RecyclerView.Adapter<CategoryAdapter.MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.layout_category_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txt_category_name.text = categoryList[position].name
        holder.setiOnRecyclerViewItemClickListener(object : IOnRecyclerViewItemClickListener{
            override fun onClick(view: View, position: Int) {

                Common.selectedCategory = categoryList[position]

                val intent = Intent(context,QuestionActivity::class.java)
                context.startActivity(intent)
            }

        })

    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),View.OnClickListener{

        internal var txt_category_name : TextView
        internal var card_category: CardView
        internal lateinit var iOnRecyclerViewItemClickListener:IOnRecyclerViewItemClickListener

        fun setiOnRecyclerViewItemClickListener(iOnRecyclerViewItemClickListener: IOnRecyclerViewItemClickListener)
        {
            this.iOnRecyclerViewItemClickListener = iOnRecyclerViewItemClickListener
        }

        init {
            txt_category_name = itemView.findViewById(R.id.txt_category_name) as TextView
            card_category = itemView.findViewById(R.id.card_category) as CardView

            itemView.setOnClickListener(this)
        }
        override fun onClick(view: View) {
            iOnRecyclerViewItemClickListener.onClick(view,adapterPosition)
        }

    }
}