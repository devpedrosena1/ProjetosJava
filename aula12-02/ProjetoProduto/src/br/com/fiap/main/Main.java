package br.com.fiap.main;

import br.com.fiap.beans.Produto;

import javax.swing.*;

public class Main {

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

        // instantiate object
        // int codigo, String tipo, String marca, int qtd, double valor
        Produto objProduto = new Produto(
             integer("Digite o código do produto: "),
             text("Digite o tipo do produto: "),
             text("Diigte a marca do produto: "),
             integer("Digite a quantidade de produtos: "),
             real("Digite o valor do produto: ")
        );

        // or we can do it this way
//        objProduto.setCodigo(integer("Digite o código do produto: "));
//        objProduto.setTipo(text("Digite o tipo do produto: "));
//        objProduto.setMarca(text("Digite a marca do produto: "));
//        objProduto.setQtd(integer("Digite a quantidade de produtos: "));
//        objProduto.setValor(real("Digite o valor do produto: "));

        // exits
        System.out.println(
                objProduto
        );

        System.out.println(
                "\nValor total: " + objProduto.valorTotal()
        );

    }
}
