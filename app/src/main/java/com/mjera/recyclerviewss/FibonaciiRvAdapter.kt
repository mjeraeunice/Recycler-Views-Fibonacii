package com.mjera.recyclerviewss

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonaciiRvAdapter(var numbersList:List<Int>): RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacii_list_item,parent, false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        var currentNumber=numbersList.get(position)
        holder.tvNumber.text=currentNumber.toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}
class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvNumber= itemView.findViewById<TextView>(R.id.tvNumber)
}