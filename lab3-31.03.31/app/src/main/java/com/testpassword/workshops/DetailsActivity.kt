package com.testpassword.workshops

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cz.quanti.quase.loremkotlinum.Lorem
import kotlinx.android.synthetic.main.activity_details.*
import java.util.*

class DetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        Calendar.getInstance().also { releaseDateLbl.text = "${it[Calendar.DAY_OF_MONTH]}/${it[Calendar.MONTH]}/${it[Calendar.YEAR]}" }
        overviewTv.text = Lorem.paragraphs()
    }
}