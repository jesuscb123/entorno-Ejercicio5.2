data class Producto(val nombre: String, val descrip: String, val precio: Double, val impuestos: Double, val stock: Int){


    fun consultarStock(){
        println(stock)

    }


}