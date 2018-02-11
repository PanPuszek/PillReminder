package com.pum2018.pillreminder

import android.content.Intent
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        val bitMap = BitmapFactory.decodeResource(resources, R.drawable.ic_alarm_add_black_48dp)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitMap)
        rounded.cornerRadius = 30f
        imageScheduler.setImageDrawable(rounded)
    }



    fun onStoreClick(view : View){
        Toast.makeText(this,"You pressed Store",LENGTH_SHORT).show()
    }

    fun onSettingsClick(view : View){
        Toast.makeText(this,"You pressed Settings", LENGTH_SHORT).show()
    }

    fun onReportClick(view : View){
        Toast.makeText(this,"You pressed Report", LENGTH_SHORT).show()
    }

    fun onScheduleClick(view : View){
        Toast.makeText(this,"You pressed Schedule", LENGTH_SHORT).show()
    }
}
