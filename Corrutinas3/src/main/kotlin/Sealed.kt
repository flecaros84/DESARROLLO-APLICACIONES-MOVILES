// Sealed class es una clase sellada y se usa cuando quieres controlar todos los tipos de datos
// Que puede tener una variable

//Es decir, solo se puede utilizar o heredar dentro del mismo archivo

//se declara e indicamo que aqui parte la jerarquia cerrada
sealed class Resultado

data class Exito(val mensaje: String) : Resultado()

data class Error(val mensaje: String) : Resultado()

//Funcion que valide el resultado y muestre un mensaje de error o exito

fun mostrarMensaje(resultado:Resultado){
    //utilizar when para evaluar el tipo de mensaje
    when(resultado){
        //función lambda son funciones anónimas, no tienen nombre, y son automáticas
        is Exito -> println("${resultado.mensaje}") //exito
        is Error -> println("${resultado.mensaje}") //error
    }
}

fun main(){
    val r1: Resultado = Exito("Acceso correcto puedes pasar al dashboard")
    val r2: Resultado = Error("Acceso incorrecto, vuelve a intentarlo")

    println(r1)
    println(r2)
}