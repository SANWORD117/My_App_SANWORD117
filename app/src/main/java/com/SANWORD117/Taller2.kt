package com.SANWORD117

class Taller2 {
}

fun main(){
    //TALLER2
    val Autos= mutableListOf("Ferrari","Chevrolet","Kia","Toyota")
    println("Autos : $Autos")
    println()

    var confirmar: String="No"
    var confirmar2: String="No"
    var añadir: String=""
    var buscar: Int=0
    var elije: Int=0
    var modificar: String=""
    var eliminar: Int=0
    var opciones: Int=0

    do{

        println("Seleccione la opción que desea:")
        println("1. Insertar nuevos autos a la lista")
        println("2. Mostrar todos los datos de la lista")
        println("3. Buscar un auto en particular")
        println("4. Modificar un auto existente")
        println("5. Borrar un auto existente")
        println()

        print("Opción: ")
        opciones= readLine()!!.toInt()

        if (opciones==1){
            do {
                println("Autos actuales:")
                for ((index, elementos) in Autos.withIndex()) {
                    println("$index. $elementos")
                }
                println()
                print("Ingresa un nuevo auto: ")
                añadir = readLine()!!.toString()
                Autos.add(añadir)

                println("Se añadio exitosamente el auto!")
                println()
                println("Autos actuales:")
                for ((index, elementos) in Autos.withIndex()) {
                    println("$index. $elementos")
                }
                println()

                println("Desea Salir?")
                print("Opción: ")
                confirmar2 = readLine()!!.toString()
            }while (confirmar2=="No")
        } else if (opciones==2){
            do {
                println("Bievenido, te presento todos los autos que manejamos en el catalogo actualmente")
                for ((index, elementos) in Autos.withIndex()) {
                    println("$index. $elementos")
                }
                println()
                println("Desea Salir?")
                print("Opción: ")
                confirmar2 = readLine()!!.toString()
            }while (confirmar2=="No")
        } else if (opciones==3){
            do {
                print("Busca un auto existente por el número: ")
                buscar = readLine()!!.toInt()
                println("Has selecionado el ${Autos.get(buscar)}")

                println()
                println("Desea Salir?")
                print("Opción: ")
                confirmar2 = readLine()!!.toString()
            }while (confirmar2=="No")
        } else if (opciones==4){
            do {
                println("Autos actuales:")
                for ((index, elementos) in Autos.withIndex()) {
                    println("$index. $elementos")
                }
                println()
                print("Selecciona el auto que desee modificar: ")
                elije = readLine()!!.toInt()
                println("Selecionaste el auto: ${Autos.get(elije)}")
                println()

                print("Nombra el nuevo auto: ")
                modificar = readLine()!!.toString()
                Autos.add(elije,modificar)
                println()
                println("Modificación exitosa!")

                println()
                println("Desea Salir?")
                print("Opción: ")
                confirmar2 = readLine()!!.toString()

            }while (confirmar2=="No")
        } else if (opciones==5){
            do {
                println("Autos actuales:")
                for ((index, elementos) in Autos.withIndex()) {
                    println("$index. $elementos")
                }
                println()
                print("Selecciona el auto que deseas eliminar: ")
                eliminar = readLine()!!.toInt()
                Autos.remove(Autos[eliminar])
                println()
                println("Se ha borrado exitosamente!")

                println()
                println("Desea Salir?")
                print("Opción: ")
                confirmar2 = readLine()!!.toString()

            }while (confirmar2=="No")
        } else {
            println("ERROR se ha equivocado de selección, intentalo nuevamente")
        }

        println("Salir del Menu?")
        print("Opción: ")
        confirmar= readLine()!!.toString()


    }while (confirmar=="No")
    println("Gracias por usar mi programa (👉ﾟヮﾟ)👉")
}