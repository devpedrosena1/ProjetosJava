package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

    // metodo de conexao
    public Connection conexao() {

        Connection cn = new ConexaoFactory().conexao();

        // Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // retornar conexao
        return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                "rm561178",
                "200905");

        System.out.println(
                "Conectado com o banco!"
        );

    }

}