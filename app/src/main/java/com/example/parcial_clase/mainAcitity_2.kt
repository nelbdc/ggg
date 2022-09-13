package com.example.parcial_clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class mainAcitity_2 : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun enviar(view: View){
        val b = findViewById<TextView>(R.id.enviar) as Button;
        b.setOnClickListener {
            val n1 = findViewById<TextView>(R.id.numero1).text.toString();
            val n2 = findViewById<TextView>(R.id.numero2).text.toString();
            val resultado = n1.toInt() + n2.toInt()

            findViewById<TextView>(R.id.resultado).setText("$resultado");
        }


    }




}