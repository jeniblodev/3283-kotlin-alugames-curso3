package br.com.alura.alugames.dados

import br.com.alura.alugames.modelo.Jogo
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object Banco {
    fun obterConexao(): Connection? {
        return try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/alugames", "root", "aLxXzDcgueZu6z")
        } catch (e: SQLException) {
            e.printStackTrace()
            null
        }
    }
    fun getJogos(): List<Jogo> {
        val listaJogos = mutableListOf<Jogo>()
        val conexao = obterConexao()

        if (conexao != null) {
            try {
                val statement = conexao.createStatement()
                val resultado = statement.executeQuery("SELECT * FROM JOGOS")

                while (resultado.next()) {
                    val id = resultado.getInt("id")
                    val titulo = resultado.getString("titulo")
                    val capa = resultado.getString("capa")
                    val descricao = resultado.getString("descricao")
                    val preco = resultado.getDouble("preco")

                    val jogo = Jogo(titulo,capa, preco, descricao, id)
                    listaJogos.add(jogo)
                }

                statement.close()
            } finally {
                conexao.close()
            }
        }

        return listaJogos
    }
}