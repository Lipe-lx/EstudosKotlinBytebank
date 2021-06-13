package br.com.dominio.bytebank.teste

import br.com.dominio.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun testeNulos() {
    var enderecoNulo: Endereco? =
        Endereco(logradouro = "Rua Vergueiro", complemento = "predio") // ? PODE TER NULO - safe call
    val enderecoNaoNulo: String? = enderecoNulo?.logradouro

    //let função que pode ser chamada por qualquer classe - Envolve um objeto para dentro da sua função
    enderecoNulo?.let {
        println(it.logradouro.length)

        val tamanhoComplemento: Int =
            it.complemento?.length
                ?: throw IllegalStateException("Complemento não pode ser vazio") // ?: Tratamento com ElvisOperator (sintaxe enxuta)
        println(tamanhoComplemento)
    }
}

fun teste (valor: Any){
    val numero: Int? = valor as? Int //Safe Casts - Conversão sem ter problemas com nulos (Caso tenha uma "String" no lugar de um "Int" por exemplo)
}