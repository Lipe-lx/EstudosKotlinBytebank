import br.com.dominio.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente( //Composição - titular é do tipo Cliente onde tem todas as informações do titular.
            nome = "Luiz Filipe",
            cpf = "",
            senha = 1,
            endereco = Endereco(logradouro = "Rua da Liberdade")
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Filipe",
            cpf = "",
            senha = 3
        ),
        numero = 1002
    )

    println("Endereço: ${contaCorrente.titular.endereco.logradouro}") //Teste da Composição

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("Deposito conta correte, saldo atual: ${contaCorrente.saldo}")
    println("Deposito conta poupança, saldo atual: ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("Saque conta corrente, saldo atual: ${contaCorrente.saldo}")
    println("Saque conta poupança, saldo atual: ${contaPoupanca.saldo}")
    contaCorrente.transfere(200.0, contaPoupanca,1)
    contaPoupanca.transfere(100.0, contaCorrente,2)
    println("Transfere conta corrente para poupança, saldo atual: ${contaCorrente.saldo}")
    println("Transfere conta poupança para corrente, saldo atual: ${contaPoupanca.saldo}")
    contaSalario.deposita(100.0)
    contaSalario.saca(50.0)
    println("Saque conta salario, saldo atual: ${contaSalario.saldo}")
    println("Deposito conta salario, saldo atual: ${contaSalario.saldo}")

}

