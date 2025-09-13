import kotlinx.coroutines.*

sealed class ResultadoCalidad {
    data class Exitoso(val detalle: String) : ResultadoCalidad()
    data class Error(val motivo: String) : ResultadoCalidad()
}

suspend fun controlarCalidad(pescado: Pescado): ResultadoCalidad {
    println("Revisando ${pescado.nombre}...")
    delay(1200)
    return when {
        pescado.precioPorKilo < 5000 ->
            ResultadoCalidad.Error("Rechazado: ${pescado.nombre} de baja calidad (${pescado.precioPorKilo}$/kg, bajo los 5000$/kg)")
        else ->
            ResultadoCalidad.Exitoso("Aprobado: ${pescado.nombre} (${pescado.precioPorKilo}$/kg, ${pescado.stockKilos} kg)")
    }
}
