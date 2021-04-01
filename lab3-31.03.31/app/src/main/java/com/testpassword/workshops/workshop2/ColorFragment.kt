package com.testpassword.workshops.workshop2

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.testpassword.workshops.R
import kotlinx.android.synthetic.main.workshop2_color_fragment.*

data class ColorFragment(private val label: String, private val backgroundColorId: Int): Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        retainInstance = true
        return inflater.inflate(R.layout.workshop2_color_fragment, container, false)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        counterLbl.text = label
        parentLayout.background = ColorDrawable(Color.parseColor(getString(backgroundColorId)))
    }
}