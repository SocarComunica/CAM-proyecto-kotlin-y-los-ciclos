package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    val x = readln().toInt()
    println("Ingresa y:")
    val y = readln().toInt()

    var current = x.toDouble()
    var dias = 1
    while (current < y) {
        current *= 1.1
        dias++
    }

    println("Necesitas $dias días para correr bien los $y Km")
}