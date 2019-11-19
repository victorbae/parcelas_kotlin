package bae.baesso

import bae.baesso.service.ParcelaService
import java.util.*


fun main(args: Array<String>) {

    val gerador = ParcelaService()

    val scanner = Scanner(System.`in`)

    println("Digite o valor total da conta:")
    var valorTotal: Double = scanner.nextDouble()

    println("Digite a quantidade de parcelas:")
    var qtdParcelas: Int = scanner.nextInt()

    println("Digite a quantidade de dias entre as parcelas:")
    var diasEntreParcelas: Int = scanner.nextInt()

    gerador.init(valorTotal, diasEntreParcelas, qtdParcelas)

}
