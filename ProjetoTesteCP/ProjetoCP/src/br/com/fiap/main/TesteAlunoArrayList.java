package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteAlunoArrayList {

    // metodos staticos
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
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

        // preparar objeto null
        Aluno objAluno = null;

        // entradas com do while (add)
        do {
            objAluno = new Aluno();
            objAluno.setNome(text("Nome: "));
            objAluno.setRm(integer("RM: "));
            objAluno.setTurma(text("Turma: "));
            objAluno.setNota(real("Nota: "));

            listaAluno.add(objAluno);

        } while (
                JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar mais alunos? ",
                        "Cadastro de Alunos",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == 0
        );

        // saidas com foreach
        for (Aluno a : listaAluno) {
            System.out.println(
                    "\nNome: " + a.getNome() +
                            "\nRM: " + a.getRm() +
                            "\nTurma: " + a.getTurma() +
                            "\nNota: " + a.getNota()
            );
        }

    }

}
