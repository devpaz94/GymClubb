package com.example.gymclubb

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.home_sreen_card_view.view.*


class HomeScreenCardView(context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.home_sreen_card_view, this)

        val attributes = context.obtainStyledAttributes(attrs, R.styleable.HomeScreenCardView)
        card_image.setImageDrawable(attributes.getDrawable(R.styleable.HomeScreenCardView_image))
        card_text.text = attributes.getString(R.styleable.HomeScreenCardView_text)
        attributes.recycle()

    }
}