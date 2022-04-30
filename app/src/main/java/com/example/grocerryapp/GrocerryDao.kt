package com.example.grocerryapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GrocerryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item:GroceryItems)

    @Delete
    suspend fun delete(item:GroceryItems)

    @Query("SELECT * FROM grocerry_item")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}