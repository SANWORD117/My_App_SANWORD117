package co.edu.sena.soy.my_app_sanword117

fun main() {
    println("Hola Mundo!")


    //Declaración de variables

    //Val(Inmutable) - Ejemplo

    val name = "Sebastian"

    //Var(Mutable) - Ejemplo

    var dinero = 1000000

    dinero = 0 //Se puede cambiar

    println("-------------------------")

    //Especificar Tipo de variables

    var width: Int = 12
    var height: Double = 2.5

    //una vez asignados los tipos de variables, no se pueden cambiar puede provocar errores


    //Tipos de Enteros:

    //Long, 64 bits, from -2(63) to 2(63)-1
    //Int, 32 bits, from -2(31) to 2(63)-1
    //Short, 16 bits, from -32768 to 32767
    //Byte, 8 bits, from -128 to 127

    //Comas flotantes y otros tipos númericos:

    //Double, 64 bits, 16 - 17 significant digits
    //Float, 32 bits, 6 - 7 significant digits
    //Char, 16 bits, 16-bits Unicode character
    //Boolean, 8 bits, True or false include; || - lazydisjuntion, && - lazy conjuntion, ! -negation

    var Long: Int = 1000000000
    println("Long: " + Long)
    var Int: Int = 17
    println("Int: " + Int)
    var Short: Int = 1000000000
    println("Short: " + Short)
    var Byte: Int = 170170170
    println("Byte: " + Byte)

    println()

    var Double: Double = 17.0
    println("Double: " + Double)
    var Float: Float = 1.78F
    println("Float: " + Float)
    var Char: Char = 'S'
    println("Char: " + Char)
    var Boolean: Boolean = true
    println("Boolean: " + Boolean)


    //Operadores

    //Operadores matematicos: +,-,*,/,%
    //Operadores de incremento y disminución: ++,--
    //Operadores comparación: <,<=,>,>=
    //Operador de asignación: =
    //Operador de igualdad: ==,!=


    6 * 50
    //kotlin.Int = 300

    6.0 * 50.0
    //kotlin.Double = 300.0

    6.0 * 50
    //kotlin.Double = 300.0

    1 / 2
    //kotlin.Int = 0

    1.0 * 2.0
    //kotlin.Double =0.5

    //Metodos de operador numérico

    2.times(3)
    //kotlin.Int = 6

    3.5.plus(4)
    //kotlin.Double = 7.5

    2.4.div(2)
    //kotlin.Double = 1.2


    println("-------------------------")

    //Impresiones Basicas

    //Salida
    //print(): Imprime una cadena dentro de las comillas
    //println(): Similar a print() pero a diferencia de que el cursor comenzara en la siguiente linea


    //Entrada
    //readLine(): Lector de canedas de Kotlin

//    var lastName= readLine()
//    println(lastName)
//    var results:Int= readLine()!!.toInt()
//    println(results)

    //Asignaciones

    //Forma correcta
    val i: Int = 17
    println("Número: " + i.toByte())


    //Guiones bajos para números largos

    val oneMillion = 1_000_000
    val idNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("-------------------------")

    //Variables Basicas

    //String

    //Normal
    val s1 = "Grove Streets 4 ever"
    println(s1)

    //Con Escape o mejor conocido como salto de linea
    val s2 = "Grove Streets 4 ever\n"
    println(s2)

    //Cuadro de texto usando (""")
    val s3 = """
        Grove Streets 4 ever
    """
    print(s3)//NOTA: Imprime tipo factura

    println()
    println("-------------------------")

    //Concatenado
    val numberOfDogs = 3
    val numberOfCats = 2

    println("Tengo $numberOfDogs gua gua" + " y $numberOfCats miau miau")

    println("-------------------------")


    //Templates

    //Forma 1:
    val i2 = 10
    println("i2 = $i2")

    //Forma 2:
    val s = "abc"
    println("$s.length es ${s.length}")

    //Al final el ($) puede Agarrar valores de cualquier tipo de cualquier variable

    println("-------------------------")


    //Templates concatenados

    val numberOfShirts = 10
    val numberOfPants = 5

    println("Tengo ${numberOfShirts + numberOfPants} piezas de Ropa")

    println("-------------------------")


    //Seguridad Nula en kotlin
    println(
        """
        En Kotlin fnciona asi los Nulos:
            ● En Kotlin, las variables no pueden ser nulas por defecto
            ● Puede asignar explícitamente una variable a nulo usando el operador de llamada segura
            ● Permita excepciones de puntero nulo usando el !! operador
            ● Puede probar nulo usando el operador elvis (?:)
            
            Las Variables NO pueden ser Nulas, ni por defecto
    """)

    println("-------------------------")

    //Anulador: Se llama con (!!). Forza al sistema a decir que la variable es nula de momento pero en un instante tendra un valor asignado
    //Llamada Segura: Se llama con (?). Similar al Anulador pero la variable Nula puede tener un valor en cualquier momento
    //var numberOfBooks: Int? = null


    //Condicionales

    println(
        """
        Kotlin presenta varias formas de implementar la lógica condicional:
            ❑ If/Else statements
            ❑ When statements
            ❑ For loops
            ❑ While loops
    """)

    //If-else

    val numberOfCups = 30
    val numberOfPlates = 50

    if (numberOfCups > numberOfPlates) {
        println("Too many cups!")
    } else {
        println("Not enough cups!")
    }

    println("-------------------------")


    //If anidado

    val guests = 30
    if (guests == 0) {
        println("No guests")
    } else if (guests < 20) {
        println("Small group of people")
    } else {
        println("Large group of people!")
    }

    println("-------------------------")


    //Rangos
    println(
        """
            ● Tipo de datos que contiene un rango de valores comparables
            (por ejemplo, números enteros del 1 al 100 inclusive)
            ● Los rangos están acotados(Limite)
            ● Los objetos dentro de un rango pueden ser mutables o inmutables
    """)
    //Ejemplo de rango en un loop If-else
    val number = 50
    if (number in 1..100) {
        println("Númerito: "+number)
    }

    println("-------------------------")

    //When
    var results2=20
    when (results2) {
        0 -> println("No results")
        in 1..39 -> println("Got results!")
        else -> println("That's a lot of results!")
    }

    println("-------------------------")

    //For con Rangos
    for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 3..6 step 2) print(i)
    println()

    for (i in 'd'..'g') print(i)
    println()

    println("-------------------------")

    //While y Do-While usando Incrementar y disminuir
    var bicycles = 0
    while (bicycles < 50) {
        bicycles++
    }
    println("$bicycles bicycles in the bicycle rack\n")

    do {
        bicycles--
    } while (bicycles > 50)
    println("$bicycles bicycles in the bicycle rack\n")

    println("-------------------------")

    //Repetidor
    repeat(2) {
        print("Hello!\n")
    }

    println("-------------------------")

    //Listas

    //Lista Inmutable
    val instrumentos = listOf("trompeta", "piano", "violin")
    println(instrumentos)

    //Lista Mutable
    val instrumentos2 = mutableListOf("trompeta", "piano", "violin")
    println(instrumentos2)

    println("-------------------------")

    //Arrays

    //Usando arrayOf
    val pets = arrayOf("dog", "cat", "canary")
    println(pets)

    //Tambien puede tener valores mixtos
    val mix = arrayOf("hats", 2)
    println(mix)

    println("-------------------------")

    //Practica 1
    print("Ingresa un número de 1 al 20: ")
    var numeros:Int= readLine()!!.toInt()
    if (numeros in 1..20){
        println("Tu númerito esta dentro del rango :D")
    } else {
        println("No esta dentro del rango pipipi :,v")
    }

    //Random(EXTRA)
    var numeros2:Int= (1..20).random()
    println("Número aleatorio: "+numeros2)

}