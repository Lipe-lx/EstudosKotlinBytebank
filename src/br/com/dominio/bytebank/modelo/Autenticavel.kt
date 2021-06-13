package br.com.dominio.bytebank.modelo

//Interface trabalha como um contrato que deve ser implementado
//Neste caso utilizando o metodo autentica para classes com conceitos diferentes como Clinte e br.com.dominio.bytebank.modelo.Gerente
interface Autenticavel {

    fun autentica(senha: Int): Boolean

}