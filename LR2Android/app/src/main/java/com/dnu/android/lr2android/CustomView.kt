package com.dnu.android.lr2android

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.use
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var title = "Default Title"
    private var subtitle = "Default Subtitle"

    init {
        View.inflate(context, R.layout.custom_view, this)

        context.obtainStyledAttributes(
            attrs,
            R.styleable.CustomView
        ).use {
            title = it.getString(R.styleable.CustomView_title).toString()
            subtitle = it.getString(R.styleable.CustomView_subtitle).toString()
            setFields()
        }
    }

    fun setOnclickListener(block: ()-> Unit) {
        bOpen.setOnClickListener {
            block.invoke()
        }
    }

    private fun setFields() {
        tvTitle.text = title
        tvSubtitle.text = subtitle
    }
}