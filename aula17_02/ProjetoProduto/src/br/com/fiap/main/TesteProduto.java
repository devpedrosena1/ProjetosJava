package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class TesteProduto {

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

        Produto objProduct = new Produto();

        objProduct.setTipo(text("nos informe o tipo do profuto"));
        objProduct.setMarca(text("qual seria a marcca do produto?"));
        objProduct.setQuantidade(integer("quantidade do produto"));
        objProduct.setValor(real("QUal o preco do produto?"));

        System.out.println(objProduct);

        System.out.println("valor total do produto: " + objProduct.valorTotal());

    }
}
