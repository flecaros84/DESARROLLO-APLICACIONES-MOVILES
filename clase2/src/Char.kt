fun main(){
    val letra:Char = 'a'
    val digito:Char = '7'

    val esLetra = letra.isLetter() //true
    val esDigito = digito.isDigit() //true

    val mayus = letra.uppercaseChar() //'A'
    var cursor = 'b' //var para modificar
    cursor ++

    println("letra= $letra, (esletra=$esLetra), digito= $digito, (esDigito= $esDigito), mayus = $mayus, cursor = $cursor")


}