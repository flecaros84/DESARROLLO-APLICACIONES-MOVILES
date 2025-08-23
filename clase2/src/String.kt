fun main(){

    val nombre = "marcelo"
    val curso = "Aplicaciones móviles con Kotlin"

    //Concatenación (+) y template
    //Concatenación

    val saludo1 = "Hola" + nombre + "bienvenido a el curso de "+ curso

    //Template
    val saludo2 = "Hola $nombre, bienvenido al curso de $curso"

    //Expresiones
    val modulos = 5
    val mensaje = "Hoy veremos ${modulos*2} ejemplos de código."

    //Métodos de String
    val largo = nombre.length
    val sub = nombre.substring(0,3) //subcadena
    val mayus = nombre.uppercase()
    val minus = nombre.lowercase()

    //RAW texto multilínea: texto organizado, JSON, HTML, SQL
    val bloque = """
        Línea 1 = $nombre
        Línea 2 = $curso
        (Los saltos de línea se presentan en RAW)
        """.trimIndent() //trimindent se refiere indentación

    println(saludo1)
    println(saludo2)
    println(mensaje)
    println("largo = $largo, sub = $sub, mayus = $mayus, minus = $minus")
    println(bloque)



}