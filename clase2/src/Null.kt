fun main(){
    val edadNoNula: Int = 20 // es un entero y dato primitivo, no puede ser null
    val edadNula: Int? = null // puede ser null
    //JVM null lo convierte a un objeto y al ser un objeto deja de ser un dato primitivo
    //primitivos son Int, Boolean, Double


    //llamada segura
    val dobleEdad = edadNula?.times(2) //multiplica

    //Elvis = provee un valor por defecto cuando el lado izquierdo es null
    val edadEfectiva = edadNula ?:18 // seria el primer valor usado

    println("edadNoNula: $edadNoNula, doubleEdad: $dobleEdad, edadEfectiva = $edadEfectiva")


}