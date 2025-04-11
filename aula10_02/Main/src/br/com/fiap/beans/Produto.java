package br.com.fiap.beans;

public class Produto {

    // visibilidade, tipo de dados e atributos
    private String marca;
    private String tipo;
    private int qtd;
    private double valor;

    // method constructor empty
    public Produto() {
        super();
    }

    // method constructor full
    public Produto(String marca, String tipo, int qtd, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.qtd = qtd;
        this.valor = valor;
    }

    // Metodos Getters (exibir/retornar) e Setters (entradas)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // toString
    @Override
    public String toString() {
        return "Produto: \n" +
                "\nMarca: " + marca +
                "\ntipo: " + tipo +
                "\nqtd: " + qtd +
                "\nvalor: " + valor;
    }
}
