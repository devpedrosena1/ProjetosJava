package br.com.fiap.beans;

public class Produto {

    private String marca;
    private String tipo;
    private int quantidade;
    private double valor;

    public Produto() {
        super();
    }

    public Produto(String marca, String tipo, int quantidade, double valor) {
        super();
        this.marca = marca;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto" +
                "\nMarca: " + marca +
                "\ntipo: " + tipo +
                "\nQuantidade: " + quantidade +
                "\nValor: " + valor;
    }

    public double valorTotal() {
        return valor * quantidade;
    }
}
