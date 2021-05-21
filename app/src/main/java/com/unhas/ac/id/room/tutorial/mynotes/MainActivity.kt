package com.unhas.ac.id.room.tutorial.mynotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.unhas.ac.id.room.tutorial.mynotes.model.NoteViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        noteViewModel = ViewModelProvider(this).get(NoteViewModel::class.java)

        noteViewModel.getNotes()?.observe(this, Observer {
            noteAdapter.setNotes(it)
        })


    }
    private lateinit var noteViewModel: NoteViewModel


}