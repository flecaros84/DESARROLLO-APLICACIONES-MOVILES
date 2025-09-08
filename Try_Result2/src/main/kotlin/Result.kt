//Ingreso de un correo correctamente
fun validarEmail(email: String):Result<String>{
    //Verificamos que el correo tenga @ y .
    return if(email.contains("@") && email.contains(".")){
        //si ambas condiciones se cumplen es exitoso
        Result.success(email)
    }else{
        Result.failure(Exception("Email invalido, vuelva a intentarlo"))
    }
}

//Función principal
fun main(){
    println("Ingresa tu correo electrónico")

    val correo = readLine() ?: ""

    validarEmail(correo)
        .onSuccess{println("Correo válidado $it")}
        .onFailure{println("Error: ${it.message}")}

    //Fin
}