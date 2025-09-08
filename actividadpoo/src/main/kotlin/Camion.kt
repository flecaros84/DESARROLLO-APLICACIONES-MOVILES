class Camion(
    override val tipo_energia: String = "petróleo"
):
TransporteCarga(){
    override fun capacidad_energia(): Double{
        return capacidad_energia()
    }

    override fun rendimiento(): Double{
        return rendimiento()
    }

    override fun costo_envio(): Double{
        return costo_envio()
    }

}