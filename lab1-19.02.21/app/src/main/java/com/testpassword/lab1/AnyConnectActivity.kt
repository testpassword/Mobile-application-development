package com.testpassword.lab1

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.any_connect_layout.*

class AnyConnectActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.any_connect_layout)
        supportActionBar?.setText(this, R.color.anyConnectAccent, R.string.any_connect_title)
        vpnSwitcher.setOnCheckedChangeListener { _, isChecked ->
            statusTV.setText(if (isChecked) R.string.any_connect_on else R.string.any_connect_off)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.any_connect_menu, menu)
        return true
    }
}