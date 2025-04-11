package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteAlunoVetor {

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

        // preparar o vetor
        Aluno[] vetorAluno = new Aluno[2];

        // iniciar o indice para controle do sistema
        int i = 0;

        // entradas com do while (i ++)
        do {
            vetorAluno[i] = new Aluno();
            vetorAluno[i].setNome(text("Nome: "));
            vetorAluno[i].setRm(integer("RM: "));
            vetorAluno[i].setTurma(text("Turma: "));
            vetorAluno[i].setNota(real("Nota: "));

            i++;

        } while (
                JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar mais alunos? ",
                        "Cadastro de Alunos",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == 0
        );

        // saidas com for
        // inicio, condição e incremento
        for (int j = 0; j < i; j++) {
            System.out.println(
                    "Nome: " + vetorAluno[j].getNome() +
                            "RM: " + vetorAluno[j].getRm() +
                            "Turma: " + vetorAluno[j].getTurma() +
                            "Nota: " + vetorAluno[j].getNota()
            );
        }

    }

}
