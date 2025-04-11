package br.com.fiap.beans;

public class Aluno {

    // visibility, data type and attributes
    private int rm;
    private String nome;
    private String turma;
    private double nota;

    // method constructor empty
    public Aluno() {
        super();
    }

    // method constructor full
    public Aluno(int rm, String nome, String turma, double nota) {
        super();
        this.rm = rm;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    // methods getters (return) and setters (entries)
    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // method toString
    @Override
    public String toString() {
        return "=== Aluno ===" +
                "\nrm: " + rm +
                "\nnome: " + nome +
                "\nturma: " + turma +
                "\nnota: " + nota;
    }
}
