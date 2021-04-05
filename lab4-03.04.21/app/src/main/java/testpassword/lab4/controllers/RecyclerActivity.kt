package testpassword.lab4.controllers

import android.os.Bundle
import testpassword.lab4.views.AndroidAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.android_list_item.view.*
import kotlinx.android.synthetic.main.recycler_activity.*
import testpassword.lab4.R
import testpassword.lab4.models.ANDROID_VERSIONS

class RecyclerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_activity)
        androidsList.apply {
            layoutManager = LinearLayoutManager(this@RecyclerActivity)
            adapter = AndroidAdapter(ANDROID_VERSIONS)
            addItemDecoration(
                DividerItemDecoration(this@RecyclerActivity, DividerItemDecoration.HORIZONTAL).apply {
                    setDrawable(ContextCompat.getDrawable(this@RecyclerActivity, R.color.colorAccent)!!)
                })
        }
    }
}