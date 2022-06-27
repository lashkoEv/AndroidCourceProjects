package com.dnu.android.lr3.adapter.decoration

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.dnu.android.lr3.R

class NoteDecoration(context: Context) : RecyclerView.ItemDecoration() {

    private val margin = context.resources.getDimensionPixelSize(R.dimen.dp10)
    private val marginTB = context.resources.getDimensionPixelSize(R.dimen.dp5)

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val itemPosition = parent.getChildAdapterPosition(view)
        if (itemPosition == RecyclerView.NO_POSITION) {
            return
        }
        outRect.left = margin
        outRect.right = margin
        when(itemPosition) {
            0 -> {
                outRect.top = margin
                outRect.bottom = marginTB
            }
            parent.adapter?.itemCount?.dec() -> {
                outRect.bottom = margin
                outRect.top = marginTB
            }
            else -> {
                outRect.top = marginTB
                outRect.bottom = marginTB
            }
        }
    }
}
