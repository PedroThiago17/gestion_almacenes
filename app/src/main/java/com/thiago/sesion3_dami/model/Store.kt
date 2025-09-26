package com.thiago.sesion3_dami.model

class Store {
    var id: Int = 0
    var name: String = ""
    var address: String = ""

    constructor(id: Int, name: String, address: String) {
        this.id = id
        this.name = name
        this.address = address
    }

    companion object {
        fun getStores(): List<Store> {
            return listOf(
                Store(1, "Warehouse Central", "Jirón Pizarro 142"),
                Store(2, "Warehouse Esperanza", "Av. Gran Chimu 1575"),
                Store(3, "Warehouse Porvenir", "El Arco del Porvenir"),
                Store(4, "Warehouse Trujillo", "Av. Mansiche 1578"),
                Store(5, "Warehouse Buenos Aires", "Av. Larco 1248"),
                Store(6, "Warehouse Florencia de Mora", "Av. 20 de Julio 1248")
            )
        }
    }
}