package testpassword.lab5.repos

import android.content.Context
import androidx.room.*
import testpassword.lab5.models.Task

@Dao interface TaskDao {

    @Query("SELECT * FROM task") fun getAll(): List<Task>

    @Query("SELECT * FROM task WHERE id IN (:ids)") fun loadAllByIds(ids: List<Long>): List<Task>

    @Insert fun addAll(vararg tasks: Task)

    @Delete fun delete(task: Task)
}


@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase: RoomDatabase() {

    abstract fun getTaskDao(): TaskDao

    companion object {

        private val DB_NAME = "TASKS_APP_DB"
        private var INSTANCE: TaskDatabase? = null

        fun getDB(c: Context? = null) =
            (INSTANCE ?: Room.databaseBuilder(
                c?.applicationContext ?: throw IllegalStateException("To init db you should add context"),
                TaskDatabase::class.java,
                DB_NAME
            ).allowMainThreadQueries().build().apply { INSTANCE = this }).getTaskDao()
    }
}