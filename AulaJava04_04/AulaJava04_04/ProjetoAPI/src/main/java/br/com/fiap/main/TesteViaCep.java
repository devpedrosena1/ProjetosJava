package br.com.fiap.main;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

import javax.swing.*;
import java.io.IOException;

public class TesteViaCep {

    // String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j) {
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j) {
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) throws IOException {

        ViaCepService cepService = new ViaCepService();

        String cep = texto("Informe o CEP: ");

        Endereco endereco = cepService.getEndereco(cep);

        System.out.println(endereco);

    }

}
