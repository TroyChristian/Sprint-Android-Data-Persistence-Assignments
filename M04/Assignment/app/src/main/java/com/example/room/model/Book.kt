package com.example.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName  = "book_table")
 open class Book(){


    @PrimaryKey(autoGenerate = true)
    var id:Int? = null

    var title:String? = null
    var description: String? = null
    var priority: Int? = null






}