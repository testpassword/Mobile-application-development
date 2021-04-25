package testpassword.lab5.controllers

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_task.*
import testpassword.lab5.R
import testpassword.lab5.models.Task
import testpassword.lab5.repos.TaskDatabase

class TaskEditorActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)
        intent?.getParcelableExtra<Task>(Task::class.java.canonicalName)?.let {
            titleET.setText(it.title)
            descriptionET.setText(it.description)
            importanceCB.isChecked = it.importance
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_item_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            R.id.save_item -> {
                listOf(titleET, descriptionET).map { it.text.toString() }.also {
                    if (it.any(String::isBlank)) Toast.makeText(this, R.string.empty_data_msg, Toast.LENGTH_SHORT).show()
                    else TaskDatabase.getDB().addAll(Task(it[0], it[1], importanceCB.isChecked))
                }
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
}