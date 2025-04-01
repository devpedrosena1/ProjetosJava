package br.com.fiap.dao;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AulaDAO {

    public Connection minhaConexao;

    // method constructor empty
    public AulaDAO() throws SQLException, ClassNotFoundException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // insert
    public String inserir (Aluno aluno) throws SQLException {
        PreparedStatement stmt =
                minhaConexao.prepareStatement(
                        "Insert into T_FIAP_ALUNO values (?, ?, ?, ?)"
                );
        stmt.setInt(1, aluno.getRm());
        stmt.setString(2, aluno.getNome());
        stmt.setString(3, aluno.getTurma());
        stmt.setDouble(4, aluno.getNota());

        stmt.execute();
        stmt.close();

        return "Aluno cadastrado com sucesso!";
    }

    // delete

    // update

    // select

}
