package com.diewland.tcheckbox

import android.widget.TextView

class TextCheckbox() {

    private lateinit var tv: TextView
    private var checked = false
    private var textChecked   = "On"
    private var textUnChecked = "Off"

    constructor(v: TextView) : this() {
        tv = v
        tv.setOnClickListener {
            checked = !checked
            render()
        }
    }

    // render
    private fun render() {
        tv.text = if (checked) textChecked else textUnChecked
    }

    // getter
    fun isChecked(): Boolean {
        return checked
    }
    fun toInt(): Int {
        return if (checked) 1 else 0
    }

    // setter
    fun check(flag: Boolean): Boolean {
        checked = flag
        render()
        return flag
    }
    fun setInt(newInt: Int) { // 0 - false, 1 - true
        check(newInt > 0)
    }

    // custom texts
    fun setCheckedText(newText: String) {
        textChecked = newText
    }
    fun setUnCheckedText(newText: String) {
        textUnChecked = newText
    }

}