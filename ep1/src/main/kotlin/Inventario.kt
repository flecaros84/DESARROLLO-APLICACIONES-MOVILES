//Clase inventario, que maneja el inventario de una sucursal

class Inventario (
    private val id : String) {

    //Lista de pescados
    private val inventario = mutableListOf<Fruta>()


    //Función agrega un pescado
    fun agregarFruta(f : Fruta){
        inventario.add(f)
    }

    //Mostrar el inventario
    fun mostrarInventario(): String{
        if(inventario.isEmpty()) return "No hay frutas."
        //else
        return inventario.joinToString(separator= "\n"){ fruta ->
            "${fruta.descripcion()}"
        }
    }

    // Función para mostrar productos con precio mayor a un valor determinado
    fun mostrarMayoresPrecio(precio: Int): List<Fruta>{
        return inventario.filter { it.precioPorKilo>precio}
    }

    // Función para calcular el valor total del stock (precioPorKilo * stockKilos)
    fun valorTotalStock(): Double {
        return inventario.sumOf { it.precioPorKilo.toDouble() * it.stockKilos }
    }

    // Función para revisión de calidad
    suspend fun revisionCalidad(precioCalidad: Int) {
        for (p in inventario) {
            when (val r = controlarCalidad(p, precioCalidad )) {
                is ResultadoCalidad.Exitoso -> println("✅ ${r.detalle}")
                is ResultadoCalidad.Error   -> println("❌ ${r.motivo}")
            }
        }
    }


}