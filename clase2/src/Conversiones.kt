fun main(){
    //Conversiones de tipos de datos
    val textoNumero = "123"
    val n1 = textoNumero.toInt() //Convierte a un Int
    val n2 = textoNumero.toDouble() //Convierte a un Double o decimal
    val n3 = 42.toString() //42 = "42"

    val peligro = "abc" //no es un número valido
    val convertidoSeguro = peligro.toIntOrNull()

    println("n1 = $n1, n2 = $n2, n3 = $n3")
    println("convertidoSeguro = $convertidoSeguro")


}