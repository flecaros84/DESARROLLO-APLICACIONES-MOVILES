abstract class Producto {
    //Clase abstracta para que las clases hijas se implementen

    //Método o fun abstracto si o si debe implementar
    abstract fun descripcion(): String

    //Método que va a ser opcional = open
    open fun precioFinal(): Int = 0
}