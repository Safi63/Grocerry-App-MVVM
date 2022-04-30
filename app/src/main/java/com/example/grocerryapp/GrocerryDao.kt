package com.example.grocerryapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GrocerryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insert(item:GroceryItems)

    @Delete
    fun delete(item:GroceryItems)

    @Query("SELECT * FROM grocerry_item")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}