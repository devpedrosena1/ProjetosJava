package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteListaProdutos {

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

        // Preparar a lista
        List<Produto> ListaProduto = new ArrayList<Produto>();

        // Prepara objeto
        Produto objProduto = null;

        // Laço de repetição (instancia objeto)
        do {
            objProduto = new Produto();
            objProduto.setMarca(text("Qual a marca do produto? "));
            objProduto.setTipo(text("Qual o tipo do produto?"));
            objProduto.setQuantidade(integer("Qual a quantidade de produtos: "));
            objProduto.setValor(real("Qual o valor do produto? "));

            ListaProduto.add(objProduto);
        } while (
                JOptionPane.showConfirmDialog(null,
                        "Aicionar mais produtos",
                        "Carrinho de Compras",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == 0
        );

        // com arrayList utilizamos foreach para a saida
        for(Produto p : ListaProduto) {
            System.out.println(
                    "INFORMAÇÕES DO PRODUTO" +
                            "\nMarca: " + p.getMarca() +
                            "\nTipo: " + p.getTipo() +
                            "\nQuantidade: " + p.getQuantidade() +
                            "\nValor: " + p.getValor()
            );
        }
    }
}
