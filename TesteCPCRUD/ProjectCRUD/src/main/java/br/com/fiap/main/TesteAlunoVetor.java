package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteAlunoVetor {

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

        // 1. Criar o vetor
        Aluno[] vetorAluno = new Aluno[2]; // [0] [1]

        // 2. Criar o indice para controlar a aplicação
        int i = 0;

        // 3. Entradas com Do While (lembre do i++)
        do {
            vetorAluno[i] = new Aluno();
            vetorAluno[i].setRm(integer("Informe o RM do aluno: "));
            vetorAluno[i].setNome(text("Informe o nome do aluno: "));
            vetorAluno[i].setTurma(text("Informe a turma do aluno: "));
            vetorAluno[i].setNota(real("Informe a nota do aluno: "));

            i++;
        } while (
                JOptionPane.showConfirmDialog(
                        null,
                        "Deseja cadastrar mais alunos?",
                        "CADASTRO DE ALUNOS",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                ) == 0 // 0 -> sim, 1 -> não
        );

        // 4. Saídas com for
        for (int j = 0; j < i; j++) {
            System.out.println(
                    "\nRM: " + vetorAluno[j].getRm() +
                    "\nNome: " + vetorAluno[j].getNome() +
                    "\nTurma: " + vetorAluno[j].getTurma() +
                    "\nNota: " + vetorAluno[j].getNota()
            );
        }
    }
}
