//Defino clase FrutaLocal con valores por defecto y nuevo atributo región
class FrutaLocal (nombre: String="fruta local", precioPorKilo:Int= 500, stockKilos:Double = 0.0, var region: Int):
    Fruta(nombre = nombre, precioPorKilo = precioPorKilo, stockKilos = stockKilos ) {

    //Sobreescribo la info
    override var info = "Es un(a) $nombre fresco(a)"

    //Sobreescribo función de descripción
    override fun descripcion():String{
        return("nombre de la fruta: $nombre, precio ($/kg): $precioPorKilo, stock(kg): $stockKilos, info: $info proveniente de la región N° $region de Chile")
    }
}