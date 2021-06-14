package br.com.dominio.bytebank.teste

import br.com.dominio.bytebank.modelo.Cliente
import br.com.dominio.bytebank.modelo.ContaPoupanca
import br.com.dominio.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    //   higher order function : FUNÇÃO DE ALTA ORDEM

    Endereco(logradouro = "Rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase() // .toUpperCase() transformar em letras maiusculas
        }.let(::println) //Chamada encadeada sem a necessidade de declarar uma variavel

//    Função de escopo com receiver/receptor (run)
    Endereco(logradouro = "Rua vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase() // .toUpperCase() transformar em letras maiusculas
        }.let(::println) //Chamada encadeada sem a necessidade de declarar uma variavel

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() }) // filtro onde busca somente complementos que nao estao vazios .isNotEmpty() // predicate tipo função
        .let(block = (::println)) //Chamada encadeada sem a necessidade de declarar uma variavel

}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal: $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Luiz Filipe", cpf = "222.222.222-22", senha = 1234), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }
    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal // repeat: repete quantidade determinada de vezes a conta, no caso 12x
        }
        saldo
    }
    println("Rendimento anual: $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Maria Amélia Fonte Boa"
        numero = 1111
        bairro = "Nova Gameleira"
        cidade = "Belo Horizonte"
        estado = "MG"
        cep = "1111-111"
        complemento = "Casa"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}


