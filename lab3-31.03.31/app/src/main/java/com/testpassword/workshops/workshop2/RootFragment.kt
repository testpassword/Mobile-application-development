package com.testpassword.workshops.workshop2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.testpassword.workshops.R
import kotlinx.android.synthetic.main.workshop2_root_fragment.*
import java.util.*

class RootFragment: Fragment() {

    private var counter = 0
    private val fragmentsTags = Stack<String>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        retainInstance = true
        return inflater.inflate(R.layout.workshop2_root_fragment, container, false)!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRootLblText()
        addRedBtn.setOnClickListener { addColorFragment(R.color.red) }
        addBlueBtn.setOnClickListener { addColorFragment(R.color.colorPrimaryDark) }
        removeBtn.setOnClickListener { removeLastFragment() }
        replaceBtn.setOnClickListener { replaceLastColorFragment(R.color.colorAccent) }
    }

    private fun setRootLblText() {
        rootLbl.text = if (counter == 0) getString(R.string.root_lbl) else counter.toString()
    }

    private fun addColorFragment(colorId: Int) {
        counter++
        val frg = ColorFragment(counter.toString(), colorId)
        setRootLblText()
        fragmentsTags.push(frg.hashCode().toString())
        fragmentManager!!.beginTransaction().add(R.id.colorFrgContainer, frg, fragmentsTags.peek()).commit()
    }

    private fun removeLastFragment() {
        if (counter > 0 && fragmentsTags.isNotEmpty()) {
            counter--
            setRootLblText()
            fragmentManager!!.also { it.beginTransaction().remove(it.findFragmentByTag(fragmentsTags.pop())!!).commit() }
        }
    }

    private fun replaceLastColorFragment(colorId: Int) {
        val frg = ColorFragment(counter.toString(), colorId)
        if (counter > 0 && fragmentsTags.isNotEmpty()) {
            val victim = fragmentManager!!.findFragmentByTag(fragmentsTags.pop())!!
            fragmentsTags.push(frg.hashCode().toString())
            fragmentManager!!.beginTransaction().also {
                //replace() method will wipe all fragments in fragmentManager, so we don't use it there
                it.remove(victim)
                it.add(R.id.colorFrgContainer, frg, fragmentsTags.peek()).commit()
            }
        }
    }
}