//Data class es un tipo de clase que me permite modelar datos de forma simple y ordenada

//data class
data class Contacto(val nombre: String, val telefono: String)

fun main(){
    val cliente1 = Contacto("Marcelo","+56923456789")
    val cliente2 = Contacto("Panchito","+56923456222")
    val cliente3 = Contacto("Panchito","+56923456222")

    //ToString muestra todos los datos
    println("ToString: $cliente1")

    println("Son iguales?  ${cliente2==cliente3}")
    println("Son diferentes?  ${cliente1==cliente3}")

    //Hashcode asignar un número a una caja = val o var
    println("HashCode ${cliente1.hashCode()}")

    //Uso de copy() = copiar un elemento
    val cliente4 = cliente2.copy(telefono = "+569287363" )
    println("${cliente4.nombre} con nuevo número ${cliente4.telefono}")

}