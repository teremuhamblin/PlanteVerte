package com.planteverte.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Plant::class], version = 1)
abstract class PlantDatabase : RoomDatabase() {

    abstract fun plantDao(): PlantDao

    companion object {
        @Volatile private var INSTANCE: PlantDatabase? = null

        fun getInstance(context: Context): PlantDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    PlantDatabase::class.java,
                    "planteverte.db"
                ).build().also { INSTANCE = it }
            }
    }
}
