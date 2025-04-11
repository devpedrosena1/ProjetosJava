package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // passos
    // 1. criar o metodo para conectar o banco de dados
    // 2. iniciar o driver (deve estar dentro da pasta)
    // 3. Retornar a conexão com o banco de dados

    // metodo para conectar o projeto com o banco de dados
    public Connection conexao() throws ClassNotFoundException, SQLException {
        // Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Retornar a conexao com o banco de dados
        return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                "rm561178", "200905");
    }
}
