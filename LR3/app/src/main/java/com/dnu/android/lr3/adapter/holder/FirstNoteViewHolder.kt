package com.dnu.android.lr3.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dnu.android.lr3.R
import com.dnu.android.lr3.entity.FirstNote
import kotlinx.android.synthetic.main.first_note_view_holder.view.*

class FirstNoteViewHolder (parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(R.layout.first_note_view_holder, parent, false)
) {
    fun bind(firstNote: FirstNote, onClick : (String) -> Unit) = with(itemView){
        Glide.with(context).load(firstNote.picture).into(icNote)
        icNote.setOnClickListener { onClick(context.getString(R.string.id, firstNote.id)) }
        tvTitle.text = context.getString(R.string.title, firstNote.title)
    }
}