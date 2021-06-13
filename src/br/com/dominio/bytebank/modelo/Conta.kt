package br.com.dominio.bytebank.modelo

abstract class Conta( //Construtor personalizado na criação da classe (boa pratica), neste caso para pedir sempre o titular e numero da conta
    val titular: Cliente, //Composição - O titular é do tipo Cliente onde tem todas as informações
    val numero: Int     //var numero = 0 VARIAVEL INICIALIZADA NO CONSTRUTOR
): Autenticavel {

    var saldo = 0.0 //Property - São os atributos encapsulados
        protected set //protected - visivel somente para a mae e os filhos //Implementação do setters em Kotlin (boa pratica)

    fun deposita(valor: Double) { //Método deposita
        if (valor > 0.0) { //Evita o deposito de valor negativo
            this.saldo += valor
;        }
    }

    abstract fun saca(valor: Double) //Método abstrato - obrigando a implementação em cada classe filha

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha) //Delegação - reutilização do codigo ja implementado
    }
 }
//    //Metdos getters e setters para os atributos privados - Metodo não comum em Kotlin
//    fun getSaldo(): Double{
//        return this.saldo
//    }
//    fun setSaldo(valor: Double){
//        this.saldo = valor
//    }

