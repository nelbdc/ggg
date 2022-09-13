package com.example.parcial_clase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {


    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
    }



    fun login(view: View){
        val instance = Intent(this,mainAcitity_2::class.java)
        startActivity(instance)
    }

}