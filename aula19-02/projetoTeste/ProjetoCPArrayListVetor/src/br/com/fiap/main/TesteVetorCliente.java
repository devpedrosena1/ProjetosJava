package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;

public class TesteVetorCliente {

    // metodos staticos
    // string
    public static String text(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    public static int integer(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    public static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Determinar a quantidade máxima de vetores
        Cliente[] vetorCliente = new Cliente[2]; // [0] [1]

        // fazer o indice para controlar as posições
        int i = 0;

        // laço de repretição (entradas)
        do {

            vetorCliente[i] = new Cliente();
            vetorCliente[i].setCpf(text("CPF: "));
            vetorCliente[i].setNome(text("Nome: "));
            vetorCliente[i].setIdade(integer("idade:"));
            vetorCliente[i].setNumeroCelular(text("Número de celular: "));
            vetorCliente[i].setRenda(real("Renda: "));

            i++;

        } while (JOptionPane.showConfirmDialog(null,
                "Cadastrar mais clientes?",
                "CADASTRO DE CLIENTES",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0
        );

        // saidas utilizando o FOR
        for (int j = 0; j < i; j++) {
            System.out.println(
                    "\n\nCPF: " + vetorCliente[j].getCpf() +
                            "\nNome: " + vetorCliente[j].getNome() +
                            "\nIdade: " + vetorCliente[j].getIdade() +
                            "\nNumero de celular: " + vetorCliente[j].getNumeroCelular() +
                            "\nRenda: " + vetorCliente[j].getRenda()
            );
        }

    }

}
