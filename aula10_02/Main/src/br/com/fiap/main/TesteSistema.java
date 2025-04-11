package br.com.fiap.main;

import javax.swing.*;

public class TesteSistema {

        // methods statics
        // string
        public static String text(String j){
            return JOptionPane.showInputDialog(j);
        }

        // int
        public static int inteiro(String j){
            return Integer.parseInt(JOptionPane.showInputDialog(j));
        }

        // double
        public static double real(String j) {
            return Double.parseDouble(JOptionPane.showInputDialog(j));
        }

        public static void main(String[] args) {

        // instanciar objetos
        // String marca, String tipo, int qtd, double valor
        Produto objProduto = new Produto(
                text("Digite o Logradouro: "),
                text("Digite o tipo: "),
                inteiro("Digite a quantidade: "),
                real("Digite o valor: ")
        )

        // chamando a saída toString
            System.out.println(
                    "\nINFORMAÇÕES DO PRODUTO: " + objProduto
            );

    }
}
