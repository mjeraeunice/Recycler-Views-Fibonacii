package com.mjera.recyclerviewss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvFibonacii:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvFibonacii=findViewById(R.id.rvFibonacii)
        var numbers= listOf(2,7,9,10,11,15)

        val fibonaciiAdapter=FibonaciiRvAdapter(numbers)
        rvFibonacii.layoutManager=LinearLayoutManager(this)
        rvFibonacii.adapter=fibonaciiAdapter
    }
}