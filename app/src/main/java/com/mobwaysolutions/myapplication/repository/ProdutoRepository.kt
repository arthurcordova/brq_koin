package com.mobwaysolutions.myapplication.repository

import com.mobwaysolutions.myapplication.database.ApplicationDatabase
import com.mobwaysolutions.myapplication.database.entity.Produto

class ProdutoRepository(private val database: ApplicationDatabase) {

    fun insert(produto: Produto) {
        database.getProdutoDao().insert(produto)
    }

    fun buscar(): List<Produto> {
        return database.getProdutoDao().buscar()
    }
    
}