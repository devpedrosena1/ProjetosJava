package br.com.fiap.model;

public class Pokemon {

    private int id;
    private String name;
    private int height;
    private int weight;
    private String tipo;

    public Pokemon() {
        super();
    }

    public Pokemon(int id, String name, int height, int weight, String tipo) {
        super();
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "=== Pokémon ===" +
                "\nID:" + id +
                "\nNome: " + name +
                "\nAltura: " + height +
                "\nPeso: " + weight +
                "\nTipo: " + tipo;
    }
}
