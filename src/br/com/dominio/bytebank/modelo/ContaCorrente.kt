package br.com.dominio.bytebank.modelo

class ContaCorrente(
    titular: Cliente, //Composição - titular é do tipo Cliente onde tem todas as informações do titular.
    numero: Int
) : ContaTransferencia( //o : br.com.dominio.bytebank.modelo.Conta refere-se a classe mae
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.10
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}