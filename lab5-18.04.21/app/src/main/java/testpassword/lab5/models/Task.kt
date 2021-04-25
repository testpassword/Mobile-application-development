package testpassword.lab5.models

import android.os.Parcelable
import androidx.room.*
import kotlinx.android.parcel.Parcelize

@Entity @Parcelize
data class Task(val title: String,
                val description: String,
                val importance: Boolean,
                @PrimaryKey(autoGenerate = true) val id: Long? = null): Parcelable