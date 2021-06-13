fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Luiz Filipe $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println()
        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }

    //for (i in 1..5 step 2) { CRIA de 2 em 2
    //for (i in 1 until 5) { CRIA ATÉ O 4 (PENULTIMO)
    //for (i in 5 downTo 1) { ORDEM DECRESCENTE
    for (i in 1..5) { //ORDEM CRESCENTE
        val titular: String = "Luiz Filipe $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println()
        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}