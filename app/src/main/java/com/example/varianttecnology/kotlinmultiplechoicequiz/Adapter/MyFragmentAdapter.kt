package com.example.varianttecnology.kotlinmultiplechoicequiz.Adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.varianttecnology.kotlinmultiplechoicequiz.Common.Common.fragmentList
import com.example.varianttecnology.kotlinmultiplechoicequiz.QuestionFragment
import java.lang.StringBuilder

class MyFragmentAdapter(fm:FragmentManager,var context: Context,
                        fragmentList: List<QuestionFragment>):FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return fragmentList[p0]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return StringBuilder("Question ").append(position+1).toString()
    }

    internal var instances:MyFragmentAdapter?=null

}