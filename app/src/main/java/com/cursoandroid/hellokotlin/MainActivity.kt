package com.cursoandroid.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewStart = findViewById<TextView>(R.id.textViewStart)

        findViewById<Button>(R.id.buttonReady).setOnClickListener {
            textViewStart.visibility = View.VISIBLE

            findViewById<TextView>(R.id.textViewNombre).text="Tu puedes TEGO!!!"
        }

    }
}