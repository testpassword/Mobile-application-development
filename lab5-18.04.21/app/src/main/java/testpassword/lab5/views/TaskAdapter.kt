package testpassword.lab5.views

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testpassword.lab5.R
import testpassword.lab5.models.Task
import kotlinx.android.synthetic.main.task_item.view.*
import testpassword.lab5.controllers.TaskEditorActivity

class TaskAdapter(private val tasks: List<Task>): RecyclerView.Adapter<TaskAdapter.TaskHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TaskHolder(LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false))

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: TaskAdapter.TaskHolder, position: Int) = holder.bind(tasks[position])

    inner class TaskHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(el: Task) =
            with(itemView) {
                priorityIV.visibility = if (el.importance) View.VISIBLE else View.GONE
                titleTV.text = el.title
                descriptionTV.text = el.description
                setOnClickListener {
                    context.startActivity(
                        Intent(context, TaskEditorActivity::class.java).apply { putExtra(el::class.java.canonicalName, el) }
                    )
                }
            }
    }
}