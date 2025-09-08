import kotlinx.coroutines.*;

fun main() = runBlocking {

    //Dispatchers = despachador
    //CoroutineScope(Dispatchers.Default)== crea un amnito de corrutinas y lo almacena en scope
    //Ejecutar corrutinas en bloques separados = horno separados
    val scope = CoroutineScope(Dispatchers.Default)

    scope.launch{
        delay(2000L)
        println("Postre leche asada en el horno")
    }

    scope.launch{
        delay(3000L)
        println("Plato principal, pollito asado en el horno")
    }

    println("Organizando la cocina y encendiendo horno")
    delay(4000L)

    println("Comida lista para servir al comenzal que da propina")

}