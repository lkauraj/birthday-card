package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createBirthdayCard(view: android.view.View) {
        val nameInput = findViewById<EditText>(R.id.enterTheName)
        val name = nameInput.editableText.toString()
        val intent= Intent(this, MainActivity2::class.java)
        intent.putExtra(MainActivity2.NAME_EXTRA, name)
        startActivity(intent)
    }
}