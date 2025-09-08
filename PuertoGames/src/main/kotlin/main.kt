fun main(){
    //crear videojuegos
    val fifa = Videojuego("Fifa 25","Deportes",2025,"EA Sports", 45000)
    val resident = Videojuego("Resident Evil", "Acción Terror",2000, "Capcom", 15000)
    val GTA = Videojuego("GTA","Acción",2026,"Rockstar Games",100000)

    //Creamos consolas
    val ps5 = Consola("Play Station 5", "Sony",500000,5)
    val xbox = Consola("Xbox serie x","Microsoft",400000,0)

    //crear user
    val usuario = Usuario ("Matías",21)

    //Agregar vj a su cuenta
    usuario.agregarVideojuego(fifa)
    usuario.agregarVideojuego(resident)
    usuario.agregarVideojuego(GTA)

    //Resumen de usuario
    println(usuario.obtenerResumen())

    //Filtrar x género
    print("Filtro x Género")
    usuario.mostrarFavoritosPorGenero("Acción").forEach{
        println("- ${it.descripcion()}")
    }

    //Lista interna de main
    val productos: List<Producto> = listOf(fifa,resident,GTA,ps5,xbox)

    //Verificar disponibilidad
    println("Verificando disponibilidad")
    if(ps5.tieneStock()) println("${ps5.descripcion()} está disponible")
    if(!xbox.tieneStock()) println("${xbox.descripcion()} no está disponible")

    //Mostrar juegos retro
    println("Juegos retro")
    productos.filterIsInstance<Videojuego>().filter{ it.esRetro()}.forEach{
        println("- ${it.descripcion()}")
    }


}