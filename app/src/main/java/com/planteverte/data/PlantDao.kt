package com.planteverte.data

import androidx.room.*

@Dao
interface PlantDao {

    @Insert
    suspend fun insert(plant: Plant)

    @Query("SELECT * FROM plants ORDER BY createdAt DESC")
    suspend fun getAll(): List<Plant>
}
