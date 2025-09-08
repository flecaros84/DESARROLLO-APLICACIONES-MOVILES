import kotlinx.coroutines.*;

//GlobalScope es un ambito global que permite lanzar corrutinas que viven durante toda la ejecución
//Se crea un nuevo hilo de ejecución de manera paralela

fun main(){
    println("1- Preparar la pizza")

    GlobalScope.launch{
        delay(2000L)
        println("La pizza esta lista para sacarla del horno")
    }

    //Optimizo tiempo mientras
    println("Preparando la mesa y una ensalada")

    Thread.sleep(2000L)
    println("Me siendo a comer la pizza")
}