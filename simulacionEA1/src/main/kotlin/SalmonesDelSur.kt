import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    //creo dos pescados usando valores por defecto de las subclases
    var salmon = Salmon(stockKilos = 50.0, color = "naranjo")
    var pescadoBlanco = PescadoBlanco(stockKilos = 100.0, espinas = true)

    //se crea un inventario para la empresa
    val inventario = Inventario("Salmones del Sur SPA")

    //se agregan pescados
    inventario.agregarPescado(salmon)
    inventario.agregarPescado(pescadoBlanco)

    while (true) {

        try {


            println(
                """
            ========= MENÚ =========
            1) Agregar salmón
            2) Agregar pescado blanco
            3) Ver inventario
            4) Filtrar por precio mínimo
            5) Ver valor total del stock
            6) Simular control de calidad
            0) Salir
            ========================
            """
            )

            println("Elija una opción: ")
            val opcion = readLine()
            var precioCorte = 5000

            when (opcion) {

                "1" -> {

                    println("Ingrese el precio por kilo:")
                    val precioPorKilo = readLine()!!.toInt()
                    if (precioPorKilo <= 0) {
                        //throw es lanzar= le decimos
                        throw IllegalArgumentException("El monto debe ser mayor a 0") // Validamos lógica
                    }
                    println("Ingrese el stock en kilos:")
                    val stockKilos = readLine()!!.toDouble()
                    if (stockKilos < 0) {
                        //throw es lanzar= le decimos
                        throw IllegalArgumentException("El stock no puede ser negativo") // Validamos lógica
                    }
                    println("Ingrese el color:")
                    val color = readLine()!!
                    salmon = Salmon(precioPorKilo, stockKilos, color)
                    inventario.agregarPescado(salmon)
                }

                "2" -> {
                    println("Ingrese el precio por kilo:")
                    val precioPorKilo = readLine()!!.toInt()
                    if (precioPorKilo <= 0) {
                        //throw es lanzar= le decimos
                        throw IllegalArgumentException("El monto debe ser mayor a 0") // Validamos lógica
                    }
                    println("Ingrese el stock en kilos:")
                    val stockKilos = readLine()!!.toDouble()
                    if (stockKilos < 0) {
                        //throw es lanzar= le decimos
                        throw IllegalArgumentException("El stock no puede ser negativo") // Validamos lógica
                    }
                    println("Ingrese si tiene espinas (true o false):")
                    val espinas = readLine()!!.toBoolean()
                    pescadoBlanco = PescadoBlanco(precioPorKilo, stockKilos, espinas)
                    inventario.agregarPescado(pescadoBlanco)
                }

                "3" -> {
                    //se imprime el inventario completo
                    println("El inventario completo es:\n")
                    println(inventario.mostrarInventario())
                }

                "4" -> {
                    //filtrar por un precio de corte
                    println("Ingrese un precio de corte: ")
                    precioCorte = readLine()!!.toInt()
                    print("Filtro x Precio mayor a ${precioCorte} pesos\n")
                    inventario.mostrarMayoresPrecio(precioCorte).forEach {
                        println("- ${it.descripcion()}")
                    }
                }

                "5" -> {
                    println("El valor total del stock en pesos es: ${inventario.valorTotalStock()}")
                }

                "6" -> {
                    println("Proceso de Control de Calidad Iniciado")
                    inventario.revisionCalidad()
                }

                "0" -> {
                    println("Cerrando Sistema")
                    break
                }

                else -> println("Opción no válida.")

            }

        } catch (e: NumberFormatException) {
            println("❌ Error: Debes ingresar un número válido")

            // Si el monto es negativo o 0
        } catch (e: IllegalArgumentException) {
            println("⚠️ Error lógico: ${e.message}")

            // Cubre cualquier otro error no anticipado
        } catch (e: Exception) {
            println("🚨 Error inesperado: ${e.message}")

        }

    }
}
