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
        sentenciaWhen()
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
}