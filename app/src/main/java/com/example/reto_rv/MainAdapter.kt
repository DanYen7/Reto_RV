package com.example.reto_rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reto_rv.databinding.ItemCarritoBinding
import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCarritoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position])
    }

    override fun getItemCount(): Int = videos.size

    class MainHolder(val binding: ItemCarritoBinding): RecyclerView.ViewHolder(binding.root){

        fun render(prod: JSONObject){
            binding.tvProdTitle.setText(prod.getString("title"))
            binding.tvVendName.setText(prod.getString("saler"))
            binding.tvPrecio.setText(prod.getString("price"))
            binding.ivProd.setImageResource(R.drawable.carrito)
        }
    }
}