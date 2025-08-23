fun main(){
    //Parte 1 – Ciclos básicos

    //Declara una lista con las edades:
    val edades = listOf(15, 18, 20, 22, 17)

    //a) Recorre la lista con un **for** e imprime solo las edades mayores o iguales a 18.
    println("Recorrido con for, solo >=18:")
    for(edad in edades){
        if(edad>=18){
            println(edad)
        }
    }

    //b) Haz lo mismo con un **while**.
    println("Recorrido con while, solo >18:")
    var indice = 0
    while(indice<edades.size){
        if(edades[indice]>=18){
            println(edades[indice])
        }
        indice++
    }

    //c) Recorre la lista con **forEach** e imprime todas las edades en una sola línea separadas por comas.
    println("For each de la lista completa")
    edades.forEach { e -> print("$e, ") }

    //Parte 2 – Colecciones**

    //1. Crea una lista con nombres de estudiantes (puedes repetir algún nombre).
    val nombres: List<String> = listOf("Juan","Pedro","José","Juan")
    println("Lista de nombres: $nombres")

    //a) Convierte esa lista en un **Set** y muestra cuántos nombres únicos hay.
    val nombresunicos: Set<String> = nombres.toSet()
    println("Set únicos: $nombresunicos")

    //b) Crea un **Map** que relacione cada estudiante con su asignatura favorita (ejemplo: `"Ana" → "Móvil"`).
    val cursos: Map<String,String> = mapOf(
        "Juan" to "Base de Datos",
        "Pedro" to "Machine Learning",
        "José" to "Aplicaciones Móviles",
    )

    //c) Imprime la asignatura favorita de un estudiante en específico (elige uno que exista y uno que no exista en el mapa).
    println("Curso de José: ${cursos["José"]}")
    println("Curso de Juanelo: ${cursos["Juanelo"]}")

    //Parte 3 – Operaciones con colecciones**

    //Con la lista de **edades** del inicio:

    //1. Usa `.find` para obtener la **primera edad mayor a 18**.
    println("Primera edad sobre 18: " + edades.find{it>18})

    //2. Usa `.any` para verificar si hay **menores de 18**.
    println("¿Existen menores de 18 años? " + edades.any{it<18})

    //3. Usa `.all` para verificar si **todos son adultos**.
    println("¿Son todos adultos? " + edades.all{it>=18})

    //4. Usa `.map` para crear una nueva lista con las edades **multiplicadas por 2**.
    println("Edades multiplicadas por 2: " + edades.map{it*2})

    //5. Usa `.filter` para quedarte solo con los **mayores de edad**.
    println("Filtrado mayores de edad: " + edades.filter{it>=18})

    //6. Calcula la **suma total** y el **promedio** de las edades.
    println("Suma total:" + edades.sum())
    println("Promedio:" + edades.average())

}

