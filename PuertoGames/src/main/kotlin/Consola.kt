class Consola (
    private val modelo:String,
    private val fabricante: String,
    private val precio: Int,
    private val stock: Int
): Producto(){
    //descripción
    override fun descripcion(): String {
        return "🕹 $modelo  de  $fabricante️- $precio CLP ($stock unidades disponibles)"
    }

    //precio final
    override fun precioFinal(): Int{
        //10% de descuento
        return (precio * 0.9).toInt()
    }

    //si tiene stock
    fun tieneStock(): Boolean{
        return stock > 0
    }
}