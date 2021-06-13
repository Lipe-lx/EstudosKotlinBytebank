package br.com.dominio.bytebank.modelo

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario( //Extendendo a classe mae br.com.dominio.bytebank.modelo.Funcionario
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return this.salario * 0.1
        }

}