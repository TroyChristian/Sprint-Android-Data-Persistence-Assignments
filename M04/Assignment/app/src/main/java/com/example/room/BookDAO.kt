package com.example.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.room.model.Book

@Dao
public interface BookDAO {
    @Insert
    fun insert(book : Book)

    @Update
    fun update(book:Book)

    @Delete
    fun delete(book:Book)

    @Query("DELETE FROM book_table")
    fun deleteAllBooks()

    @Query("SELECT * FROM book_table ORDER BY priority DESC")
    fun orderAllEntries(): LiveData<List<Book>>
}

