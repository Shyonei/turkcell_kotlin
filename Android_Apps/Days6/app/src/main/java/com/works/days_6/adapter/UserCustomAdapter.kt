package com.works.days_6.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.works.days_6.R
import com.works.days_6.models.User

class UserCustomAdapter (private val context: Activity , private val list:List<User>) : ArrayAdapter<User>(context,
    R.layout.custom_list_item, list)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item,null,true)

        val r_title = rootView.findViewById<TextView>(R.id.r_title)
        val r_age = rootView.findViewById<TextView>(R.id.r_age)
        val r_email = rootView.findViewById<TextView>(R.id.r_email)
        //val r_image = rootView.findViewById<TextView>(R.id.r_image)

        val user = list.get(position)
        r_title.text = "${user.first} ${user.last}"
        r_age.text = user.age.toString()
        r_email.text = user.email

        return rootView
    }
}