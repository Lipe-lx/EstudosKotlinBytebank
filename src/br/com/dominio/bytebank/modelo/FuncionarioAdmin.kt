package br.com.dominio.bytebank.modelo

import br.com.dominio.bytebank.modelo.Autenticavel
import br.com.dominio.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin( //abstract para transformar a classe em abstrata (open implicito)
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
) : Funcionario( //Herança da classe mãe Fucionario
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel { //A interface implementa autenticavel para todas as classes filhas

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}