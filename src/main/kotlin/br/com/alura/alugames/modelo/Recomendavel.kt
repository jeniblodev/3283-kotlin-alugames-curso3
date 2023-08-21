package br.com.alura.alugames.modelo

interface Recomendavel {
    val media: Double

    fun recomendar(nota: Int)
}