package bae.baesso.service

import bae.baesso.model.GrupoParcela

class MainController {

    fun showLog(grupoParcela: GrupoParcela) {
        println("Parcelas geradas:")
        println("---")
        grupoParcela.parcelas!!.forEach() {
            println("Parcela número: " + it.numero)
            println("Data da parcela: " + it.data)
            println("Valor da parcela: " + it.valor)
            println("---")
        }
    }
}