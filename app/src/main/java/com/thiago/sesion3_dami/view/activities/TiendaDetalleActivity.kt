package com.thiago.sesion3_dami.view.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.thiago.sesion3_dami.R
import com.thiago.sesion3_dami.view.fragments.MapFragment
import com.thiago.sesion3_dami.model.Store

class TiendaDetalleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tienda_detalle)

        val lblStoreName = findViewById<TextView>(R.id.lblStoreName2)
        val lblStoreAddress = findViewById<TextView>(R.id.lblStoreAddress2)

        val storeObj = intent.getSerializableExtra("STORE_OBJ") as? Store

        lblStoreName.text = storeObj?.name
        lblStoreAddress.text = storeObj?.address

        val bundle = Bundle().apply {
            putDouble("x", storeObj?.x ?: -8.112334)
            putDouble("y", storeObj?.y ?: -79.028845)
        }

        val fragment = MapFragment()
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fcvFragmentMap, fragment) // ID del FragmentContainerView
            .commit()
    }
}