package com.testpassword.lab1

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Html
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import androidx.core.content.ContextCompat

fun Window.setStatusBarColor(context: Context, color: Int) {
    clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    statusBarColor = ContextCompat.getColor(context, color)
}

fun ActionBar.setText(context: Context, color: Int, text: Int) {
    setBackgroundDrawable(ColorDrawable(Color.parseColor(context.resources.getString(color))))
    title = Html.fromHtml("<font color='#FFFFFF'>${context.resources.getString(text)}</font>")
}