package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteSistemaVetor {

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

        // 1. Criar o vetor
        Aluno[] vetorAluno = new Aluno[2];

        // 2. Criar o índice para controlar a aplicação
        int i = 0;

        // 3. Realizar as entradas com do while (lembrar de acrescentar i++)
        do {
            vetorAluno[i] = new Aluno();
            vetorAluno[i].setNome(text("Nome: "));
            vetorAluno[i].setRm(integer("RM: "));
            vetorAluno[i].setNota(real("Nota: "));
            vetorAluno[i].setTurma(text("Turma: "));

            i++;

        } while (
                JOptionPane.showConfirmDialog(
                        null,
                        "Deseja cadastrar mais alunos?",
                        "CADASTRO DE ALUNOS",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == 0
                );

        // 4. Saídas com for
        // em for temos: início, condição e incremento
        for (int j = 0; j < i; j++) {
            System.out.println(
                    "=== DADOS DOS ALUNOS CADASTRADOS ===" +
                    "\nNome: " + vetorAluno[j].getNome() +
                    "\nRM: " + vetorAluno[j].getRm() +
                    "\nNota: " + vetorAluno[j].getNota() +
                    "\nTurma: " + vetorAluno[j].getTurma()
            );
        }

    }

}
