//data class, solo lo declaramos
data class Producto(var nombre: String, var precio: Int)

//
fun main(){
    //creamos un objeto de Producto
    val producto = Producto("Mouse Xtitan",10000)

    //apply = poder modificar un objeto en un bloque de código especifico

    //Llamar objeto, aplicar apply... lo que quiero modificar
    producto.apply{
        precio -= 2000
    }

    producto.apply{
        nombre = "Red Dragon"
    }

    //Transformo a String y muestro el resultado
    //let = Tomar un objeto, hacer algo con él y posteriormente devolverlo
    //Con let puedo utilizar it para hacer referencia al mismo objeto
    val productoFinal = producto.let{
        "Producto Final: ${it.nombre} ahora con descuento cuesta ${it.precio}"
    }
    println(productoFinal)
}