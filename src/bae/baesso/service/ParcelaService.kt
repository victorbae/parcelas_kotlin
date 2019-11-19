package bae.baesso.service

import bae.baesso.model.GrupoParcela
import bae.baesso.model.Parcela
import java.time.LocalDate
import java.util.*

class ParcelaService {

     val controller = MainController();

    private fun geraParcelas(grupoParcela: GrupoParcela): GrupoParcela {
        val valorParcela = grupoParcela.getValorPorParcela()
        val diasEntreParcelas = grupoParcela.diasEntreParcelas
        var parcelas = ArrayList<Parcela>();

        var dataAnterior = LocalDate.now();

        for (i in 0 until grupoParcela.quantidadeParcelas) {
            parcelas.add(Parcela(valorParcela,i+1, dataAnterior));
            dataAnterior = dataAnterior.plusDays(diasEntreParcelas.toLong());
        }

        var newGrupoParcela = grupoParcela
        newGrupoParcela.parcelas = parcelas
        return newGrupoParcela
    }

    fun init(valorTotal: Double, diasEntreParcelas: Int, qtdParcelas: Int) {
        var gp = GrupoParcela(valorTotal, diasEntreParcelas, qtdParcelas)
        controller.showLog(geraParcelas(gp))
    }
}
