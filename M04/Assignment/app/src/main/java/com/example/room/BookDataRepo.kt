package com.example.room

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.room.model.Book

class JournalDBRepo(val context: Context) : BookDAO {

    override fun insert(entry: Book) {
        database.BookDAO().entry(entry)
    }

    override fun readAllEntries(): LiveData<List<Book>> {
        return database.BookDAO().readAllEntries()
    }

    override fun update(entry: Book) {
        database.BookDAO().update(entry)
    }

    override fun delete(entry: Book) {
        database.journalEntryDao().deleteEntry(entry)

    }

    override fun deleteAllBooks(entry:Book) {
     database.BookDAO().deleteAllBooks(entry)
    }

    // TODO 15: Build the Room database
    private val database/**/ by lazy {
        Room.databaseBuilder(
            context.applicationContext,
            BookDataBase::class.java, "entry_database"
        ).fallbackToDestructiveMigration().build()
    }
}