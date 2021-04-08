package com.fatihbaser.kotlinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // onAttach bir yere baglanma
    }
    fun firstFragment(view:View){

        val fragmentManager=supportFragmentManager
        val fragmnetTransaction=fragmentManager.beginTransaction()
        val firsfragment=BlankFragment()

        fragmnetTransaction.replace(R.id.frameLayout,firsfragment).commit()

    }
    fun secondFragment(view:View){
        val fragmentManager=supportFragmentManager
        val fragmnetTransaction=fragmentManager.beginTransaction()
        val secondfragment=BlankFragment2()

        fragmnetTransaction.replace(R.id.frameLayout,secondfragment).commit()
    }
}