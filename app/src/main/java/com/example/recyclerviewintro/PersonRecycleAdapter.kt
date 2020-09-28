package com.example.recyclerviewintro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonRecycleAdapter(val context : Context, val persons : List<Person>) : RecyclerView.Adapter<PersonRecycleAdapter.ViewHolder>() {
    val layoutInflater = LayoutInflater.from(context)
    override fun getItemCount() : Int {
        return persons.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person = persons[position]
        holder.textViewName.text = person.name
        holder.textViewAge.text = person.age.toString()
    }

    inner class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        val textViewName = itemView.findViewById<TextView>(R.id.textViewName)
        val textViewAge = itemView.findViewById<TextView>(R.id.textViewAge)
    }
}