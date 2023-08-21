package br.com.alura.alugames.modelo

 class PlanoAvulso(
    tipo: String, id: Int = 0): Plano(tipo, id) {

     override fun obterValor(aluguel: Aluguel): Double {
         var valorOriginal = super.obterValor(aluguel)
         if (aluguel.gamer.media > 8) {
             valorOriginal -= valorOriginal * 0.1
         }
         return valorOriginal
     }

     override fun toString(): String {
         return "Plano Avulso\n" +
                 "Tipo: $tipo\n" +
                 "Id: $id\n"
     }
 }
