package br.com.dominio.bytebank.modelo

abstract class Funcionario( //abstract para transformar a classe em abstrata (open implicito)
    val nome: String,
    val cpf: String,
    val salario: Double

) {
    abstract val bonificacao: Double

}