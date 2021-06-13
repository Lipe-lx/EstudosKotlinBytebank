package br.com.dominio.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    senha: Int
) : FuncionarioAdmin( //Extendendo a classe mae br.com.dominio.bytebank.modelo.FuncionarioAdmin
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double
        get() {
            return (this.salario * 1.1) + this.plr
        }

}