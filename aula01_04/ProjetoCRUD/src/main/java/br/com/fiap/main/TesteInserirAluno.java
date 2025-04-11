package br.com.fiap.main;

import br.com.fiap.beans.Aluno;
import br.com.fiap.dao.AlunoDAO;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirAluno {

    // String
    public static String text(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    public static int integer(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    public static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Aluno objAluno = new Aluno();
        AlunoDAO objAlunoDao = new AlunoDAO();

        objAluno.setRm(integer("Informe o RM do aluno: "));
        objAluno.setNome(text("Informe o nome do Aluno:"));
        objAluno.setTurma(text("Informe a turma do aluno: "));
        objAluno.setNota(real("Informe a nota do Aluno: "));

        System.out.println(objAlunoDao.inserir(objAluno));
    }

}
