package br.com.dominio.bytebank.modelo

import br.com.dominio.bytebank.modelo.Autenticavel


//const val taxaAdicional = 0.1 -> São properties imutáveis que não mudam o seu estado, como é o caso de tipos primitivos ou Strings, e que não tenham um getter personalizado

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(), //Composição - adiciona o endereço ao cliente com as info. vazias podendo modificar posteriormente
    private val senha: Int //Avaliar sempre a sensibilidade do atributo (acesso a outras classes)
) : Autenticavel {

    //OBJECT EXPRESSION
    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha

    }
    //OBJECT DECLARATION
    companion object { //Compartilha o membro "total" com a classe deixando ele encapsulado
        var total = 0
            private set
    }

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}

