package com.example.fran.com.msviews

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sePulsa0(view: View) {
        entrada.setText(entrada.text.toString() + view.tag as String)
    }

    fun sePulsa(view: View) {
        if(entrada.text.toString() != ""){
            salida.text = (java.lang.Float.parseFloat(entrada.text.toString()) * 2.0).toString()
        }
    }

}
