package com.example.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecturenoteapp.ui.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
        val noteColors = listOf(
            RedOrange,LightGreen,Violet,BabyBlue, RedPink
        )
    }
}
