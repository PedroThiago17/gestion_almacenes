package com.thiago.sesion3_dami.model

class Product {
    var id: Int = 0
    var description: String = ""
    var stock: Int = 0
    var storeId: Int = 0

    constructor(id: Int, description: String, stock: Int, storeId: Int) {
        this.id = id
        this.description = description
        this.stock = stock
        this.storeId = storeId
    }

    companion object{
        fun getProducts(): List<Product> {
            return listOf(
                // Tienda 1
                Product(1, "Keyboard", 23, 1),
                Product(2, "Mouse", 17, 1),
                Product(3, "Monitor", 11, 1),
                Product(4, "CPU", 45, 1),
                Product(5, "RAM 8GB", 30, 1),
                Product(6, "SSD 512GB", 18, 1),
                Product(7, "Router", 25, 1),
                Product(8, "Laptop Stand", 10, 1),
                Product(9, "USB Hub", 40, 1),
                Product(10, "Webcam HD", 12, 1),

                // Tienda 2
                Product(11, "Mousepad", 21, 2),
                Product(12, "Mechanical Keyboard", 15, 2),
                Product(13, "Gaming Mouse", 29, 2),
                Product(14, "Portable SSD", 33, 2),
                Product(15, "External HDD", 9, 2),
                Product(16, "USB-C Hub", 13, 2),
                Product(17, "Bluetooth Speaker", 27, 2),
                Product(18, "WiFi Adapter", 16, 2),
                Product(19, "HDMI Cable", 35, 2),
                Product(20, "Graphics Card", 7, 2),

                // Tienda 3
                Product(21, "Motherboard", 20, 3),
                Product(22, "Processor i5", 14, 3),
                Product(23, "RAM 16GB", 38, 3),
                Product(24, "Power Supply", 26, 3),
                Product(25, "Cooling Fan", 11, 3),
                Product(26, "Thermal Paste", 19, 3),
                Product(27, "Case ATX", 8, 3),
                Product(28, "LED Strip", 42, 3),
                Product(29, "PCIe Adapter", 10, 3),
                Product(30, "CMOS Battery", 5, 3),

                // Tienda 4
                Product(31, "Tablet 10\"", 24, 4),
                Product(32, "Bluetooth Keyboard", 17, 4),
                Product(33, "Smartphone Holder", 13, 4),
                Product(34, "Monitor 24\"", 36, 4),
                Product(35, "USB-C Cable", 31, 4),
                Product(36, "Smartwatch", 14, 4),
                Product(37, "HDMI Splitter", 19, 4),
                Product(38, "MicroSD 128GB", 40, 4),
                Product(39, "Wireless Mouse", 22, 4),
                Product(40, "Speaker Set", 10, 4),

                // Tienda 5
                Product(41, "Laptop 15\"", 8, 5),
                Product(42, "USB Flash 64GB", 28, 5),
                Product(43, "Cooling Pad", 30, 5),
                Product(44, "Headset Gamer", 18, 5),
                Product(45, "Ethernet Cable", 32, 5),
                Product(46, "Power Bank", 25, 5),
                Product(47, "Projector", 6, 5),
                Product(48, "HD Webcam", 15, 5),
                Product(49, "USB Extension", 19, 5),
                Product(50, "Adapter VGA-HDMI", 12, 5),

                // Tienda 6
                Product(51, "Surge Protector", 27, 6),
                Product(52, "Mini PC", 13, 6),
                Product(53, "DisplayPort Cable", 20, 6),
                Product(54, "Wireless Charger", 11, 6),
                Product(55, "Android TV Box", 22, 6),
                Product(56, "Microphone USB", 16, 6),
                Product(57, "Digital Camera", 9, 6),
                Product(58, "Tripod Stand", 7, 6),
                Product(59, "Smart Light Bulb", 14, 6),
                Product(60, "Bluetooth Adapter", 17, 6)
            )

        }
    }
}