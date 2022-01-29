package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    object  Constance {
        const val DIRECTOR_PASSWORD = "1111"
        const val INJENER_PASSWORD = "2222"
        const val RAB_PASSWORD = "3131"
        const val DIRECTOR_NAME = "юрий"
        const val INJENER_NAME = "игорь"
        const val RAB_NAME = "андрей"
        const val DIRECTOR_CASH = "100000"
        const val INJENER_CASH = "5000"
        const val RAB_CASH = "250"
    }
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener() {
            bindingClass.imageView.visibility = View.GONE
            val result = bindingClass.name.text.toString().lowercase()
            bindingClass.tvResult.visibility = View.VISIBLE
            when(result) {
            Constance.DIRECTOR_NAME ->  {
                                if (bindingClass.etPas.text.toString() == Constance.DIRECTOR_PASSWORD) {
                                val tempText = "Здравствуйте, ${Constance.DIRECTOR_NAME}, получите Ваши ${Constance.DIRECTOR_CASH} рублей!"
                                bindingClass.tvResult.text = tempText
                                    bindingClass.imageView.setImageResource(R.drawable.icon1)
                                    bindingClass.imageView.visibility = View.VISIBLE
                                } else bindingClass.tvResult.text = "Некорректно введено имя или пароль!"}

            Constance.INJENER_NAME -> {
                if (bindingClass.etPas.text.toString() == Constance.INJENER_PASSWORD) {
                    val tempText = "Здравствуйте, ${Constance.INJENER_NAME}, получите Ваши ${Constance.INJENER_CASH} рублей!"
                    bindingClass.tvResult.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.icon1)
                    bindingClass.imageView.visibility = View.VISIBLE
                } else bindingClass.tvResult.text = "Некорректно введено имя или пароль!"}
            Constance.RAB_NAME -> {
                if (bindingClass.etPas.text.toString() == Constance.RAB_PASSWORD) {
                    val tempText = "Здравствуйте, ${Constance.RAB_NAME}, получите Ваши ${Constance.RAB_CASH} рублей!"
                    bindingClass.tvResult.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.icon1)
                    bindingClass.imageView.visibility = View.VISIBLE
                } else bindingClass.tvResult.text = "Некорректно введено имя или пароль!"}
            else -> { bindingClass.tvResult.text = "Такого работника нет!"

              } }

        }
    }
}