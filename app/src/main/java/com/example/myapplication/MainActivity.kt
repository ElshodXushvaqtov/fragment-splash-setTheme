package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat.ThemeCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
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