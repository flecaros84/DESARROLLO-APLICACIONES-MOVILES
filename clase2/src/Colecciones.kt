fun main(){

    //LIST admite datos duplicados, conserva el orden
    val nombres: List<String> = listOf("Francisco","Javiera","Eliecer","Francisco")
    println("Lista de nombres: $nombres")

    //Set: No admite repetidos
    val nombresunicos: Set<String> = nombres.toSet()
    println("Set únicos: $nombresunicos")

    //MAP clave valor ()JSON // no puede tener claves repetidas
    //Nombre: Curso
    val cursos: Map<String,String> = mapOf(
        "Benjamin" to "Aplicaciones Móviles",
        "Eliecer" to "Full Stack II",
        "Eliecer" to "Aplicaciones Móviles",
    )

    println("Curso de Benjamin: ${cursos["Benjamin"]}")
    println("Curso de Eliecer: ${cursos["Eliecer"]}")
}