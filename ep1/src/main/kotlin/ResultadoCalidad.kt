import kotlinx.coroutines.*

sealed class ResultadoCalidad {
    data class Exitoso(val detalle: String) : ResultadoCalidad()
    data class Error(val motivo: String) : ResultadoCalidad()
}

suspend fun controlarCalidad(fruta: Fruta, precioCalidad: Int): ResultadoCalidad {
    println("Revisando ${fruta.nombre}...")
    delay(1200)

    return when {
        fruta.precioPorKilo < precioCalidad ->
            ResultadoCalidad.Error("Rechazada: ${fruta.nombre} de baja calidad (${fruta.precioPorKilo}$/kg, bajo los $precioCalidad $/kg)")
        else ->
            ResultadoCalidad.Exitoso("Aprobada: ${fruta.nombre} (${fruta.precioPorKilo}$/kg, ${fruta.stockKilos} kg)")
    }
}
