//Defino clase Salmon con valores por defecto y nuevo atributo color
class Salmon (precioPorKilo:Int= 10000, stockKilos:Double = 0.0, var color: String):
    Pescado(nombre = "salmón", precioPorKilo = precioPorKilo, stockKilos = stockKilos ) {

        //Sobreescribo la info
        override var info = "Es un rico $nombre"

    //Sobreescribo función de descripción
    override fun descripcion():String{
        return("nombre del pescado: $nombre, info: $info de color $color, precio ($/kg): $precioPorKilo, stock(kg): $stockKilos ")
    }
}