package br.com.fiap.beans;

public class Aluno {

    // visibility, data type and attributes
    private String nome;
    private String turma;
    private int rm;
    private double nota;

    // Method constructor empty
    public Aluno() {
        super();
    }

    // Method constructor full
    public Aluno(String nome, String turma, int rm, double nota) {
        super();
        this.nome = nome;
        this.turma = turma;
        this.rm = rm;
        this.nota = nota;
    }

    // Methods Getters (return) and Setters (entries)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
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
                ", turma='" + turma + '\'' +
                ", rm=" + rm +
                ", nota=" + nota +
                '}';
    }
}
