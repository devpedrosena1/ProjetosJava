package br.com.fiap.main;

import br.com.fiap.DAO.AlunoDAO;
import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.sql.SQLException;

public class TesteDeletarAluno {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Aluno objAluno = new Aluno();
        AlunoDAO objAlunoDAO = new AlunoDAO();

        objAluno.setRm(inteiro("Informe o número do RM do aluno a ser deletado: "));

        System.out.println(objAlunoDAO.deletar(objAluno.getRm()));
    }

}
