package services;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class Ensalamento {
    private List<Turma> turmas;

    public Ensalamento() {
        turmas = new ArrayList<>();
    }

    public void criarTurma(Professor professor, Disciplina disciplina) {
        Turma novaTurma = new Turma(professor, disciplina);
        for (Aluno aluno : disciplina.getCurso().getAlunos()) {
            novaTurma.addAluno(aluno);
        }
        turmas.add(novaTurma);
    }

    public void imprimirTurmas() {
        for (Turma turma : turmas) {
            System.out.println(turma.detalhesDaTurma());
        }
    }
}
