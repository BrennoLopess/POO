package models;
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        if (aluno.getCurso().equals(this.disciplina.getCurso().getNome())) {
            alunos.add(aluno);
        }
    }

    public String detalhesDaTurma() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Turma de " + disciplina.getNome() + " - Professor: " + professor.getNome() + "\n");
        detalhes.append("Alunos:\n");
        for (Aluno aluno : alunos) {
            detalhes.append(" - " + aluno.getNome() + "\n");
        }
        return detalhes.toString();
    }
}
