package com.example.recyclerviewintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var persons = listOf<Person> (Person ("Anastasia", 29),
        Person("Susan", 2),
        Person("Ann", 9),
        Person("Laura", 49),
        Person("Susan", 27))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PersonRecycleAdapter(this, persons)
        recyclerView.adapter = adapter
    }
}