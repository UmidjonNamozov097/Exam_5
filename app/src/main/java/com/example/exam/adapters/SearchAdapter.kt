package com.example.exam.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.models.Search

class SearchAdapter (var contacts:ArrayList<Search>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_search,parent,false)
        return SearchViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var contact = contacts[position]
        if (holder is SearchViewHolder) {
            holder.profile.setImageResource(contact.iv_profile)
            holder.name.setText(contact.fullname)
        }
    }


    override fun getItemCount(): Int {
        return contacts.size
    }

}

class SearchViewHolder(view: View):RecyclerView.ViewHolder(view){
    var profile=view.findViewById<ImageView>(R.id.iv_profile)
    var name=view.findViewById<TextView>(R.id.profile_name)
}