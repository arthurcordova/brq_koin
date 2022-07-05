package com.mobwaysolutions.myapplication.database

import android.content.Context
import androidx.room.*
import com.mobwaysolutions.myapplication.database.dao.ProdutoDao
import com.mobwaysolutions.myapplication.database.entity.Produto

@Database(
    version = 1,
    entities = [
        Produto::class
    ],
)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun getProdutoDao(): ProdutoDao

    companion object {

        @Volatile
        private var INSTANCE: ApplicationDatabase? = null

        fun getDatabase(context: Context): ApplicationDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "kotin_sample_database"
                ).allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }


}