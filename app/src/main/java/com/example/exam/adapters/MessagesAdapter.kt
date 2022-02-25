package com.example.exam.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exam.R
import com.example.exam.models.Messages

class MessagesAdapter(var contacts:ArrayList<Messages>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=
            LayoutInflater.from(parent.context).inflate(R.layout.item_feed_message,parent,false)
        return CollectionsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       var contect=contacts[position]
        if (holder is MessageViewHolder){
            holder.profile.setImageResource(contect.iv_profile)
            holder.name.setText(contect.tv_chat_name)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}
class CollectionsViewHolder(view: View):RecyclerView.ViewHolder(view){
    var profile=view.findViewById<ImageView>(R.id.iv_profile_message)
    var name=view.findViewById<TextView>(R.id.message_profile_name)
}