package br.com.fiap.beans;

public class Produto {

    // visibility, data type and attributes
    private int codigo;
    private String tipo;
    private String marca;
    private int qtd;
    private double valor;

    // Method Constructor empty
    public Produto(){
        super();
    }

    // Method Constructor full
    public Produto(int codigo, String tipo, String marca, int qtd, double valor) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.qtd = qtd;
        this.valor = valor;
    }

    // Methods Getters (return) and Setters (entries)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        return "==== INFORMAÇÕES DO PRODUTO ====" +
                "\nCódigo: " + codigo +
                "\nTipo: " + tipo +
                "\nMarca: " + marca +
                "\nQuantidade: " + qtd +
                "\nvalor: " + valor;
    }

    // methods workers
    public double valorTotal() {
        return valor * qtd;
    }

}
