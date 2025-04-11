package br.com.fiap.dao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexoes.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    // 1. Criar um objeto para receber a conexão
    public Connection minhaConexao;

    // 2. Metodo construtor
    public AlunoDAO() throws SQLException, ClassNotFoundException {
        super();
        this.minhaConexao = new ConnectionFactory().conexao();
    }

    // Insert
    public String inserir (Aluno aluno) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "INSERT INTO T_FIAP_ALUNO values (?, ?, ?, ?)"
        );

        stmt.setInt(1, aluno.getRm());
        stmt.setString(2, aluno.getNome());
        stmt.setString(3, aluno.getTurma());
        stmt.setDouble(4, aluno.getNota());

        stmt.execute();
        stmt.close();

        return "Aluno inserido com sucesso!";
    }

    // delete
    // update
    // select

}
