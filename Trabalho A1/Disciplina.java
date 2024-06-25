package models;

public class Disciplina {
    private String nome;
    private Professor professor;
    private Curso curso;

    public Disciplina(String nome, Professor professor, Curso curso) {
        this.nome = nome;
        this.professor = professor;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Curso getCurso() {
        return curso;
    }
}
