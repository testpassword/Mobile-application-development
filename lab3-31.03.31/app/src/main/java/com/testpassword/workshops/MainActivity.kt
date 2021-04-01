package com.testpassword.workshops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.testpassword.workshops.workshop2.RootFragment as W2Root
import com.testpassword.workshops.workshop4.RootFragment as W4Root

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.also {
            val layout = R.id.mainFrgContainer
            it.findFragmentById(layout)?: it.beginTransaction().add(layout, W2Root()).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            R.id.workshop2Btn -> {
                replaceFragment(W2Root())
                true
            }
            R.id.workshop4Btn -> {
                replaceFragment(W4Root())
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    private fun replaceFragment(frg: Fragment) =
        supportFragmentManager.beginTransaction().replace(R.id.mainFrgContainer, frg).commit()
}