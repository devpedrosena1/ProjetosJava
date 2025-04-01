package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteVetorProduto {

    // Methods Statics
    // String
    public static String text(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    public static int integer(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    public static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        // Determine quantity maxime the positions
        Produto[] vetorProduto = new Produto[4]; // [0] [1] [2] [3]

        // index for control as positions
        int i = 0;

        // do while
        do {
            vetorProduto[i] = new Produto();
            vetorProduto[i].setCodigo(integer("Código: "));
            vetorProduto[i].setTipo(text("Tipo: "));
            vetorProduto[i].setMarca(text("Marca: "));
            vetorProduto[i].setQtd(integer("Quantidade: "));
            vetorProduto[i].setValor(real("Valor: "));

            i++;

        } while (JOptionPane.showConfirmDialog(null,
                "Adicionar mais produtos no carrinho?",
                "Carrinho de Compras", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0);

        // For
        for(int j = 0; j < i; j++) {
            System.out.println(
                    "\nCódigo: " + vetorProduto[j].getCodigo() +
                    "\nTipo: " + vetorProduto[j].getTipo() +
                    "\nMarca: " + vetorProduto[j].getMarca() +
                    "\nQuantidade: " + vetorProduto[j].getQtd() +
                    "\nValor: " + vetorProduto[j].getValor()
            );
        }

    }
}
