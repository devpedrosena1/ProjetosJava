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

        Aluno objAluno = new Aluno();
        AlunoDAO objAlunoDao = new AlunoDAO();

        objAluno.setRm(inteiro("RM: "));
        objAluno.setNome(texto("Nome: "));
        objAluno.setTurma(texto("Turma: "));
        objAluno.setNota(real("Nota: "));

        System.out.println(objAlunoDao.inserir(objAluno));

    }

}
