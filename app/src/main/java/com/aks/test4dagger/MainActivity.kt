package com.aks.test4dagger

import android.os.Bundle
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


     @Inject lateinit var coffee: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          val componant = DaggerCoffeComponant.create()

        componant.Inject(this)
        coffee = componant.coffee
        Toast.makeText(this, coffee.coffeeCup,Toast.LENGTH_SHORT).show()

    }
}