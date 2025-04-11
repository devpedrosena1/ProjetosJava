package br.com.fiap.beans;

public class Aluno {

    // visibilidade, tipo de dados e atributos
    private String nome;
    private int rm;
    private String turma;
    private double nota;

    // construtor vazio
    public Aluno() {
        super();
    }

    public Aluno(String nome, int rm, String turma, double nota) {
        super();
        this.nome = nome;
        this.rm = rm;
        this.turma = turma;
        this.nota = nota;
    }

    // metodo getters (retornar) e setters (entradas)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // toString
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rm=" + rm +
                ", turma='" + turma + '\'' +
                ", nota=" + nota +
                '}';
    }

    // metodos com logica
}
