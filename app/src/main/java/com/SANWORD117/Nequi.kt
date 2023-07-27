package com.SANWORD117

class Nequi{

}

var op1:Int=0
var nombre:String=""
var numero:Long=0
var documento:Long=0
var contraseña:Int=0
var trys:Int=3

val users_names= mutableListOf("Sebastian")
val users_documents= mutableListOf(3029141439)
val users_phones= mutableListOf(3224664740)
val users_passwords= mutableListOf(1111)

fun Signin(nom: String,doc: Long,num: Long,cont: Int){
    println("ingresa un nombre de usuario: ")
    nombre= readLine()!!.toString()
    users_names.add(nombre)
    println()

    println("Ingrese su N° de documento de Identidad: ")
    documento= readLine()!!.toLong()
    users_documents.add(documento)
    println()

    println("ingresa su N° de celular: ")
    numero= readLine()!!.toLong()
    users_phones.add(numero)
    println()

    println("Ingrese su contraseña de 4 digitos")
    println("NOTA: Asegurese de guardar o de anotar su contraseña")
    contraseña= readLine()!!.toInt()
    users_passwords.add(contraseña)
    println()

    println("Felicidades, acabas de crear tu cuenta Nequi")
}

fun Login(num: Long, cont: Int) {

    println("Ingresa tu número de celular: ")
    numero= readLine()!!.toLong()
    println()

    while (trys>0) {
        if (numero != null && numero in users_phones) {
            println("Ingresa tu contraseña: ")
            contraseña = readLine()!!.toInt()
            if (contraseña != null && contraseña in users_passwords) {
                println("Bienvenid@ a Nequi")
                println()
                trys = 0
            } else {
                println("Contraseña incorrecta")
                trys -= 1
            }
        } else {
            println("ERROR, intente nuevamente")
        }
    }
}

fun Retirar(){

}

fun main(){
    while (op1 != 1 && op1 !=2) {
        println("""
        Bienvenid@ a Nequi
        
        Eres nuevo?
        
        1. Si
        2. No
        
        RESPUESTA: """)

        op1= readLine()!!.toInt()
        if (op1 == 1) {
            Signin(nombre, documento, numero, contraseña)
        } else if (op1 == 2) {
            Login(numero, contraseña)
        } else {
            println("Elección incorrecta, intentalo nuevamente")
        }
    }

    Login(numero, contraseña)

    if (trys == 0){
        println("Demasiados intentos, intentalo más tarde")
    }

    println("Cuenta: $users_names $users_documents $users_phones $users_passwords")
}