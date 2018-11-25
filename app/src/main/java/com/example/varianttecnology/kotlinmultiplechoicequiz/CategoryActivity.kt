package com.example.varianttecnology.kotlinmultiplechoicequiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.varianttecnology.kotlinmultiplechoicequiz.Adapter.CategoryAdapter
import com.example.varianttecnology.kotlinmultiplechoicequiz.Common.SpacesItemDecoration
import com.example.varianttecnology.kotlinmultiplechoicequiz.DBHelper.DBHelper
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        toolbar.title = "KOUSHIK QUIZ 2019"
        setSupportActionBar(toolbar)

        recycler_category.setHasFixedSize(true)
        recycler_category.layoutManager = GridLayoutManager(this,2) as RecyclerView.LayoutManager?

        val adapter = CategoryAdapter(this,DBHelper.getInstance(this).allCategories)
        recycler_category.addItemDecoration(SpacesItemDecoration(4))
        recycler_category.adapter = adapter
    }
}
