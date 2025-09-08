import kotlinx.coroutines.*;

fun main() = runBlocking {

    val scope = CoroutineScope(Dispatchers.Default)

    //Tareas en paralelo
    scope.launch{
        delay(500L)
        println("Cocinando arroz...")
        delay(2000L)
        println("Arroz listo!!")
    }

    scope.launch{
        delay(500L)
        println("Cocinando papas fritas...")
        delay(1500L)
        println("Papas fritas listas!!")
    }

    scope.launch{
        delay(500L)
        println("Preparando jugo...")
        delay(1000L)
        println("Jugo listo!!")
    }

    //Imprima el mensaje inicial:
    println("Iniciando cocina inteligente...")
    delay(600L)
    println("Preparando la mesa...")
    delay(2500L)
    println("Cocina completa, se sirve la mesa")



}