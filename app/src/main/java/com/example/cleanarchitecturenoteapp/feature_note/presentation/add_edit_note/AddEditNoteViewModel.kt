package com.example.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

import androidx.lifecycle.ViewModel
import com.example.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUseCase: NoteUseCase
): ViewModel(){


}