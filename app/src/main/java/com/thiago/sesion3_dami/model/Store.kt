package com.thiago.sesion3_dami.model

import java.io.Serializable

class Store : Serializable {
    var id: Int = 0
    var name: String = ""
    var address: String = ""
    var x: Double = 0.0
    var y: Double = 0.0

    constructor(id: Int, name: String, address: String, x: Double, y: Double) {
        this.id = id
        this.name = name
        this.address = address
        this.x = x
        this.y = y
    }

    companion object {
        fun getStores(): List<Store> {
            return listOf(
                Store(1, "Warehouse Central", "Jirón Pizarro 142", -8.1119, -79.0289),
                Store(2, "Warehouse Esperanza", "Av. Gran Chimu 1575", -8.0902, -79.0099),
                Store(3, "Warehouse Porvenir", "El Arco del Porvenir", -8.1090, -79.0240),
                Store(4, "Warehouse Trujillo", "Av. Mansiche 1578", -8.1140, -79.0100),
                Store(5, "Warehouse Buenos Aires", "Av. Larco 1248", -8.1095, -79.0300),
                Store(6, "Warehouse Florencia de Mora", "Av. 20 de Julio 1248", -8.0860, -79.0200)
            )
        }
    }
}