package com.example.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v7.widget.RecyclerView

class TogelAdapter(val togelList: Array<String>) :
    RecyclerView.Adapter<TogelAdapter.TogelViewHolder>() {

    // Describes an item view and its place within the RecyclerView
    class TogelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val togelTextView: TextView = itemView.findViewById(R.id.togel_text)

        fun bind(word: String) {
            togelTextView.text = word
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TogelViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.togel_item, parent, false)

        return TogelViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return togelList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: TogelViewHolder, position: Int) {
        holder.bind(togelList[position])
    }
}