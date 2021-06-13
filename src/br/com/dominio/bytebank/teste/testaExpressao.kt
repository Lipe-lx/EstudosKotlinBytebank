package br.com.dominio.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor inválido")
    }
}