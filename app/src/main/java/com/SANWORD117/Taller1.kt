package com.SANWORD117

class Taller1{
}

fun main(){
    
    println("Bienvenid@s, por favor ingresen un salgo inicial para jugar a los dados")
    println("MINIMO: $1000\n")
    println("Respuesta: ")
    var saldo=readLine()!!.toInt()
    
    if(saldo>=1000){
        println("Saldo actual: "+saldo)
        println("Genial, hora de jugar! ^_~")
        println()
    } else{
        println("No puedes jugar ;-;")
    }
    
    while(saldo!=0){
        val dado1: Int=(1..6).random()
        val dado2: Int=(1..6).random()
        println("Lanzaste tus dados y salio... "+"Un "+dado1+" y un "+dado2)
        var suma=dado1+dado2
        println("La suma de los dados da "+suma)
        println()

        if (dado1 == 1 && dado2 == 1){
            println("GANASTE! Felicidades ㄟ(≧◇≦)ㄏ")
            saldo+=saldo
        } else if (suma == 3){
            println("GANASTE! Felicidades ㄟ(≧◇≦)ㄏ")
            saldo+=saldo
        } else if (suma == 11){
            println("GANASTE! Felicidades ㄟ(≧◇≦)ㄏ")
            saldo+=saldo
        } else if (suma == 2 || suma == 12){
            println("GANASTE! Felicidades ㄟ(≧◇≦)ㄏ")
            saldo+=saldo
        } else if (suma == 7){
            println("GANASTE! Felicidades ㄟ(≧◇≦)ㄏ")
            saldo+=saldo
        } else{
            println("Mala suerte, Perdiste pipipi :,v")
            saldo-=saldo
        }
    }
    
    if (saldo == 0){
        println("Fin del juego, gracias por jugar ❤")
    }
}