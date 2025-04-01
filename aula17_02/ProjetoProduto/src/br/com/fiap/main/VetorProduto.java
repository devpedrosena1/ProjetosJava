package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class VetorProduto {

    // string
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

        // Preparar a quantidade maxima de posições []
        Produto[] vetorProduto = new Produto[2]; // [0] [1]

        // indice para controlar as posições
        int i = 0;

        // Laço de repetição (entradas)
        do {
            vetorProduto[i] = new Produto();
            vetorProduto[i].setMarca(text("Qual seria a marca do produto? "));
            vetorProduto[i].setTipo(text("Nos informe o tipo do produto? "));
            vetorProduto[i].setQuantidade(integer("Quantidade do produto? "));
            vetorProduto[i].setValor(real("Qual o preço do produto? "));

            i++;

        } while (JOptionPane.showConfirmDialog(null,
                "Aicionar mais produtos",
                "Carrinho de Compras",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0
        );

        // saidas
        for (int j = 0; j < i; j++) {
            System.out.println(
                    "INFORMAÇÕES DO PRODUTO" +
                            "\nMarca: " + vetorProduto[j].getMarca() +
                            "\nTipo: " + vetorProduto[j].getTipo() +
                            "\nQuantidade: " + vetorProduto[j].getQuantidade() +
                            "\nValor: " + vetorProduto[j].getValor()
            );
        }
    }

}
