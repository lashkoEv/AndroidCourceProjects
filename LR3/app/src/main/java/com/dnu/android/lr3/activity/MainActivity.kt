package com.dnu.android.lr3.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dnu.android.lr3.R
import com.dnu.android.lr3.adapter.NoteAdapter
import com.dnu.android.lr3.adapter.decoration.NoteDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NoteAdapter.OnItemClick {
    private val viewModel = NoteViewModel()
    private val adapter = NoteAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getNotes()
        rvNotes.adapter = adapter
        rvNotes.addItemDecoration(NoteDecoration(this))
        viewModel.notesData.observe(this) {
            adapter.submitList(it)
        }
    }

    override fun onFirstNoteClick(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onSecondNoteClick(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}