package br.com.dominio.bytebank.modelo

import br.com.dominio.bytebank.exception.FalhaAutenticacaoException
import br.com.dominio.bytebank.exception.SaldoInsuficienteException
import br.com.dominio.bytebank.modelo.Conta

abstract class ContaTransferencia(
    titular: Cliente, //Composição - titular é do tipo Cliente onde tem todas as informações do titular.
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {

    //UTILIZANDO EXCEPTION PARA VERIFICAÇÃO
    open fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor){
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, Saldo atual: $saldo, Valor a transferir: $valor"
            )
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
            this.saldo -= valor
            destino.deposita(valor)
    }

//    open fun transfere(valor: Double, destino: Conta): Boolean {
//        if (this.saldo >= valor) {
//            this.saldo -= valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }

}