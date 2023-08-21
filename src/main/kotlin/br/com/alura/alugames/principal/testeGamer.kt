package br.com.alura.alugames.principal
import br.com.alura.alugames.modelo.Gamer
fun main() {
    val gamer1 = Gamer("Jacque", "jacque@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Jeni",
        "jeni@email.com",
        "19/19/1992",
        "jeniblo")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/09/2000"
        it.usuario = "jacqueskywalker"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "jacque"
    println(gamer1)
}