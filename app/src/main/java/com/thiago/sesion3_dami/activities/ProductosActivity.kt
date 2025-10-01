package com.thiago.sesion3_dami.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
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
import com.thiago.sesion3_dami.model.Store

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        // Get views
        val lblStoreName = findViewById<TextView>(R.id.lblStoreName)
        val lblStoreAddress = findViewById<TextView>(R.id.lblStoreAddress)
        val rvProducts = findViewById<RecyclerView>(R.id.rvProducts)
        val btnLink = findViewById<ImageView>(R.id.ivGoMap)

        // Obtain data from intent
        val storeObj = intent.getSerializableExtra("STORE_OBJ") as? Store

        btnLink.setOnClickListener {
            val intent = Intent(this, TiendaDetalleActivity::class.java)
            intent.putExtra("STORE_OBJ", storeObj)
            startActivity(intent)
        }

        // Show info
        lblStoreName.text = storeObj?.name
        lblStoreAddress.text = storeObj?.address

        // Filer products by store
        val products = Product.getProducts().filter { it.storeId == storeObj?.id }

        // Config RecyclerView
        rvProducts.layoutManager = LinearLayoutManager(this)
        rvProducts.adapter = ProductAdapter(products)
    }
}