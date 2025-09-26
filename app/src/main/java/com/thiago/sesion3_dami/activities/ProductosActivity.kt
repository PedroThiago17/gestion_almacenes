package com.thiago.sesion3_dami.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thiago.sesion3_dami.R
import com.thiago.sesion3_dami.adapter.ProductAdapter
import com.thiago.sesion3_dami.model.Product

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        // Get views
        val lblStoreName = findViewById<TextView>(R.id.lblStoreName)
        val lblStoreAddress = findViewById<TextView>(R.id.lblStoreAddress)
        val rvProducts = findViewById<RecyclerView>(R.id.rvProducts)

        // Obtain data from intent
        val storeId = intent.getIntExtra("STORE_ID", -1)
        val storeName = intent.getStringExtra("STORE_NAME") ?: "Tienda"
        val storeAddress = intent.getStringExtra("STORE_ADDRESS") ?: ""

        // Show info
        lblStoreName.text = storeName
        lblStoreAddress.text = storeAddress

        // Filer products by store
        val products = Product.getProducts().filter { it.storeId == storeId }

        // Config RecyclerView
        rvProducts.layoutManager = LinearLayoutManager(this)
        rvProducts.adapter = ProductAdapter(products)
    }
}