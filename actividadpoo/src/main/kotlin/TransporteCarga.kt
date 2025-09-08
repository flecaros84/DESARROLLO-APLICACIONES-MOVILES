abstract class TransporteCarga {

    //Valores abstractos, atributos comunes de los transportes

    //atributos por defecto del caso
    var patente: String = ""
    var peso: Double = 0.0
    var capacidad_peso: Double = 0.0

    //tipo de energía del transporte: eléctrico, diesel, petróleo, etc.
    abstract val tipo_energia: String

    //Métodos abstractos que deben implementarse

    //capacidad del estanque
    abstract fun precio_energia(): Double

    //rendimiento del transporte por kilometro
    abstract fun rendimiento(): Double

    //costo de envío
    abstract fun costo_envio(): Double
}