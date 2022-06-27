package com.dnu.android.lr3.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dnu.android.lr3.R
import com.dnu.android.lr3.entity.SecondNote
import kotlinx.android.synthetic.main.second_note_view_holder.view.*

class SecondNoteViewHolder (parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.second_note_view_holder, parent, false)
) {
    fun bind(secondNote: SecondNote, onClick : (String) -> Unit) = with(itemView){
        Glide.with(context).load(secondNote.picture).into(icNote)
        icNote.setOnClickListener { onClick(context.getString(R.string.id, secondNote.id)) }
        tvTitle.text = context.getString(R.string.title, secondNote.title)
        tvSubtitle.text = context.getString(R.string.subtitle, secondNote.subtitle)
    }
}