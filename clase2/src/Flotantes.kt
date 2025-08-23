fun main(){
    val x: Float = 3.5F //Sufijo para declarar un valor flotante
    val y: Double = 1.2 //Asume por defecto que es un dato de este tipo
    val suma = x + y
    val multiplicacion = x * 10
    val division = x /0.5

    //Ejemplo de precisión
    val p = 0.1 + 0.2

    println("x = $x, y = $y, suma = $suma, multiplicacion = $multiplicacion, division = $division, 0.1 + 0.2 = $p")

    //Formateo usando String.format de Java
    val formateado = String.format("p=%.2f",p)

    println(formateado)

}