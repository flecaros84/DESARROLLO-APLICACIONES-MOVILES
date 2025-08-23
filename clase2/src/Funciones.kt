//función tradicional nombre(argumento: tipo): tipo_retorno
fun esMayorDeEdad(edad:Int): Boolean{
    return edad >= 18
}

//Funciones de una sola expresión
fun doble (n:Int)=n*2

//Función de orden superior, recibe una segunda función como parámetro
fun aplicarLista(numeros: List<Int>, operacion:(Int)->Int): List<Int>{
    //Operación que toma un int de otra función, retorna otro int
    return numeros.map(operacion)
}

fun main(){
    println("19 es un adulto: ${esMayorDeEdad(19)}")
    println("Doble de 7 ${doble(7)}")

    val triple: (Int) -> Int = {n-> n*3} //Parámetro , Resultado

    val base = listOf(1,2,3)

    val triplicados = aplicarLista(base, triple)
    println("Triplicados: $triplicados")

}