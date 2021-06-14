package br.com.dominio.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = "" // Para funcionar a SafeCast colocar "String? = null"
) {
    fun completo(): String {
        return """
            $logradouro - $numero, $bairro, $cidade - $estado
            CEP: $cep
            Complemento: $complemento
        """.trimIndent()

    }
}
