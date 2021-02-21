package com.testpassword.lab1

import android.os.Bundle
import android.view.Menu
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.aida64_layout.*

class Aida64Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aida64_layout)
        window.setStatusBarColor(this, R.color.aida64statusBar)
        supportActionBar?.setText(this, R.color.aida64Accent, R.string.aida64_title)
        sectionsRV.adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,
            resources.getStringArray(R.array.aida64_sections))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        resources.getStringArray(R.array.aida64_menu).forEach { menu.add(it) }
        return true
    }
}