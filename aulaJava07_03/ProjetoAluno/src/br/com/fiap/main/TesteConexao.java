package br.com.fiap.main;

import br.com.fiap.conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    // passos
    // 1. psvm - 2. Instanciar o objeto da conexao
    // 3. Mensagem de conectado - 4. fechar o banco

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection cn = new ConexaoFactory().conexao();

        System.out.println(
                "Conectado com o banco de dados!"
        );
        cn.close();
    }
}
