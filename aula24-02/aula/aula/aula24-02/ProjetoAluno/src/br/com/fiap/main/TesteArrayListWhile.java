package br.com.fiap.main;

import br.com.fiap.beans.Aluno;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteArrayListWhile {

    // metodos estaticos
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

    public static void main(String[] args) {

        // preparar a lista
        List<Aluno> listaAluno = new ArrayList<Aluno>();

        // criar objeto null
        Aluno objAluno = null;

        int resp = 0;

        // Laço de repetição com as entradas
        while(resp == 0) {

            objAluno = new Aluno();
            objAluno.setNome(text("Informe o nome do aluno: "));
            objAluno.setRm(integer("Informe o RM do aluno: "));
            objAluno.setTurma(text("Informe a turma do aluno: "));
            objAluno.setNota(real("Informe a nota do aluno: "));

            listaAluno.add(objAluno);

            resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja cadastrar mais alunos?",
                    "CADASTRO DE ALUNOS",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
        }

        // saidas com foreach
        for (Aluno a : listaAluno) {
            System.out.println(
                    "\nNome: " + a.getNota() +
                            "\nRM: " + a.getRm() +
                            "\nTurma: " + a.getTurma() +
                            "\nNota: " + a.getNota()
            );
        }
    }
}
