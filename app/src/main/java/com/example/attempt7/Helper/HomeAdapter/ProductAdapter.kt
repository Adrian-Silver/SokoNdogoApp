package com.example.attempt7.Helper.HomeAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.attempt7.Helper.HomeAdapter.ProductAdapter.ProductViewHolder
import com.example.attempt7.R
import java.util.*

class ProductAdapter(var productLocations: ArrayList<ProductHelperClass>) :
    RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_design, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val productHelperClass = productLocations[position]
        holder.image.setImageResource(productHelperClass.getImage())
        holder.name.text = productHelperClass.getName()
        holder.price.text = productHelperClass.getPrice()
    }

    override fun getItemCount(): Int {
        return productLocations.size
    }

    class ProductViewHolder(itemView: View) : ViewHolder(itemView) {
        var image: ImageView
        var name: TextView
        var price: TextView

        init {

//            Hooks
            image = itemView.findViewById(R.id.product_img)
            name = itemView.findViewById(R.id.product_name)
            price = itemView.findViewById(R.id.product_price)
        }
    }
}