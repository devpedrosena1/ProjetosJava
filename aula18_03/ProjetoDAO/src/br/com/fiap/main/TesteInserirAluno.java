package br.com.fiap.main;

import br.com.fiap.DAO.AlunoDAO;
import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.sql.SQLException;

public class TesteInserirAluno {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static  int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real (String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // instanciar objetos
        Aluno objAluno = new Aluno();
        AlunoDAO objAlunoDAO = new AlunoDAO();

        objAluno.setRm(inteiro("Informe o RM do aluno: "));
        objAluno.setNome(texto("Informe o nome do aluno:"));
        objAluno.setTurma(texto("Informe a turma do aluno: "));
        objAluno.setNota(real("Informe a nota do aluno: "));

        System.out.println(objAlunoDAO.inserir(objAluno));

    }
}
