package bae.baesso.model

class GrupoParcela {

    var valorTotal: Double = 0.0
    var diasEntreParcelas: Int = 0
    var quantidadeParcelas: Int = 0
    var parcelas: List<Parcela>? = ArrayList()

    constructor(valorTotal: Double, diasEntreParcelas: Int, quantidadeParcelas: Int) {
        this.valorTotal = valorTotal
        this.diasEntreParcelas = diasEntreParcelas
        this.quantidadeParcelas = quantidadeParcelas
    }

    fun getValorPorParcela(): Double {
        return valorTotal / quantidadeParcelas
    }
}