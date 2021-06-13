import br.com.dominio.bytebank.modelo.Cliente
import br.com.dominio.bytebank.modelo.Diretor
import br.com.dominio.bytebank.modelo.Gerente
import br.com.dominio.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Luiz",
        cpf = "111.111.111-11",
        salario = 10000.0,
        senha = 1234
    )
    val diretora = Diretor(
        nome = "Fram",
        cpf = "222.121.211-12",
        salario = 10500.0,
        senha = 4321,
        plr = 1120.0
    )

    val cliente = Cliente(
        nome = "Guilherme",
        cpf = "777.777.777-11",
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretora, 4321)
    sistema.entra(cliente, 1234)

}