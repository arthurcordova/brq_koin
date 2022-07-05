package com.mobwaysolutions.myapplication.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.mobwaysolutions.myapplication.database.entity.Produto

@Dao
interface ProdutoDao {

    @Insert
    fun insert(produto: Produto)

    @Query("select * from produto order by name")
    fun buscar(): List<Produto>

}