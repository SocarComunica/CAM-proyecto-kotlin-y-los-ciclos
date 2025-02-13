package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    if (n <= 0) {
        println("Error")
    } else {
        var total = 0
        var memo = 1
        for (i in 1..n) {
            memo *= i
            total += memo
        }
        println("s = $total")
    }
}

fun problema9v1() {
    // Desarrolle aquí la lógica
    println("n:")
    val n = readln().toInt()
    if (n <= 0) {
        println("Error")
    } else {
        var total = 0
        for (i in 1..n) {
            var totalInterno = 1
            for (j in 1..i) {
                totalInterno *= j
            }
            total += totalInterno
        }
        println("s = $total")
    }
}