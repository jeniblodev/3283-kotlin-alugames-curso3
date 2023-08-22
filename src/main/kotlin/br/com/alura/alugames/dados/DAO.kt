package br.com.alura.alugames.dados

import javax.persistence.EntityManager

abstract class DAO <TModel>(protected val manager: EntityManager) {

    abstract fun toEntity(objeto: TModel)

    abstract fun getLista(): List<TModel>

    open fun adicionar(objeto: TModel) {
        val entity = toEntity(objeto)
        manager.transaction.begin()
        manager.persist(entity)
        manager.transaction.commit()
    }
}