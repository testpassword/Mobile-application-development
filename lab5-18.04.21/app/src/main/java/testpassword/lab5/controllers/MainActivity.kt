package testpassword.lab5.controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import testpassword.lab5.R
import testpassword.lab5.repos.TaskDatabase
import testpassword.lab5.views.TaskAdapter

class MainActivity: AppCompatActivity() {

    companion object { val ADD_ITEM_REQUEST = 1 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addItemBtn.setOnClickListener { startActivityForResult(Intent(this, TaskEditorActivity::class.java), ADD_ITEM_REQUEST) }
    }

    override fun onStart() {
        super.onStart()
        val swapVisibility: (Boolean) -> Unit = {
            rcPlaceholder.visibility = if (it) View.GONE else View.VISIBLE
            tasksRV.visibility = if (it) View.VISIBLE else View.GONE
        }
        TaskDatabase.getDB(this@MainActivity).getAll().also {
            if (it.isNotEmpty()) {
                swapVisibility(true)
                with(tasksRV) {
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = TaskAdapter(it)
                    addItemDecoration(
                        DividerItemDecoration(this@MainActivity, DividerItemDecoration.HORIZONTAL).apply {
                            setDrawable(ContextCompat.getDrawable(this@MainActivity, R.color.purple_200)!!)
                        })
                }
            } else swapVisibility(false)
        }
    }
}