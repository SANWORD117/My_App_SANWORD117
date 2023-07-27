package com.SANWORD117

fun main() {
//    //Condicionales
//
//    println(
//        """
//        Kotlin presenta varias formas de implementar la lógica condicional:
//            ❑ If/Else statements
//            ❑ When statements
//            ❑ For loops
//            ❑ While loops
//    """
//    )
//
//    //If-else
//
//    val numberOfCups = 30
//    val numberOfPlates = 50
//
//    if (numberOfCups > numberOfPlates) {
//        println("Too many cups!")
//    } else {
//        println("Not enough cups!")
//    }
//
//    println("-------------------------")
//
//
//    //If anidado
//
//    val guests = 30
//    if (guests == 0) {
//        println("No guests")
//    } else if (guests < 20) {
//        println("Small group of people")
//    } else {
//        println("Large group of people!")
//    }
//
//    println("-------------------------")
//
//
//    //Rangos
//    println(
//        """
//            ● Tipo de datos que contiene un rango de valores comparables
//            (por ejemplo, números enteros del 1 al 100 inclusive)
//            ● Los rangos están acotados(Limite)
//            ● Los objetos dentro de un rango pueden ser mutables o inmutables
//    """
//    )
//    //Ejemplo de rango en un loop If-else
//    val number = 50
//    if (number in 1..100) {
//        println("Númerito: " + number)
//    }
//
//    println("-------------------------")
//
//    //When
//    var results2 = 20
//    when (results2) {
//        0 -> println("No results")
//        in 1..39 -> println("Got results!")
//        else -> println("That's a lot of results!")
//    }
//
//    println("-------------------------")
//
//    //For con Rangos
//    for (i in 1..5) print(i)
//    println()
//
//    for (i in 5 downTo 1) print(i)
//    println()
//
//    for (i in 3..6 step 2) print(i)
//    println()
//
//    for (i in 'd'..'g') print(i)
//    println()
//
//    println("-------------------------")
//
//    //While y Do-While usando Incrementar y disminuir
//    var bicycles = 0
//    while (bicycles < 50) {
//        bicycles++
//    }
//    println("$bicycles bicycles in the bicycle rack\n")
//
//    do {
//        bicycles--
//    } while (bicycles > 50)
//    println("$bicycles bicycles in the bicycle rack\n")
//
//    println("-------------------------")
//
//    //Repetidor
//    repeat(2) {
//        print("Hello!\n")
//    }
//
//    println("-------------------------")
//
//    //Listas
//
//    //Lista Inmutable
//    val instrumentos = listOf("trompeta", "piano", "violin")
//    println(instrumentos)
//
//    //Lista Mutable
//    val instrumentos2 = mutableListOf("trompeta", "piano", "violin")
//    println(instrumentos2)
//
//    println("-------------------------")
//
//    //Arrays
//
//    //Usando arrayOf
//    val pets = arrayOf("dog", "cat", "canary")
//    println(pets)
//
//    //Tambien puede tener valores mixtos
//    val mix = arrayOf("hats", 2)
//    println(mix)
//
//    println("-------------------------")
//
//    //Practica 1
//    print("Ingresa un número de 1 al 20: ")
//    var numeros: Int = readLine()!!.toInt()
//    if (numeros in 1..20) {
//        println("Tu númerito esta dentro del rango :D")
//    } else {
//        println("No esta dentro del rango pipipi :,v")
//    }
//
//    println("-------------------------")
//
//    //Practica 2
//
//    var inte1: Int = (0)
//    var inte2: Int = (0)
//    var total1: Int = (0)
//    var total2: Int = (0)
//    for (i in 1..6) {
//
//        print("Ingrese un número del 1 al 10: ")
//        var numeritos: Int = readLine()!!.toInt()
//
//        if (numeritos % 2 == 0) {
//            println("Es un número par!")
//            inte1 += 1
//            total1 += numeritos
//        } else {
//            println("Es un número Impar")
//            inte2 += 1
//            total2 += numeritos
//        }
//
//    }
//    println("Contador de pares: " + inte1 + " y en total da: " + total1)
//    println("Contador de impares: " + inte2 + " y en total da: " + total2)
//
//    println("-------------------------")
//
//    //Practica 3
//    var i: Int = 0
//    var i2: Int = 0
//    var nums: Int = 0
//    var cont1: Int = 0
//    var cont2: Int = 0
//    var t1: Int = 0
//    var t2: Int = 0
//    var respond: String = "si"
//
//    while (respond == "si") {
//        println("Ingresa la cantidad de números que desees ingresar: ")
//        i2 = readLine()!!.toInt()
//        while (i < i2) {
//            println("Por favor ingresa tus numeros: ")
//            nums = readLine()!!.toInt()
//            if (nums % 2 == 0) {
//                print("¡Es un número par!")
//                println()
//                cont1 += 1
//                t1 += nums
//            } else {
//                print(" ¡Es un número Impar!")
//                println()
//                cont2 += 1
//                t2 += nums
//            }
//            i += 1
//        }
//        println("Deseas ingresar más números?")
//        respond = readLine()!!.toString()
//    }
//
//    println("Cantidad de números pares digitados: "+cont1+" y su suma de números da: "+t1)
//    println("Cantidad de números pares digitados: "+cont2+" y su suma de números da: "+t2)
//    println()
//    println("Gracias por usar mi programa ^_~")

    println("-------------------------")

    var numeros:Int= (1..6).random()
    println("Número aleatorio: "+numeros)

    println("-------------------------")
    //Random(EXTRA)
    var numeros2:Int= (1..20).random()
    println("Número aleatorio: "+numeros2)

}