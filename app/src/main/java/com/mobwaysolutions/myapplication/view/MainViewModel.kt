package com.mobwaysolutions.myapplication.view

import androidx.lifecycle.ViewModel
import com.mobwaysolutions.myapplication.database.entity.Produto
import com.mobwaysolutions.myapplication.repository.ProdutoRepository

class MainViewModel(private val repository: ProdutoRepository) : ViewModel() {

    fun insert(produto: Produto) {
        repository.insert(produto)
    }

}