package com.thiago.sesion3_dami.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thiago.sesion3_dami.R
import com.thiago.sesion3_dami.model.Product

class ProductAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtProductDesc: TextView = itemView.findViewById(R.id.txtProductDesc)
        val txtProductInfo: TextView = itemView.findViewById(R.id.txtProductInfo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_product_card, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.txtProductDesc.text = product.description
        holder.txtProductInfo.text = "ID: ${product.id} | Stock: ${product.stock}"
    }

    override fun getItemCount(): Int = products.size
}