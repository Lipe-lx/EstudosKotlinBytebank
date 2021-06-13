import br.com.dominio.bytebank.modelo.*

fun testaFuncionarios() {
    val analista2 = Analista(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 10000.0
    )
    println()
    println("Nome: ${analista2.nome}")
    println("CPF: ${analista2.cpf}")
    println("Salario: ${analista2.salario}")
    println("Bonificação: ${analista2.bonificacao}")

    val gerente1 = Gerente(
        nome = "Luiz Filipe",
        cpf = "111.111.111-11",
        salario = 15000.0,
        senha = 1234
    )
    println()
    println("Nome: ${gerente1.nome}")
    println("CPF: ${gerente1.cpf}")
    println("Salario: ${gerente1.salario}")
    println("Bonificação: ${gerente1.bonificacao}")

    if (gerente1.autentica(1234)) {
        println("Autenticação com sucesso!")
    } else {
        println("Falha na autenticação.")
    }

    val diretor1 = Diretor(
        nome = "Guilherme",
        cpf = "333.333.333-33",
        salario = 20000.0,
        senha = 4000,
        plr = 200.0
    )
    println()
    println("Nome: ${diretor1.nome}")
    println("CPF: ${diretor1.cpf}")
    println("Salario: ${diretor1.salario}")
    println("Bonificação: ${diretor1.bonificacao}")
    println("PLR: ${diretor1.plr}")

    if (diretor1.autentica(4000)) {
        println("Autenticação com sucesso!")
    } else {
        println("Falha na autenticação.")
    }

    val analista1 = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 12000.0
    )
    println()
    println("Nome: ${analista1.nome}")
    println("CPF: ${analista1.cpf}")
    println("Salario: ${analista1.salario}")
    println("Bonificação: ${analista1.bonificacao}")

    val aux1 = Auxiliar(
        nome = "Paulo",
        cpf = "555.555.555-55",
        salario = 5000.0
    )
    println()
    println("Nome: ${aux1.nome}")
    println("CPF: ${aux1.cpf}")
    println("Salário: ${aux1.salario}")
    println("Bonificação: ${aux1.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(analista2)
    calculadora.registra(diretor1)
    calculadora.registra(gerente1)
    calculadora.registra(analista1)
    calculadora.registra(aux1)
    println()
    println("O total de bonificação é: ${calculadora.total}")

}