package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    var total = 1
    for (i in 1..n) {
        total *= i
    }

    println("$n ! = $total")

}