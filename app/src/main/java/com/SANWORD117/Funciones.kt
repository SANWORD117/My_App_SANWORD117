package com.SANWORD117

class Funciones {
}

fun areaCirculo(){
    val pi: Double=3.1416
    var radio: Double=0.0

    println("Ingresa el radio del circulo: ")
    radio=readLine()!!.toDouble()

    val operacion=pi*(radio*radio)

    println("El area del cirulo es: "+operacion)
}

fun perimetroCirculo(){
    val pi: Double=3.1416
    var radio: Double=0.0

    println("Ingresa el radio del circulo: ")
    radio=readLine()!!.toDouble()

    val operacion2=2*pi*radio

    println("El perimetro del cirulo es: "+operacion2)
}

fun areaTriangulo(base:Double,altura:Double){
    val operacion3=(base*altura)/2
    println("El area del triángulo es de: "+operacion3)
}

fun perimetroTriangulo(lado1: Double,lado2: Double,lado3: Double){
    val operacion4=lado1+lado2+lado3
    println("El perimetro del triángulo es de: "+operacion4)
}

fun areaRectangulo():Int{
    var ancho=0
    var altura=0

    println("Ingrese el ancho del rectangulo: ")
    ancho= readLine()!!.toInt()
    println("Ingrese la altura del rectangulo: ")
    altura= readLine()!!.toInt()

    return ancho*altura
}

fun perimetroRectangulo():Int{
    var ancho=0
    var altura=0

    println("Ingrese el ancho del rectangulo: ")
    ancho= readLine()!!.toInt()
    println("Ingrese la altura del rectangulo: ")
    altura= readLine()!!.toInt()

    return 2*(ancho+altura)
}

fun main(){

    //Setting Up

//    val temperature = 20
//    val isHot = if (temperature > 40) true else false
//        println(isHot)
//
//    //Practica
//    //Forma normal
//    var edad: Int=0
//    print("Ingrese su edad: ")
//    edad= readLine()!!.toInt()
//    println()
//
//    //Forma con true y false
//    if (edad>=18){
//        println("Bienvenid@s :)")
//    } else{
//        println("Pa´ la casa mi rey")
//    }
//
//    var acceso=if (edad>=18) true else false
//    println("Eso es: "+acceso)
//    println()
//    println("---------------------------")
//    println()

    //ACTIVIDAD1
    var Conf:String="Si"
    println("Bienvenid@s")

    do {
        var eleccion: Int = 0
        print(
            """
        Elige la operación que deseas realizar:

            1. Area del Círculo
            2. Perímetro del Círculo
            3. Area del Triángulo
            4. Perímetro del Triángulo
            5. Area del Rectangulo
            6. Perímetro del rectangulo

    RESPUESTA: """
        )
        eleccion= readLine()!!.toInt()

        if (eleccion == 1) {
            areaCirculo()
        } else if (eleccion == 2) {
            perimetroCirculo()
        } else if (eleccion == 3) {
            var base: Double = 0.0
            var altura: Double = 0.0

            println("Ingresa la base del triangulo; ")
            base = readLine()!!.toDouble()
            println("Ingresa la altura del triangulo; ")
            altura = readLine()!!.toDouble()

            areaTriangulo(base, altura)
        } else if (eleccion == 4) {
            var lado1: Double = 0.0
            var lado2: Double = 0.0
            var lado3: Double = 0.0

            println("Ingresa el primer lado del triangulo; ")
            lado1 = readLine()!!.toDouble()
            println("Ingresa el segundo lado del triangulo; ")
            lado2 = readLine()!!.toDouble()
            println("Ingresa el tercer lado del triangulo; ")
            lado3 = readLine()!!.toDouble()

            perimetroTriangulo(lado1, lado2, lado3)
        } else if (eleccion == 5) {
            val res = areaRectangulo()
            println("El area del rectangulo es de: " + res)
        } else if (eleccion == 6) {
            val res = perimetroRectangulo()
            println("El perímetro del rectangulo es de: " + res)
        } else {
            println("Elige bien >:v")
        }

        println("Deseas usar el programa nuevamente?\n")
        Conf= readLine()!!.toString()

    }while (Conf=="Si")

//    //EJEMPLO DE FUNCION CON RETORNO
//    val res= si()
//    println("RESULTADO: "+res)

    println()
    println("Gracias por usar mi programa （づ￣3￣）づ╭❤️～")
}

////EJEMPLO DE FUNCION CON RETORNO
//fun si():Int{
//    var num=7
//    return num*3
//}


//EJEMPLO DE INVOCAR FUNCIONES
//fun printHello(){
//    println("Hello, World")
//}
//
//printHello()