package com.example.kotlinnotes.views

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlinnotes.models.Note
import kotlinx.android.synthetic.main.item_note.view.*

class NoteView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 1
) : ConstraintLayout(context, attrs, defStyleAttr) {

    fun initView(note: Note){
        tv_note_item.text = note.description
    }


}
