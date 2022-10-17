package com.example.cs473_5

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.miu.quiztest.ItemClicked
import com.miu.quiztest.R
import kotlinx.android.synthetic.main.list_item.view.*

class ListAdaptor(var itemList :ArrayList<Item>) : RecyclerView.Adapter<ListAdaptor.MyViewHoldre>() {
    lateinit var myContext:Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdaptor.MyViewHoldre {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent,false)
        myContext = parent.context
        return MyViewHoldre(view)
    }

    override fun onBindViewHolder(holder: ListAdaptor.MyViewHoldre, position: Int) {
        holder.itemView.txt_item.text = itemList.get(position).name
        holder.itemView.img_item.setImageResource(itemList.get(position).image)

        holder.itemView.setOnClickListener(){
            var intent = Intent(it.context , ItemClicked::class.java)
            intent.putExtra("image",itemList.get(position).image)
            intent.putExtra("title" ,itemList.get(position).name )
            intent.putExtra("description" ,itemList.get(position).description )

            startActivity(it.context, intent,null)

        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


     class MyViewHoldre(itemView :View) : RecyclerView.ViewHolder(itemView)
}