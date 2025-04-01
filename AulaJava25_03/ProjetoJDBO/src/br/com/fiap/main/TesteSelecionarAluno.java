package br.com.fiap.main;

import br.com.fiap.DAO.AlunoDAO;
import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TesteSelecionarAluno {

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

        AlunoDAO objAlunoDAO = new AlunoDAO();

        List<Aluno> listaAlunos = (ArrayList<Aluno>) objAlunoDAO.selecionar();

        if (listaAlunos != null) {
            // foreach
            for (Aluno a : listaAlunos) {
                System.out.println(
                        a.getRm() + " " +
                        a.getNome() + " " +
                        a.getTurma() + " " +
                        a.getNota() + " "
                );
            }
        }
    }
}
