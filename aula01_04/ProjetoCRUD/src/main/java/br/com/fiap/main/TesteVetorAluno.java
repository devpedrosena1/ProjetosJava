package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteVetorAluno {

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

    public static void main(String[] args) {

        // Determinar a quantidade maxima de vetores
        Aluno[] vetorAluno = new Aluno[2]; // [0] [1]

        // indice para controlar as posições
        int indice = 0;

        // laço de repetição (entradas)
        do {

            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setRm(inteiro("RM do aluno"));
            vetorAluno[indice].setNome(texto("Nome do aluno"));
            vetorAluno[indice].setTurma(texto("Turma do aluno"));
            vetorAluno[indice].setNota(real("Nota do aluno"));

            indice++;

        } while( JOptionPane.showConfirmDialog(null,
                "Cadastrar mais aluno?",
                "CADASTRO DE ALUNOS",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE )  ==0);

        // Saidas utilizando for
        for(int contador = 0; contador < indice; contador++){
            System.out.println(
                    "\n\nRM: " + vetorAluno[contador].getRm() +
                    "\nNome: " + vetorAluno[contador].getNome() +
                    "\nTurma: " + vetorAluno[contador].getTurma() +
                    "\nNota: " + vetorAluno[contador].getNota()
            );
        }

    }


}
