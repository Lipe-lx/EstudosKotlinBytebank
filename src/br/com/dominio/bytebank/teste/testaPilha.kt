package br.com.dominio.bytebank.teste

import br.com.dominio.bytebank.exception.SaldoInsuficienteException

fun funcao1(){
    println("início funcao1")
    try{ //Tratamento das exceções
        funcao2()
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace() // Imprime o rastro da pilha.
        println("SaldoInsuficienteException foi pega")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}