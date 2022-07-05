package com.mobwaysolutions.myapplication.repository

import com.mobwaysolutions.myapplication.database.dao.ProdutoDao
import com.mobwaysolutions.myapplication.database.entity.Produto

class ProdutoRepository(private val dao: ProdutoDao) {

    fun insert(produto: Produto) {
        dao.insert(produto)
    }

    fun buscar(): List<Produto> {
        return dao.buscar()
    }

}