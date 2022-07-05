package com.mobwaysolutions.myapplication

import com.mobwaysolutions.myapplication.database.ApplicationDatabase
import com.mobwaysolutions.myapplication.repository.ProdutoRepository
import com.mobwaysolutions.myapplication.view.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModules = module {
    single { ProdutoRepository(get()) }
}

val databaseModules = module {
    single { ApplicationDatabase.getDatabase(androidApplication()) }
    single { get<ApplicationDatabase>().getProdutoDao() }
}

val viewModelModules = module {

    viewModel { MainViewModel(get()) }

}


