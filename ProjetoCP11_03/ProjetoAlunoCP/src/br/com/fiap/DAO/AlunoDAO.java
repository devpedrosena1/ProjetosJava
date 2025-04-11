package br.com.fiap.DAO;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexao.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    public Connection minhaConexao;

    public AlunoDAO() throws SQLException, ClassNotFoundException {
        super();
        this.minhaConexao = new ConexaoFactory().conexao();
    }

    // Insert
    public String inserir (Aluno aluno) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
                "Insert Into T_FIAP_ALUNO values (?, ?, ?, ?)");

        stmt.setInt(1, aluno.getRm());
        stmt.setString(2, aluno.getNome());
        stmt.setDouble(3, aluno.getNota());
        stmt.setString(4, aluno.getTurma());

        stmt.execute();
        stmt.close();

        return "Aluno cadastrado com sucesso!";

    }

}
