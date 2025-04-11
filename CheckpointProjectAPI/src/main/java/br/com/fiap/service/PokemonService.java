package br.com.fiap.service;

import br.com.fiap.model.Pokemon;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class PokemonService {

    public Pokemon getPokemon(String nomeOuId) throws IOException {
        Pokemon pokemon = null;

        // request
        HttpGet request = new HttpGet("https://pokeapi.co/api/v2/pokemon/"+nomeOuId.toLowerCase());

        // client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        // response
        CloseableHttpResponse response = httpClient.execute(request);

        // entity
        HttpEntity entity = response.getEntity();

        if(entity != null) {
            String result = EntityUtils.toString(entity);

            // parte nova
            JsonObject jsonObject = JsonParser.parseString(result).getAsJsonObject();

            int id = jsonObject.get("id").getAsInt();
            String name = jsonObject.get("name").getAsString();
            int height = jsonObject.get("height").getAsInt();
            int weight = jsonObject.get("weight").getAsInt();

            JsonArray typesArray = jsonObject.getAsJsonArray("types");
            JsonObject tipoObj = typesArray.get(0).getAsJsonObject();
            JsonObject tipoInfo = tipoObj.getAsJsonObject("type");
            String tipo = tipoInfo.get("name").getAsString();

            pokemon = new Pokemon(id, name, height, weight, tipo);

        }

        return pokemon;

    }

}
