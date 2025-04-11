package br.com.fiap.main;

import br.com.fiap.conexoes.ConexaoFactory;

import java.sql.Connection;

public class TesteConexao {

    public static void main(String[] args) {
        Connection cn = new ConexaoFactory().conexao();
        System.out.println(
                "Conectado!"
        );

        cn.close();
    }
}
