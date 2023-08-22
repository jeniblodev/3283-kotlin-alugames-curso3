package br.com.alura.alugames.principal

import br.com.alura.alugames.dados.Banco
import br.com.alura.alugames.dados.PlanosDAO
import br.com.alura.alugames.modelo.PlanoAssinatura
import br.com.alura.alugames.modelo.PlanoAvulso

fun main() {
    val avulso = PlanoAvulso("BRONZE")
    val prata = PlanoAssinatura("PRATA", 9.90, 3, 0.15)
    val ouro = PlanoAssinatura("OURO", 19.90, 5, 0.20)
    val platina = PlanoAssinatura("PLATINA", 29.90, 10, 0.30)
    val diamante = PlanoAssinatura("DIAMANTE", 49.90, 20, 0.50)

    val manager = Banco.getEntityManager()
    val planosDAO = PlanosDAO(manager)

    planosDAO.adicionar(avulso)
    planosDAO.adicionar(prata)
    planosDAO.adicionar(ouro)
    planosDAO.adicionar(platina)
    planosDAO.adicionar(diamante)

    val listaPlanos = planosDAO.getLista()
    println(listaPlanos)

    manager.close()
}