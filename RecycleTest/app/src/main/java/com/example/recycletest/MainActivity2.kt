package com.example.recycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recycletest.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private   val listPlante1 = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5
    )
    private var index: Int =1
    private var im_Id = R.drawable.plant1



    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()


    }
    private  fun initButtons() = with(binding){
        button5.setOnClickListener {
          im_Id = listPlante1[index]
              imageView2.setImageResource(im_Id)
            index++
            if (index > 4) index = 0

        }
        button6.setOnClickListener {
            val plant = Plant(im_Id, editTittle.text.toString(), editDesc.text.toString())
           val editIntent = Intent().apply {
               putExtra("plant", plant)
           }
            setResult(RESULT_OK, editIntent)
            finish()


        }
    }


}