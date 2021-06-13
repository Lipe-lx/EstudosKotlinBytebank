package br.com.dominio.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin( //Extendendo a classe mae br.com.dominio.bytebank.modelo.Funcionario
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double
        get() {
            return this.salario
        }
}