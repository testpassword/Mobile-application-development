package testpassword.lab4.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize
import testpassword.lab4.R
import java.util.*

@Parcelize data class Android(val title: String,
                              @DrawableRes val logo: Int,
                              val releaseDate: Calendar) : Parcelable

val ANDROID_VERSIONS = listOf(
        Android("Cupcake",
                R.drawable.cupcake,
                Calendar.Builder().setDate(2008, 9, 23).build()
        ),
        Android("Donut",
                R.drawable.donut,
                Calendar.Builder().setDate(2009, 9, 15).build()
        ),
        Android("Eclair",
                R.drawable.eclair,
                Calendar.Builder().setDate(2009, 10, 26).build()
        ),
        Android("Froyo",
                R.drawable.froyo,
                Calendar.Builder().setDate(2010, 5, 20).build()
        ),
        Android("Gingerbread",
                R.drawable.gingerbread,
                Calendar.Builder().setDate(2010, 12, 6).build()
        ),
        Android("Honeycomb",
                R.drawable.honeycomb,
                Calendar.Builder().setDate(2011, 2, 22).build()
        ),
        Android("Jelly Bean",
                R.drawable.jelly,
                Calendar.Builder().setDate(2012, 7, 9).build()
        ),
        Android("Kitkat",
                R.drawable.kitkat,
                Calendar.Builder().setDate(2013, 10, 31).build())
        ,
        Android("Lollipop",
                R.drawable.lollipop,
                Calendar.Builder().setDate(2014, 11, 12).build()
        ),
        Android("Marshmallow",
                R.drawable.marshmallow,
                Calendar.Builder().setDate(2015, 10, 5).build()
        ),
        Android("Nougat",
                R.drawable.nougat,
                Calendar.Builder().setDate(2016, 8, 22).build()
        ),
        Android("Oreo",
                R.drawable.oreo,
                Calendar.Builder().setDate(2017, 8, 21).build()
        ),
        Android("Pie",
                R.drawable.pie,
                Calendar.Builder().setDate(2018, 8, 6).build()
        ),
        Android("Android 10",
                R.drawable.android_ten,
                Calendar.Builder().setDate(2019, 9, 3).build()
        ),
        Android("Android 11",
                R.drawable.android_el,
                Calendar.Builder().setDate(2020, 9, 8).build()
        )
)