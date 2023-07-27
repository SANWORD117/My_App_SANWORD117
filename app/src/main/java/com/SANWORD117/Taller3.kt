package com.SANWORD117

class Taller3 {
}

fun main(){
    //TALLER 3

    var randomizador: Int=(1..4).random()
    var compra: Double=0.0
    var cantidad: Int=0
    var subtotal: Double=0.0
    var total: Double=0.0
    var descuento: Double=0.0
    var pago: Double=0.0
    var cambio: Double=0.0
    var resp1: String = "si"

    do {
        while (resp1 == "si") {
            println("Ingresa el valor del producto: ")
            compra = readLine()!!.toDouble()
            println("Ingresa la cantidad del producto: ")
            cantidad = readLine()!!.toInt()

            subtotal = compra * cantidad
            print("Deseas agregar más productos?\n")
            resp1 = readLine()!!.toString()
        }

        if (subtotal >= 50000) {
            println()
            println("Felicidades! Puedes participar en nuestro juego :D")
            println()
            println("Bien y la bola que te salio fue...")
            if (randomizador == 1) {
                print(" la bola roja! ")
                println("Tienes un descuento del 10% de su compra")

                println("-------------------------")

                total += subtotal
                descuento = (0.10 * total)
                total = total - descuento


                println("El cliente paga: ")
                pago = readLine()!!.toDouble()

                if (pago == descuento) {
                    print(
                        """
                Total: $total
                Descuento: 10%
                Pago: $pago
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else if (pago >= total) {
                    cambio = pago - total
                    println("El cambio del cliente es de: " + cambio)

                    print(
                        """
                Total: $total
                Descuento: 10%
                Pago: $pago
                Cambio: $cambio
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else {
                    println("Error de sistema")
                }

            } else if (randomizador == 2) {
                print(" la bola azul! ")
                println("Tienes un descuento del 30% de su compra")

                println("-------------------------")

                total += subtotal
                descuento = (0.30 * total)
                total = total - descuento


                println("El cliente paga: ")
                pago = readLine()!!.toDouble()

                if (pago == descuento) {
                    print(
                        """
                Total: $total
                Descuento: 30%
                Pago: $pago
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else if (pago >= total) {
                    cambio = pago - total
                    println("El cambio del cliente es de: " + cambio)

                    print(
                        """
                Total: $total
                Descuento: 30%
                Pago: $pago
                Cambio: $cambio
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else {
                    println("Error de sistema")
                }

            } else if (randomizador == 3) {
                print(" la bola amarilla!! ")
                println("Tienes un descuento del 50% de su compra")

                println("-------------------------")

                total += subtotal
                descuento = (0.50 * total)
                total = total - descuento


                println("El cliente paga: ")
                pago = readLine()!!.toDouble()

                if (pago == descuento) {
                    print(
                        """
                Total: $total
                Descuento: 50%
                Pago: $pago
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else if (pago >= total) {
                    cambio = pago - total
                    println("El cambio del cliente es de: " + cambio)

                    print(
                        """
                Total: $total
                Descuento: 50%
                Pago: $pago
                Cambio: $cambio
            """
                    )
                    println()

                    println("Gracias por su compra, ten un buen dia ^_^")

                } else {
                    println("Error de sistema")
                }

            } else if (randomizador == 4) {
                print(" la bola BLANCA!!! ")
                println("Tu compra fue gratis, enhorabuena ;)")

                println("-------------------------")

                total += subtotal
                descuento = total - total
                total = descuento

                print(
                    """
                COMPRA GRATUITA ;)
            """
                )

                println()

                println("Gracias por su compra, ten un buen dia ^_^")

            } else {
                println("ERROR")
            }


        } else {
            println()
            println("Lamentablemente no puedes jugar a nuestro juego :(")
            println()

            total += subtotal

            print(
                """
                Total: $total
            """
            )

            print("El cliente paga: ")
            pago = readLine()!!.toDouble()

            if (pago == total) {
                print(
                    """
                Total: $total
                Pago: $pago
            """
                )
                println()

                println("Gracias por su compra, ten un buen dia ^_^")

            } else if (pago >= total) {
                cambio = pago - total
                println("El cambio del cliente es de: " + cambio)

                print(
                    """
                Total: $total
                Pago: $pago
                Cambio: $cambio
            """
                )
                println()

                println("Gracias por su compra, ten un buen dia ^_^")

            } else {
                println("Error de sistema")
            }
        }
        println("Desea realizar otra venta?")
        println("si  |  no")
        resp1= readLine()!!.toString()
    }while (resp1=="si")
    println("Gracias por usar mi Programa ;)")
}