class Pedido(val estado: EstadoPedido, val tipoPago: tipoPago){
    val listaProductos = mutableListOf<Producto>()

    fun calcularCoste(): Double{
        var costeTotal = 0.0
        for(producto in listaProductos){
            costeTotal += producto.precio
        }
        return costeTotal
    }

}
