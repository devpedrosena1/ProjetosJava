package br.com.fiap.main;

import br.com.fiap.conexoes.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection cn = new ConnectionFactory().conexao();

        System.out.println(
                "Conetado com o banco de dados!"
        );

        cn.close();

        // prox aula veremos o pacote DataAcessObject
    }
}
