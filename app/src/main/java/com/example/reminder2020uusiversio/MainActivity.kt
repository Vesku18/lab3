package com.example.reminder2020uusiversio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.list_view_item.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main )

        button_time.setOnClickListener{
            val intent=Intent(applicationContext,TimeActivity::class.java)
            startActivity(intent)
        }

        button_map.setOnClickListener{
            val intent=Intent(applicationContext,MapActivity::class.java)
            startActivity(intent)
        }

        val data = arrayOf("Oulu","Helsinki","Tampere")
        val reminderAdapter = ReminderAdapter(applicationContext, data)
        list1.adapter = reminderAdapter
    }

}
