package com.example.gymclubb.HomeScreen.UI

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.example.gymclubb.R
import kotlinx.android.synthetic.main.stats_card.view.*


class StatsCard(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.stats_card, this)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.StatsCard)
//        stats_card_text_1.text = attributes.getString(R.styleable.StatsCard_text_1)
//        stats_card_text_2.text = attributes.getString(R.styleable.StatsCard_text_2)
//        stats_card_text_3.text = attributes.getString(R.styleable.StatsCard_text_3)

        attributes.recycle()

    }
}