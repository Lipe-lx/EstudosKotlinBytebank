fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("br.com.dominio.bytebank.modelo.Conta é positiva")
    } else if (saldo == 0.0) {
        println("A conta está zerada.")
    } else {
        println("A conta está negativa.")
    }

    //Substituição do if por whem
    when {
        saldo > 0.0 -> println("br.com.dominio.bytebank.modelo.Conta é positiva")
        saldo == 0.0 -> println("A conta está zerada.")
        else -> println("A conta está negativa.")
    }
}