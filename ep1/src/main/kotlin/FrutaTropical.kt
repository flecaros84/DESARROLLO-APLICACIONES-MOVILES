//Defino clase FrutaLocal con valores por defecto y nuevo atributo país
class FrutaTropical (nombre:String="fruta tropical",  precioPorKilo:Int= 1500, stockKilos:Double = 0.0, var pais: String):
    Fruta(nombre = nombre, precioPorKilo = precioPorKilo, stockKilos = stockKilos ) {

    //Sobreescribo la info
    override var info = "Es un(a) $nombre importado"

    //Sobreescribo función de descripción
    override fun descripcion():String{
        return("nombre de la fruta: $nombre, precio ($/kg): $precioPorKilo, stock(kg): $stockKilos, info: $info proveniente de $pais")
    }
}