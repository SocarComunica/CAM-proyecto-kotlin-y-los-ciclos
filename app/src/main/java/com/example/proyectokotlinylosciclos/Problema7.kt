package com.example.proyectokotlinylosciclos

import kotlin.math.pow

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("N:")
    val n = readln().toInt()

    if (n > 0) {
        var result = 0.0
        for (i in 1..n) {
            result += i.toDouble().pow(3.0)
        }

        println("s = ${result.toInt()}")

    } else {
        println("Error")
    }


}