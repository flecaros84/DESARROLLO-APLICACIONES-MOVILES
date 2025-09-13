//Clase inventario, que maneja el inventario de una sucursal

class Inventario (
    private val id : String) {

    //Lista de pescados
    private val inventario = mutableListOf<Pescado>()


    //Función agrega un pescado
    fun agregarPescado(p : Pescado){
        inventario.add(p)
    }

    //Mostrar el inventario
    fun mostrarInventario(): String{
        if(inventario.isEmpty()) return "No hay pescados."
        //else
        return inventario.joinToString(separator= "\n"){ pescado ->
            "${pescado.descripcion()}"
        }
    }

    //Mostrar pescados con precio mayor a un valor determinado
    fun mostrarMayoresPrecio(precio: Int): List<Pescado>{
        return inventario.filter { it.precioPorKilo>precio}
    }

    // función para calcular el valor total del stock (precioPorKilo * stockKilos)
    fun valorTotalStock(): Double {
        return inventario.sumOf { it.precioPorKilo.toDouble() * it.stockKilos }
    }

    suspend fun revisionCalidad() {
        for (p in inventario) {
            when (val r = controlarCalidad(p)) {
                is ResultadoCalidad.Exitoso -> println("✅ ${r.detalle}")
                is ResultadoCalidad.Error   -> println("❌ ${r.motivo}")
            }
        }
    }


}