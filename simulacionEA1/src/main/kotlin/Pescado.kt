//En la clase abstracta defino los atributos comunes de cada pescado
abstract class Pescado(val nombre: String, val precioPorKilo: Int, val stockKilos: Double) {

    //Variable abierta para completar con la info del pescado
    open var info: String = ""

    //Función para descripción, abstracta
    abstract fun descripcion(): String
}


