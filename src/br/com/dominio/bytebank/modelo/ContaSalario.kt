package br.com.dominio.bytebank.modelo

import br.com.dominio.bytebank.modelo.Conta

class ContaSalario(
    titular: Cliente, //Composição - titular é do tipo Cliente onde tem todas as informações do titular.
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}