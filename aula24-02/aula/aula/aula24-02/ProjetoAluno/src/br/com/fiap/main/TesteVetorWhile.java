package br.com.fiap.main;
import br.com.fiap.beans.Aluno;
import javax.swing.*;

public class TesteVetorWhile {

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

        // Preparar quantidade máxima de vetores
        Aluno[] vetorAluno = new Aluno[2]; // [0] [1]

        // indice para controlar as posições
        int i = 0;

        // condicao para iniciar o laço de repetição
        int j = 0;

        // entradas com o laço de repetição
        while (j == 0) {

            vetorAluno[i] = new Aluno();
            vetorAluno[i].setNome(text("Informe o nome do aluno: "));
            vetorAluno[i].setRm(integer("Informe o RM do aluno: "));
            vetorAluno[i].setTurma(text("Informe a turma do aluno: "));
            vetorAluno[i].setNota(real("Informe a nota do aluno: "));

            i++;

            j = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja cadastrar mais alunos?",
                    "Cadastro de alunos",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );
        }

        // saídas com for
        for (int k = 0; k < i; k++) {
            System.out.println(
                            "\nNome: " + vetorAluno[k].getNome() +
                            "\nRM: " + vetorAluno[k].getRm() +
                            "\nTurma: " + vetorAluno[k].getTurma() +
                            "\nNota: " + vetorAluno[k].getNota()
            );
        }

    }
}
