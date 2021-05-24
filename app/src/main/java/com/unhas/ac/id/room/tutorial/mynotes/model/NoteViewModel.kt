package com.unhas.ac.id.room.tutorial.mynotes.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.unhas.ac.id.room.tutorial.mynotes.note.Note
import com.unhas.ac.id.room.tutorial.mynotes.repo.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private var noteRepository = NoteRepository(application)
    private var notes: LiveData<List<Note>>? = noteRepository.getNotes()

    fun insertNote(note: Note) {
        noteRepository.insert(note)
    }

    fun getNotes(): LiveData<List<Note>>? {
        return notes
    }

    fun deleteNote(note: Note) {
        noteRepository.delete(note)
    }

    fun updateNote(note: Note) {
        noteRepository.update(note)
    }

}