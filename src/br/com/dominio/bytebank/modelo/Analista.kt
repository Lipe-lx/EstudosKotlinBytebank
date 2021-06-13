package br.com.dominio.bytebank.modelo

class Analista(
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
//    override val bonificacao: Double
//        get() {
//            return super.bonificacao + this.salario * 0.1 //super.bonificacao chama a property da classe mae utilizando a sua logica
//        }

}