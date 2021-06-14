package br.com.dominio.bytebank.teste

//RECRURSOS DO PARADGMA FUNCIONAL


fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit =
        fun() { //implementação onde não conseguimos reutilizar o codigo em uma outra variavel
            println("Executa como anonima")
        }
    println(minhaFuncaoAnonima())

    val minhaFuncaoAnonima2 =
        fun(a: Int, b: Int): Int { //implementação onde não conseguimos reutilizar o codigo em uma outra variavel
            return a + b
        }
    println(minhaFuncaoAnonima2(20, 15)) //Parametros sao necessarios somente quando o chamamos

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    print("Anonima: ")
    println(calculaBonificacaoAnonima(1100.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda: () -> Unit = { //implementação onde não conseguimos reutilizar o codigo em uma outra variavel
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoLambda2 =
        { a: Int, b: Int -> //implementação onde não conseguimos reutilizar o codigo em uma outra variavel
            a + b //a última instrução é o que retorna
        }
    println(minhaFuncaoLambda2(15, 10)) //Parametros sao necessarios somente quando o chamamos

    val calculaBonificacaoLambda: (salario: Double) -> Double = lambda@{ salario -> // lambda@ multiplo retorno
        if (salario > 1000.0) {
            return@lambda salario + 50 // return@lambda serve para retornar antes da ultima instrução
        }
        salario + 100.0
    }
    print("Lambda: ")
    println(calculaBonificacaoLambda(1000.0))
}

fun testaFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma() //() -> Int = implementa a função dentro da classe (variavel do tipo função com um objeto)
    println(minhaFuncaoClasse(10, 10)) //Parametros sao necessarios somente quando o chamamos
}

fun testaFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma // () -> Int = :: implementa a função dentro da variavel (variavel do tipo função)
    println(minhaFuncao(5, 10)) //Parametros sao necessarios somente quando o chamamos
}

fun soma(a:Int, b:Int) : Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}
