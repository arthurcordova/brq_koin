package com.mobwaysolutions.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobwaysolutions.myapplication.R
import com.mobwaysolutions.myapplication.database.entity.Produto
import com.mobwaysolutions.myapplication.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonSave.setOnClickListener {
            Produto(
                0,
                binding.etName.text.toString(),
                binding.etPrice.text.toString().toDoubleOrNull()
            ).apply {
                viewModel.insert(this)
            }
        }
    }
}