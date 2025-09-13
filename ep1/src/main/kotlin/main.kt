import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    //creo dos pescados usando valores por defecto de las subclases
    var frutaLocal = FrutaLocal(stockKilos = 50.0, region = 10)
    var frutaTropical = FrutaTropical(stockKilos = 100.0, pais = "Colombia")

    //se crea un inventario para la empresa
    val inventario = Inventario("Puerto Frutal SPA")

    //se agrega inventario predeterminado
    inventario.agregarFruta(frutaLocal)
    inventario.agregarFruta(frutaTropical)

    //Bucle while para menú
    while (true) {

        try {


            println(
                """
            ========= MENÚ =========
            1) Agregar fruta local
            2) Agregar fruta tropical
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
            var precioCorte = 1000

            when (opcion) {

                //Opción para ingreso de fruta local
                "1" -> {

                    println("Ingreso de fruta local")
                    println("Ingrese el nombre de la fruta:")
                    val nombre = readLine().toString()
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
                    println("Ingrese el número de región:")
                    val region = readLine()!!.toInt()
                    frutaLocal = FrutaLocal(nombre, precioPorKilo, stockKilos, region)
                    inventario.agregarFruta(frutaLocal)
                }

                // Opción para ingreso de fruta tropical
                "2" -> {
                    println("Ingreso de fruta tropical")
                    println("Ingrese el nombre de la fruta:")
                    val nombre = readLine().toString()
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
                    println("Ingrese el pais de origen:")
                    val pais = readLine()!!
                    frutaTropical = FrutaTropical(nombre,precioPorKilo, stockKilos, pais)
                    inventario.agregarFruta(frutaTropical)
                }

                //Opción para visualizar inventario
                "3" -> {
                    //se imprime el inventario completo
                    println("El inventario completo es:\n")
                    println(inventario.mostrarInventario())
                }

                //Opción para filtrar por un precio de corte
                "4" -> {
                    //filtrar por un precio de corte
                    println("Ingrese un precio de corte: ")
                    precioCorte = readLine()!!.toInt()
                    print("Filtro x Precio mayor a ${precioCorte} pesos\n")
                    inventario.mostrarMayoresPrecio(precioCorte).forEach {
                        println("- ${it.descripcion()}")
                    }
                }

                //Opción para ver el valor total del stock
                "5" -> {
                    println("El valor total del stock en pesos es: ${inventario.valorTotalStock()}")
                }

                //Opción par revisión de calidad
                "6" -> {
                    println("Ingrese un valor de calidad (precio) exigido: ")
                    var precioCalidad = readLine()!!.toInt()
                    println("Proceso de Control de Calidad Iniciado")
                    inventario.revisionCalidad(precioCalidad)
                }

                //Opción para salir
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
