package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    val elements = mutableListOf<Int>()
    var input = ""
    while (input != "0") {
        println("n:")
        input = readln()
        if (input != "0") {
            elements.add(input.toInt())
        }
    }

    var greatest = Int.MIN_VALUE
    var greatestPosition = 0
    var current = 0
    while (current < elements.size) {
        if (elements[current] > greatest) {
            greatestPosition = current
            greatest = elements[current]
        }
        current++
    }

    println("Posición del mayor = ${greatestPosition + 1}")
}