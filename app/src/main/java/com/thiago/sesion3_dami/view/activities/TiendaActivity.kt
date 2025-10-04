package com.thiago.sesion3_dami.view.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.thiago.sesion3_dami.R
import com.thiago.sesion3_dami.model.Store

class TiendaActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private val stores = Store.getStores()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tienda)

        listView = findViewById(R.id.lvStores)

        val nameStores = stores.map {"${it.id} - ${it.name}"}

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameStores)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val store = stores[position]

            val intent = Intent(this, ProductosActivity::class.java).apply {
                putExtra("STORE_OBJ", store)
            }

            startActivity(intent)
        }
    }
}