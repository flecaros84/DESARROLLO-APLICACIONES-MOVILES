import kotlin.random.Random

//En un archivo Kotlin con una función main(), realiza lo siguiente:
fun main(){

    //1. Declara dos variables numéricas (una de tipo Int, otra de tipo Double).
    var entero:Int=3
    var doble:Double=4.0

    //2. Realiza las cuatro operaciones aritméticas básicas (+, -, *, /) entre ellas.
    val suma = entero + doble
    val resta = doble - entero
    val multiplicacion = entero * doble
    val division = (doble / entero)

    //3. Imprime cada resultado en la consola con un texto descriptivo, por ejemplo:
    //"La suma es: [resultado]".

    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicacion es: $multiplicacion")
    println("La division es: $division")

    //Seguridad ante Nulos (Null Safety)
    //1. Declara una variable de tipo String que pueda ser nula (String?). Asígnale un valor inicial de texto.
    var puedeSerNula: String? = "Puede ser nula"

    //2. Imprime en consola la longitud de la variable usando el operador de llamada segura ?..
    println("Longitud con llamada segura (SafeCall):")
    println(puedeSerNula?.length)

    //3. Asigna el valor null a esa misma variable.
    puedeSerNula = null

    //4. Intenta imprimir nuevamente su longitud usando el mismo operador ?.. Observa cómo el programa no falla y devuelve null.
    println("Longitud con variable null:")
    println(puedeSerNula?.length)

    //Pregunta de reflexión: En un comentario en tu código, explica brevemente cómo
    //se realizaría una verificación equivalente en Java para evitar un NullPointerException.
        // En Java no existe el operador de llamada segura (?.).
        // Para evitar un NullPointerException, se haría una verificación manual:
        // if(puedeSerNula != null) {
        //     System.out.println(puedeSerNula.length());
        // } else {
        //     System.out.println("null");
        // }

    //Lógica Condicional con when
    //1. Declara una variable de tipo Int y asígnale un número del 1 al 7.
    var dia = (1..8).random()

    //2. Utiliza la estructura de control when de Kotlin para imprimir el día de la semana correspondiente al número (ej. 1 -> "Lunes", 2 -> "Martes", etc.).
    //3. Asegúrate de incluir un caso else para manejar cualquier otro número.

    var textoDia = when(dia){
        1-> "Lunes"
        2-> "Martes"
        3-> "Miércoles"
        4-> "Jueves"
        5-> "Viernes"
        6-> "Sábado"
        7-> "Domingo"
        else -> "Número invalido"
    }

    println("El día $dia es $textoDia")

    //Preguntas de Reflexion
    //¿Qué diferencias y similitudes clave observaste entre Kotlin y Java en esta actividad?
    //Me parece que sintaxis de Kotlin es más sencilla para operaciones y código en general al no ser tan
    //estructurado como JAVA, pero la declaración de variables parece más sencilla en JAVA

    //¿Cómo podrías aplicar lo aprendido sobre la seguridad ante nulos (Null Safety) y la expresión when en futuros proyectos de desarrollo de aplicaciones móviles?
    //El WHEN es una estructura condicional básica de programación, por lo que su útilidad es evidente
    //Respecto a la seguridad ante nulos, podría ser aplicable cuando el usuario ingresa información
    //Y se requiera algún tipo de validación
}