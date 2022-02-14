package com.example.recycletest

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycletest.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {

val plantList = ArrayList<Plant>()

    class PlantHolder(item: View):RecyclerView.ViewHolder(item) {
        val binding = PlantItemBinding.bind(item)
        fun bind(plant: Plant)= with(binding){
            imageView4.setImageResource(plant.img_ID)
            textView9.text = plant.tittle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item,parent,false)
    return  PlantHolder(view)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        holder.bind(plantList[position])
    }

    override fun getItemCount(): Int {
        return plantList.size
    }

    fun addPlant(plant: Plant){
        plantList.add(plant)
        notifyDataSetChanged()
    }
}