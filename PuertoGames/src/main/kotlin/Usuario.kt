class Usuario(
    private val nombre: String,
    private val edad: Int,
){
    //Lista de usuarios
    private val biblioteca = mutableListOf<Videojuego>()

    //Función agrega un videojuego
    fun agregarVideojuego(v : Videojuego){
        biblioteca.add(v)
    }

    //Mostrar la biblioteca de juegos
    fun mostrarBiblioteca(): String{
        if(biblioteca.isEmpty()) return "No hay videojuegos aún."
        //else
        return biblioteca.joinToString(separator= "\n"){ juego ->
            "${juego.descripcion()}"
        }
    }

    //mostrar juegos fav x categoria
    fun mostrarFavoritosPorGenero(genero: String): List<Videojuego>{
        return biblioteca.filter { it.descripcion().contains(genero,ignoreCase = true) }
    }

    //Función de orden superior
    fun obtenerResumen():String{
        return "usuario: $nombre, ($edad años) \n Juegos: ${mostrarBiblioteca()}"
    }
}