package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R.id.greeting

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra(NAME_EXTRA)
        val greeting = findViewById<TextView>(R.id.greeting)
        greeting.text="happy birthday $name!!\n you are old now"
        val greeting2 = findViewById<TextView>(R.id.greeting2)
        greeting2.text="live long n play hard"
    }
}