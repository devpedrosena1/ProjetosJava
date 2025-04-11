package br.com.fiap.main;

import br.com.fiap.conexoes.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // 1. Criando uma conexão
        Connection cn = new ConnectionFactory().conexao();

        // 2. Se a conexão deu certo, printar a mensagem
        System.out.println("Sistema conectado com o banco de dados!");

        // 3. Fechar a conexão
        cn.close();
    }
}