package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayListCliente {

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

        // preparar a lista
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

        // preparar objeto null
        Cliente objCliente = null;

        // laço de repetição (entradas) utilizando DO WHILE
        do {
            objCliente = new Cliente();
            objCliente.setCpf(text("CPF: "));
            objCliente.setNome(text("Nome: "));
            objCliente.setIdade(integer("Idade:"));
            objCliente.setNumeroCelular(text("Número de celular: "));
            objCliente.setRenda(real("Renda: "));

            listaClientes.add(objCliente);

        } while (JOptionPane.showConfirmDialog(null,
                "Cadastrar mais clientes?",
                "CADASTRO DE CLIENTES",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == 0
        );

        // saidas utilizando foreach
        for(Cliente c : listaClientes) {
            System.out.println(
                    "\nCPF: " + c.getCpf() +
                            "\nNome: " + c.getNome() +
                            "\nidade: " + c.getIdade() +
                            "\nNumero de celular: " + c.getNumeroCelular() +
                            "\nrenda: " + c.getRenda()
            );
        }

    }

}
