package com.testpassword.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.example_layout.*

class ExampleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_layout)
        supportActionBar?.hide()
        welcomeBtn.setOnClickListener { startActivity(Intent(this, RdpActivity::class.java)) }
    }
}