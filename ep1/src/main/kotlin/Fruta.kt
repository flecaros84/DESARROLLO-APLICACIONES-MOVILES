//En la clase abstracta defino los atributos comunes de cada fruta
abstract class Fruta(val nombre: String, val precioPorKilo: Int, val stockKilos: Double) {

    //Variable abierta para completar con la info de la fruta
    open var info: String = ""

    //Función para descripción, abstracta
    abstract fun descripcion(): String
}