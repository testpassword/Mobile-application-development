package com.testpassword.lab1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.rdp_layout.*

class RdpActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rdp_layout)
        window.setStatusBarColor(this, R.color.colorPrimary)
        supportActionBar?.apply {
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
            setCustomView(R.layout.rdp_top_appbar) //https://qureshi-ayaz29.medium.com/custom-toolbar-in-android-3818a0740942
        }
        toAnyConnectBtn.setOnClickListener { startActivity(Intent(this@RdpActivity, AnyConnectActivity::class.java)) }
        toAidaBtn.setOnClickListener { startActivity(Intent(this@RdpActivity, Aida64Activity::class.java)) }
    }
}