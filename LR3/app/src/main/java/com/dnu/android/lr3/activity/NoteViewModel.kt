package com.dnu.android.lr3.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dnu.android.lr3.R
import com.dnu.android.lr3.entity.FirstNote
import com.dnu.android.lr3.entity.SecondNote
import com.dnu.android.lr3.entity.INote

class NoteViewModel: ViewModel() {

    val notesData = MutableLiveData<List<INote>>()

    fun getNotes() {
        notesData.value = notes
    }

    companion object {
        private val notes = listOf(
            FirstNote(
                id = 0,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 1,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),
            FirstNote(
                id = 2,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 3,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 4,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 5,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 6,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 7,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 8,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 9,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 10,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 11,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 12,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 13,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 14,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 15,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            ),FirstNote(
                id = 16,
                title = "Title",
                picture = R.drawable.note1
            ),
            SecondNote(
                id = 17,
                title = "Title",
                subtitle = "Subtitle",
                picture = R.drawable.note2
            )
        )
    }
}