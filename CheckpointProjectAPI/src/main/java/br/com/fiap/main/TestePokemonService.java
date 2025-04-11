package br.com.fiap.main;

import br.com.fiap.model.Pokemon;
import br.com.fiap.service.PokemonService;

import javax.swing.*;
import java.io.IOException;

public class TestePokemonService {

    // methods statics
    public static String text(String j) {
        return JOptionPane.showInputDialog(j);
    }

    public static void main(String[] args) throws IOException {

        PokemonService pokemonService = new PokemonService();

        String nomeOuId = text("Digite o nome ou o ID do Pokémon: ");

        Pokemon pokemon = pokemonService.getPokemon(nomeOuId);

        System.out.println(pokemon);

    }
}