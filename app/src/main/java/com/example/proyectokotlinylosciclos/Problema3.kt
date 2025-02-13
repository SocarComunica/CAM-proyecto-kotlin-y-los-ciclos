package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    var sum = 0
    var input = ""
    while (input != "0") {
        println("n:")
        input = readln()
        sum += input.toInt()
    }

    println("Suma = $sum")

}