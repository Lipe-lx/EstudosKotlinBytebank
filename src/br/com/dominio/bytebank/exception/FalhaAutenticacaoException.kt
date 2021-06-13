package br.com.dominio.bytebank.exception

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação"
) : Exception(mensagem)