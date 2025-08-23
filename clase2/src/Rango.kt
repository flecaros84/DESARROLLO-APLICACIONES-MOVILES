fun main(){
    //rango
    val r = 1..5
    val dentro = 3 in r
    val fuera = 19 in r

    val pares = 0..10 step 2
    val desendente = 5 downTo 1

    val letras = 'a'..'z'
    val esLetra = 'k' in letras // true

    //Rangos iterables
    val primero = r.first //1
    val ultimo = r.last //5
    val tamanio = r.count() //5
    val pareComoLista = pares.toList()

    //Recorrer un rango con for
    var suma = 0

    for (n in r){
        suma += n
    }

    println("dentro= $dentro, fuera=$fuera, pares=$pares, suma=$suma, desendente=$desendente, esLetra=$esLetra")
    println("primero = $primero, ultimo = $ultimo, tamaño = $tamanio, pareComoLista=$pareComoLista")

}