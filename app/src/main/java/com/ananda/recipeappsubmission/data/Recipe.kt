package com.ananda.recipeappsubmission.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe")
data class Recipe (
    @PrimaryKey(autoGenerate = true)
    val rId: Int,
    val rName: String,
    val rImg: Int
)