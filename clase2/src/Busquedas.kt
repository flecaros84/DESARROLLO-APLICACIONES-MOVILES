fun main(){

    val edades = listOf(18,20,30,16,22,20)

    //Busquedas
    val primeraMayor18 = edades.find{ it > 18}
    println("Primer dato mayor a 18: $primeraMayor18")

    val hayMenores = edades.any{it < 18} //existe algún menor de edad
    println("Hay menor: $hayMenores")

    val todoAdultos = edades.all{it >= 18}
    println("Todos los mayores: $todoAdultos")

    val edadesDobles = edades.map{it*2}
    println("Edades x 2: $edadesDobles")

    //Filtro
    val soloAdultos = edades.filter{it >= 18}
    println("Filtrando solo adultos: $soloAdultos")

    //Reducción/Suma
    val suma = edades.sum()
    println("Suma de todas las edades: $suma")

    val promedio = edades.average()
    println("Promedio de las edades: $promedio")

    
}