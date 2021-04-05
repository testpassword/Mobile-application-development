package testpassword.lab4.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.quanti.quase.loremkotlinum.Lorem
import kotlinx.android.synthetic.main.activity_details.*
import testpassword.lab4.R
import testpassword.lab4.models.Android
import java.util.*

class DetailsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        intent.getParcelableExtra<Android>(Android::class.java.canonicalName)?.let { a ->
            logoView.setImageResource(a.logo)
            versionNameTV.text = a.title
            a.releaseDate.also { releaseDateLbl.text = "${it[Calendar.DAY_OF_MONTH]}/${it[Calendar.MONTH]}/${it[Calendar.YEAR]}" }
            overviewTv.text = Lorem.paragraphs()
        }
    }
}