package br.com.fiap.main;

import br.com.fiap.model.Endereco;
import br.com.fiap.service.ViaCepService;

import javax.swing.*;
import java.io.IOException;

public class TesteViaCep {

    // methods statics
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

    public static void main(String[] args) throws IOException {

        ViaCepService cepService = new ViaCepService();

        String cep = text("Informe o CEP: ");
        Endereco endereco = cepService.getEndereco(cep);

        System.out.println(endereco);

    }

}
