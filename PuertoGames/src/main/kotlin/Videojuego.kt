class Videojuego(
    private val nombre: String,
    private val genero: String,
    private val anio: Int,
    private val desarrollador: String,
    private val precio: Int
): Producto(){
    //implementar el contrato
    override fun descripcion(): String {
        return "$nombre ($genero $anio) - $desarrollador - $$precio CLP"
    }

    //opcional precioFinal
    override fun precioFinal(): Int {
        return (precio * 1.19).toInt()
    }

    //método exclusivo de la clase
    fun esRetro(): Boolean{
        return anio < 2010 //true
    }
}
