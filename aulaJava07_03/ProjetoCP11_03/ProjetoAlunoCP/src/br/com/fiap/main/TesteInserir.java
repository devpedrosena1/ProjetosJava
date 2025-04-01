package br.com.fiap.main;

import br.com.fiap.DAO.AlunoDAO;
import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserir {

    // Methods statics
    // String
    public static String text(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // Int
    public static int integer(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // Double
    public static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Aluno objAluno = new Aluno();

        AlunoDAO dao = new AlunoDAO();

        objAluno.setNome(text("Nome: "));
        objAluno.setRm(integer("RM: "));
        objAluno.setTurma(text("Turma:"));
        objAluno.setNota(real("Nota: "));

        System.out.println(dao.inserir(objAluno));

    }

}
