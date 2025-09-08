fun main() {
    //Try catch

    println("🪙 Bienvenido a PuertoGames Móvil")
    println("Ingrese monto a recargar:")

    try {
        // Leemos input del usuario (puede ser null)
        val entrada = readLine()
        /*Se detecta un valor no válido (como un número negativo).
        Hay una condición lógica que no tiene sentido seguir ejecutando.
        Quieres avisar al programador o usuario que algo se rompió y por qué.*/

        // Convertimos a Int o lanzamos excepción
        val monto = entrada?.toInt() ?: throw Exception("Entrada vacía")


        /*
        IllegalArgumentException
        * En español significa: Excepción de argumento ilegal.
        Es un tipo de error (excepción) que aparece en Java/Kotlin cuando un método o función recibe un argumento no válido.

        * */

        if (monto <= 0) {
            //throw es lanzar= le decimos
            throw IllegalArgumentException("El monto debe ser mayor a 0") // Validamos lógica
        }
        println("✅ Recarga exitosa de $$monto CLP")


        // Si ingresó letras u otro formato inválido
    } catch (e: NumberFormatException) {
        println("❌ Error: Debes ingresar un número válido")

        // Si el monto es negativo o 0
    } catch (e: IllegalArgumentException) {
        println("⚠️ Error lógico: ${e.message}")

        // Cubre cualquier otro error no anticipado
    } catch (e: Exception) {
        println("🚨 Error inesperado: ${e.message}")


        // Siempre se ejecuta, haya o no error
    } finally {
        println("🧾 Gracias por usar PuertoGames Móvil")
    }
}