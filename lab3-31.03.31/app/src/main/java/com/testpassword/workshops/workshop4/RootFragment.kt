package com.testpassword.workshops.workshop4

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.snackbar.Snackbar
import com.testpassword.workshops.R
import kotlinx.android.synthetic.main.workshop4_root_fragment.*
import java.util.*

class RootFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        retainInstance = true
        return inflater.inflate(R.layout.workshop4_root_fragment, container, false)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val (anon, alert) = generateSequence {
            AlertDialog.Builder(context).apply {
                setPositiveButton(R.string.ok_btn) { _, _ -> makeToast(getString(R.string.ok_btn)) }
                setNegativeButton(R.string.cancel_btn) { _, _ -> makeToast(getString(R.string.cancel_btn)) }
                setNeutralButton(R.string.retry_btn) { _, _ -> makeToast(getString(R.string.retry_btn)) }
                setOnCancelListener { makeToast(getString(R.string.dismiss_dialog)) }
            }.create()
        }.take(2).zipWithNext().first()
        anon.setView(View.inflate(context, R.layout.workshop4_dialog_fragment, null))
        alert.setTitle(R.string.alert_title)
        alertBtn.setOnClickListener { alert.show() }
        dialogBtn.setOnClickListener { anon.show() }
        timePickerBtn.setOnClickListener {
            Calendar.getInstance().also {
                TimePickerDialog(
                    context,
                    { _, hour, minute -> eatSnack(getString(R.string.tp_snackbar_msg, hour, minute)) },
                    it[Calendar.HOUR_OF_DAY],
                    it[Calendar.MINUTE],
                    true
                ).show()
            }
        }
        datePickerBtn.setOnClickListener {
            Calendar.getInstance().also {
                DatePickerDialog(
                    context!!,
                    { _, year, month, day -> eatSnack(getString(R.string.dp_snackbar_msg, day, month, year)) },
                    it[Calendar.YEAR],
                    it[Calendar.MONTH],
                    it[Calendar.DAY_OF_MONTH]
                ).show()
            }
        }
        bottomSheetBtn.setOnClickListener {
            BottomSheetDialog(context!!).apply {
                setOnCancelListener { makeToast(getString(R.string.dismiss_dialog)) }
                setContentView(layoutInflater.inflate(R.layout.workshop4_dialog_fragment, null).apply {
                    findViewById<Button>(R.id.cancelBtn).apply {
                        visibility = View.VISIBLE
                        setOnClickListener { makeToast(getString(R.string.cancel_btn)) }
                    }
                    findViewById<Button>(R.id.okBtn).apply {
                        visibility = View.VISIBLE
                        setOnClickListener { makeToast(getString(R.string.ok_btn)) }
                    }
                })
            }.show()
        }
    }

    private fun eatSnack(message: String, view: View = parentLayout) = Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()

    private fun makeToast(message: String) = Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}