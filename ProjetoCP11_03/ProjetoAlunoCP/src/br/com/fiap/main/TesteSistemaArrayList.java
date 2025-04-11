package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;

public class TesteSistemaArrayList {

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

    public static void main(String[] args) {

        // 1. Criar a lista
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();

        // 2. Preparar objeto null
        Aluno objAluno = null;

        // 3. Entradas com do while (lembrar de usar o .add(objAluno)
        do {
            objAluno = new Aluno();
            objAluno.setNome(text("Nome: "));
            objAluno.setRm(integer("RM: "));
            objAluno.setNota(real("Nota: "));
            objAluno.setTurma(text("Turma: "));

            listaAluno.add(objAluno);

        } while(
                JOptionPane.showConfirmDialog(
                        null,
                        "Deseja cadastrar mais alunos?",
                        "CADASTRO DE ALUNOS",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == 0
        );

        // 4. Saídas com ForEach
        for (Aluno a : listaAluno) {
            System.out.println(
                    "=== DADOS DE ALUNOS CADASTRADOS ===" +
                            "\nNome: " + a.getNome() +
                            "\nRM: " + a.getRm() +
                            "\nNota: " + a.getNota() +
                            "\nTurma: " + a.getTurma()
            );
        }

    }

}
