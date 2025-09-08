import kotlinx.coroutines.*
//Suspend marca una función para que se pueda pausar su ejecución, no bloquea el hilo principal

suspend fun saludarConRetraso(nombre: String){

    //Simular una espera de 2s
    delay(2000L)
    println("Hola $nombre")
}

//Se utiliza normalmente en el main para poder ejecutar fun suspend
//RunBlocking = bloquea el hilo principal hasta que la corrutina termine
//Solo en medios de prueba o test, por que muy fácil manipular desde producción
fun main() = runBlocking{
    //hilo principal
    println("Preparando un saludo con retraso")

    saludarConRetraso("Fabián")

    println("Saludo finalizado")
}