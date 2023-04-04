package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setTheme(R.style.Theme_MyApplication)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.container,RegistrationFragment())
            .commit()
    }
}