package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    var input = ""
    var total = 0
    while (input != "-1") {
        println("n:")
        input = readln()
        if (input != "-1" && input.toInt() % 2 == 0) {
            total++
        }
    }

    println("Pares = $total")
}