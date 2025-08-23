//Comentario Kotlin
//Variables

fun main(){
    //val no permite cambiar su valor // Const
    val nombre:String = "Kotlin"

    val version = "2.0"

    //Variable que si puede cambiar su valor
    var year = 2025
    year = year +1

    //Literale númericos con guiones bajos para mejorar legibilidad
    val grande = 1_000_000

    //Impresión de nuestra variables
    print("Hola $nombre, $version, $year,cifra grande = $grande")

}