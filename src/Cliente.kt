class Cliente(val nombre: String, val email: String){
    val listaPedidos = mutableListOf<Pedido>()

    fun realizarPedido(pedido: Pedido){
        listaPedidos.add(pedido)

    }

}