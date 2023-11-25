package com.example.my.a6_1less

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.my.a6_1less.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        LazyThreadSafetyMode.NONE
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnInc.setOnClickListener {
            viewModel.inc()
        }

        binding.btnDec.setOnClickListener {
            viewModel.dec()
        }

        viewModel.counterLV.observe(this) { result ->
            binding.tvResult.text = result.toString()
        }
    }

}