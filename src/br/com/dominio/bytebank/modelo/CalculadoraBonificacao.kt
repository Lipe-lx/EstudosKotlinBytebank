package br.com.dominio.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }
//
//    fun registra(funcionario: Any){
//        val funcionarioNovo: Funcionario = funcionario as Funcionario //Mesmo declarando como Any o "as" transforma na classe Funcionario
//        this.total += funcionario.bonificacao
//    }

//    fun registra(funcionario: Any){
//        if(funcionario is Funcionario){ //SmartCast - mesmo declarando como Any o if junto com o "is" confere e transforma na classe Funcionario
//            this.total += funcionario.bonificacao
//        }
//
//    }

//    Por conta do polimorfismo não é necessária a criação dos metodos abaixo:
//    fun registra(gerente: br.com.dominio.bytebank.modelo.Gerente){
//        this.total += gerente.bonificacao
//    }
//    fun registra(diretor: br.com.dominio.bytebank.modelo.Diretor){
//        this.total += diretor.bonificacao
//    }

}