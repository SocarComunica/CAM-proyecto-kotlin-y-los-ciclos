package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("A:")
    var a = readln().toInt()
    println("B:")
    var b = readln().toInt()

    var result = ""
    if (a < b) {
        for (i in a..b) {
            result += "$i "
        }
    } else if (a > b) {
        for (i in a downTo b) {
            result += "$i "
        }
    } else {
        result = "$a "
    }

    print(result)

}