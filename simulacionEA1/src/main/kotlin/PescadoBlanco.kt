//Defino clase Pescado con valores por defecto y nuevo atributo espinas
class PescadoBlanco (precioPorKilo:Int= 5000, stockKilos:Double = 0.0, var espinas: Boolean):
    Pescado(nombre = "pescado blanco", precioPorKilo = precioPorKilo, stockKilos = stockKilos ) {

    //Sobreescribo la info
    override var info = "Es un exótico $nombre"

    //Sobreescribo función de descripción
    override fun descripcion():String{
        return("nombre del pescado: $nombre, info: $info, ¿Tiene espinas?: $espinas, precio ($/kg): $precioPorKilo, stock(kg): $stockKilos ")
    }
}