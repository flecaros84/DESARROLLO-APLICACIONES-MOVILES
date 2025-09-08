import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Ingrese el nombre o la ruta del archivo a leer")
    val nombreArchivo = readLine()?:""

    try{
        //Intentar leer el archivo si existe
        val contenido = File(nombreArchivo).readText()
        println("Contenido del archivo: \n$contenido")
    }catch (e: FileNotFoundException){
        //Se va a ejecutar si el archivo no existe
        println("Error el archivo: $nombreArchivo no existe")
    }catch (e: Exception){
        //Cualquier error inesperado
        println("error inesperado: ${e.message}")
    }


}