package com.example.exam.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.models.homecategory
import com.example.exam.models.homerestourants

class HomeRestourantsAdapter(var contacts:ArrayList<homerestourants>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_restourants,parent,false)
        return HomeRetourantsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var contect=contacts[position]
        if (holder is MessageViewHolder){
            holder.profile.setImageResource(contect.img_profile)
            holder.name.setText(contect.profile_name)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class HomeRetourantsViewHolder(view: View): RecyclerView.ViewHolder(view){
    var profile=view.findViewById<ImageView>(R.id.img_restourant)
    var name=view.findViewById<TextView>(R.id.img_name)
}