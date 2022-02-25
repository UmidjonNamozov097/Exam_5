package com.example.exam.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.models.homecategory

class HomeCategoriyAdapter(var contacts:ArrayList<homecategory>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_categories,parent,false)
        return HomeCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var contect=contacts[position]
        if (holder is MessageViewHolder){
            holder.profile.setImageResource(contect.img)
            holder.name.setText(contect.name)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class HomeCategoryViewHolder(view: View): RecyclerView.ViewHolder(view){
    var profile=view.findViewById<ImageView>(R.id.imgview)
    var name=view.findViewById<TextView>(R.id.textview)
}