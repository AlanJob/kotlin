package com.example.kotlin001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Lección 1
        //variablesYConstantes()
        //Lección 2
        //tiposDeDatos()
        //Lección 3
        //sentenciaIf()
        //Lección 4
        //sentenciaWhen()
        //Lección 5
        //arrays()
        //Lección 6
        //maps()
        //Lección 7
        loops()
    }
    private fun variablesYConstantes(){
        // Variables
        var myVariable = "Jilay"
        println(myVariable)

        myVariable = "Jilay Soft"
        println(myVariable)

        var mySecondVariable = "Suscribete"

        println(mySecondVariable)

        mySecondVariable = myVariable
        println(mySecondVariable)

        //Constantes solo pueden tener un valor permanente
        val myFistConstant = "Constante"
        println(myFistConstant)
    }

    /*
    Aqui vamos a hablar de tipos de datos
    Inferencia de tipos
     */
    private fun tiposDeDatos(){
        //String
        val myString1 = "Jilay"
        val myString2 = "Soft"
        val myString3 = myString1 + " " + myString2
        println(myString3)

        //Int (Byte, Short, Int, Long)
        val myInt1 = 1
        val myInt2 = 2
        val myInt3 = myInt1 + myInt2
        println(myInt3)

        //Decimales (float, double) se pueden mezclar int y doubles sin convertir manualmente
        val myDouble1 = 1.5
        val myFloat:Float = 1.5f
        val myDouble2 = 1
        val myDouble3 = myDouble1 + myDouble2 + myFloat
        println(myDouble3)

        //Boolean
        val myBool1:Boolean = true
        val myBool2:Boolean = false
        println(myBool1 == myBool2)
        println(myBool1 && myBool2)
    }
    private fun sentenciaIf(){
        //Aqui vamos a hablar de las sentias if
        val myNumber = 10
        // >, >, >=, <=, ==, != operadores condicionales
        // &&, ||, ! operadores lógicos
        if (myNumber <= 10 && myNumber > 5){
            println("$myNumber es menor o igual que 10 y mayor que 5")
        }else {
            println("$myNumber otra opcion")
        }
    }

    /*Aquí vamos a hablar de la sentencia When */
    private fun sentenciaWhen(){
        val country = "México"
        when(country){
            "México", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                println("El idioma es Inglés")
            }
            "Francia" -> {
                println("El idioma es Francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        //When con int
        val age = 10
        when(age){
            0, 1, 2 -> {
                println("Eres un bebé")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 ->{
                println("Eres un adolescente")
            }
            in 18..69 ->{
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres anciano")
            }else -> {
                println("Sorprendente")
            }

        }
    }

    //Aqui vamos a tratar los arreglos que es un conjunto de datos del mismo tipo
    //ordenados pues el primer elemento toma la posición 0, el segundo la posición 1 y asi sucesivamente
    //Se pueden añadir repetidos

    private fun arrays(){
        val name = "Alan"
        val surname = "Job"
        val company = "Jilay"
        val age = "29"

        //Creacion de array
        val myArray = arrayListOf<String>()
        //Añadir datos
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        //Agregar mas de un elemento a la vez
        myArray.addAll(listOf("Ejemplo001", "Ejemplo002"))

        //Modificar los elementos ya ingresados
        myArray[4] = "rewrite"

        //Acceso a datos
        val myCompany:String = myArray[2]
        println(myCompany)

        //Borramos elementos
        myArray.removeAt(5)

        //Imprimimos todo
        println(myArray)

        //Recorremos el array
        myArray.forEach {
        println(it)}

        //Contar
        println(myArray.count())

        //Imprimir el primero
        println(myArray.first())

        //Imprimir el último
        println(myArray.last())

        //Vaciamos el array
        myArray.clear()
        println(myArray.count())


    }

    private fun maps(){
        //Aqui hablaremos de los diccionarios o mapas
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        //Añadir elementos
        myMap = mutableMapOf("Jilay" to 1, "Fix" to 2, "Soft" to 3)
        println(myMap)

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",3)
        println(myMap)

        myMap.put("Marcos", 3)
        //Actualización de datos
        myMap.put("Jilay", 3)
        myMap["Jilay"] = 7
        println(myMap)

        //Accedemos a los datos
        println(myMap["Jilay"])

        //Eliminación de datos
        myMap.remove("Marcos")
        println(myMap)

    }

    private fun loops(){
        /*Bucles nos sirven para almacenar datos*/
        val myArray: List<String> = listOf("Hola", "Bienvenidos a Jilay", "Fix")
        val myMap: MutableMap<String, Int> = mutableMapOf("Uno" to 1, "Dos" to 2, "Cinco" to 5)

        //For

        for(myString in myArray){
            println(myString)
        }

        //Lo que sigue significa que vamos a utilizar interpolación de cadenas
        //con el uso de simbolo $ seguido de la variable o constante
        for(myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        //Veamos más utilidades del for

        for(x in 0..10){
            println(x)
        }

        for(x in 0 until 10){
            println(x)
        }

        for(x in 0..10 step 2){
            println(x)
        }

        for(x in 10 downTo 0 step 2){
            println(x)
        }

        //Atajo para llenar un Array

        val myNumArray = (0..10)
        for(myNum in myNumArray){
            println(myNum)
        }

        //While
        var x = 0
        while (x < 10){
            println(x)
            x++
        }
    }
}