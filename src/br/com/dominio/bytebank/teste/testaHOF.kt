package br.com.dominio.bytebank.teste

import br.com.dominio.bytebank.modelo.Autenticavel
import br.com.dominio.bytebank.modelo.Endereco
import br.com.dominio.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = { valor ->
        println(valor)
    }) //pode receber um "apelido"

    somaReceiver(1, 5, resultado = {
        println(this)
    }) //pode receber apenas o "this"

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha

    }
    val sistema = SistemaInterno()
    sistema.entra(autenticavel, senha = 1234, autenticado = {
        println("realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        teste()
    })
}

fun soma(a:Int, b: Int, resultado:(Int) -> Unit) { //soma com HOF (Higher-Order Function).
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}

fun somaReceiver(a:Int, b: Int, resultado: Int.() -> Unit) {
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}


//val testeFuncao: () -> Unit
//Endereco().let {
//    it
//}
//
//"".let { ::testeRecebeString }
//
//1.let{
//    it
//}
//teste(1, {}) //higher order function - tipo de função que recebe umma função
//
//fun testeRecebeString(valor: String) {
//
//}
//
////higher order function - função que recebe ou devolve outra função
//fun teste(teste: Int, bloco: () -> Unit) {
//
//}