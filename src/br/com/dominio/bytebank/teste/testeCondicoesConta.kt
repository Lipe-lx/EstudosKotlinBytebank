import br.com.dominio.bytebank.exception.FalhaAutenticacaoException
import br.com.dominio.bytebank.exception.SaldoInsuficienteException
import br.com.dominio.bytebank.modelo.Cliente
import br.com.dominio.bytebank.modelo.ContaCorrente
import java.lang.Exception

fun testeCondicoesConta() {
    println("Bem vindo ao Bytebank!")
    println()

    val conta1 = ContaCorrente(titular = Cliente( //Composição - titular é do tipo Cliente onde tem todas as informações do titular.
        nome = "Luiz Filipe",
        cpf = "111.111.111-11",
        senha = 1
    ), numero = 1000)

    conta1.deposita(200.0)

    val conta2 = ContaCorrente(numero = 1001, titular = Cliente( //Utilizando lables nao necessita de seguir a ordem de inicialização.
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 2
    ))

    conta2.deposita(300.0)

    println("Nome: ${conta1.titular.nome}")
    println("Numero: ${conta1.numero}")
    println("Saldo: ${conta1.saldo}")
    println()
    println("Nome: ${conta2.titular.nome}")
    println("Numero: ${conta2.numero}")
    println("Saldo: ${conta2.saldo}")

    //Verificação do método deposita
    conta1.deposita(50.0)
    conta2.deposita(70.0)
    println()
    println("Valor depositado na conta: ${conta1.titular.nome}, saldo atualizado para ${conta1.saldo}")
    println("Valor depositado na conta: ${conta2.titular.nome}, saldo atualizado para ${conta2.saldo}")
    println()

    //Verificação do método saca
    conta1.saca(30.0)
    conta2.saca(50.0)
    println("Valor sacado na conta: ${conta1.titular.nome}, saldo atualizado para ${conta1.saldo}")
    println("Valor sacado na conta: ${conta2.titular.nome}, saldo atualizado para ${conta2.saldo}")
    println()

    //Verificação do método transfere
    println("Transferencia da conta da Fran para o Luiz Filipe")

    //UTILIZANDO EXCEPTION PARA VERIFICAÇÃO
    try{
        conta2.transfere(100.0, conta1,1)
        println("Transferencia bem sucedida")
        println("Conta: ${conta1.titular.nome}, saldo atualizado para ${conta1.saldo}")
        println("Conta: ${conta2.titular.nome}, saldo atualizado para ${conta2.saldo}")

    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia.")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na autenticação, transferencia não realizada.")
        e.printStackTrace()
    } catch (e: Exception) { //catch generalista do Exception sempre fica por ultimo.
        println("Exceção desconhecida")
        e.printStackTrace()
    }

}