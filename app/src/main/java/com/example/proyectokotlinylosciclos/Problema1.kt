package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema1() {
    // Desarrolle aquí la lógica
    println("Ingresa N:")
    val n = readln().toInt()
    var a = 1
    var result = ""
    while (true) {
        val pow = a * a
        if (pow <= n) {
            result += "${a * a} "
            a++
        } else {
            break
        }
    }
    print(result)

}