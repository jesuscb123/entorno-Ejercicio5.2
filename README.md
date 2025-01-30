### a) Los elementos que te has encontrado en UML y que tienen mapeo sobre conceptos orientados a objetos.

Clases:  Cliente, Pedido y Producto. Estas clases tienen atributos y métodos que representan su comportamiento y estado.
Atributos: Cada clase tiene atributos que almacenan información relevante. Por ejemplo, Cliente tiene nombre y email, mientras que Producto tiene precio, impuestos, etc.
Métodos: Se representan en cada clase con el prefijo +, como realizarPedido() en Cliente y calcularCoste() en Pedido.
Enumeraciones: Se utilizan para definir valores predefinidos en los estados del pedido (EstadoPedido) y los tipos de pago (tipoPago), lo que en código se puede representar con enum.
Relaciones: Se identifican asociaciones entre clases. Por ejemplo:
Cliente y Pedido tienen una relación 1 a * (un cliente puede hacer varios pedidos).
Pedido y Producto tienen una relación de 1 a * (un pedido puede incluir varios productos).
Pedido tiene relación con el método de pago mediante tipoPago.
Clases de datos (Data Classes): cheque y tarjeta representan datos específicos para ciertos métodos de pago.


### b) Explicación de la herramienta que has utilizado parra generar el diagrama UML, y si la has contrastado con otra y conclusiones de porque has elegido esa.

Elegí draw.io debido a que puedes crear las clases rápidamente ya que tiene elementos que son específicos para UML.

### c) Explicación sobre la conversión del diagrama UML al código, explicando las decisiones que has tomado. No tiene porque ser el codigo completo, pero si un esquema de lo que podría llegar a ser. 

He creado las clases Cliente, Pedido y Producto.

Uso de enum para los estados y tipos de pago.

Creación de métodos para que, por ejemplo, el cliente pueda realizar un pedido y añadirlos a una lista de pedidos del cliente.

Implementar relaciones: ciente tendrá una lista de Pedido como atributo, Pedido tendrá una lista de Producto y un atributo para el tipo de pago.



