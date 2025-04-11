package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection conexao() throws ClassNotFoundException, SQLException {

        // 1. Driver oracle
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 2. Retornar a conexão
        return DriverManager.getConnection(
                "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                "rm561178",
                "200905"
        );
    }
}