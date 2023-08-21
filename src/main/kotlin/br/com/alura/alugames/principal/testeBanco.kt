package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco

fun main() {
    val conexao = Banco.obterConexao()
    println(conexao)
}