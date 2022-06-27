package com.dnu.android.lr3.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dnu.android.lr3.entity.FirstNote
import com.dnu.android.lr3.entity.SecondNote
import com.dnu.android.lr3.entity.INote
import com.dnu.android.lr3.adapter.holder.FirstNoteViewHolder
import com.dnu.android.lr3.adapter.holder.SecondNoteViewHolder

class NoteAdapter (
    private val onItemClick: OnItemClick
)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val currentList = mutableListOf<INote>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            FIRST_NOTE_VIEW_TYPE -> FirstNoteViewHolder(parent)
            SECOND_NOTE_VIEW_TYPE -> SecondNoteViewHolder(parent)
            else -> error("Unsupported viewType: $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FirstNoteViewHolder -> holder.bind(currentList[position] as FirstNote, onItemClick::onFirstNoteClick)
            is SecondNoteViewHolder -> holder.bind(currentList[position] as SecondNote, onItemClick::onSecondNoteClick)
            else -> Unit
        }
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    fun submitList(list: List<INote>) {
        currentList.clear()
        currentList.addAll(list)
    }

    override fun getItemViewType(position: Int): Int {
        return when (currentList[position]) {
            is FirstNote -> FIRST_NOTE_VIEW_TYPE
            is SecondNote -> SECOND_NOTE_VIEW_TYPE
            else -> super.getItemViewType(position)
        }
    }

    companion object {
        private const val FIRST_NOTE_VIEW_TYPE = 0
        private const val SECOND_NOTE_VIEW_TYPE = 1
    }

    interface OnItemClick {
        fun onFirstNoteClick(message: String)
        fun onSecondNoteClick(message: String)
    }
}