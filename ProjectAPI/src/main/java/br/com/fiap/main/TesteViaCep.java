package br.com.fiap.main;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

import javax.swing.*;
import java.io.IOException;

public class TesteViaCep {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws IOException {
        ViaCepService cepService = new ViaCepService();

        String cep = texto("Informe o numero do CEP para a busca");
        Endereco endereco = cepService.getEndereco(cep);

        System.out.println(endereco);

    }
}
