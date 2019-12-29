package com.first_ahmadtv.survey3

import android.content.Intent
import android.view.Display
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE="com.first_ahmadtv.send.MESSAGE"
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /**called when the user taps the send button*/
    fun sendMessage(view: View) {}

    val editText = findViewById<EditText>()
    val message = editText.text.toString()


}
}
