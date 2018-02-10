package com.pum2018.pillreminder

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainMenuActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
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
