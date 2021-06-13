package br.com.dominio.bytebank.modelo

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "0000-000"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "0000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println(
        "${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}