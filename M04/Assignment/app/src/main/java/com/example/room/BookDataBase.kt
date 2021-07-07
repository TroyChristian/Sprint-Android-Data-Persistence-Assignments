package com.example.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.room.model.Book

@Database(entities = [Book::class], version = 2, exportSchema = false)
abstract class BookDataBase : RoomDatabase() {
    abstract fun BookEntry(): BookDAO

}
