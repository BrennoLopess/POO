import models.*;
import services.Ensalamento;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos e exemplo de uso
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        Disciplina poo = new Disciplina("POO do curso de TI", mia, ti);
        Disciplina ed = new Disciplina("Estrutura de Dados do curso de TI", saulo, ti);
        Disciplina bi = new Disciplina("BI do curso de ADM", paula, adm);

        ti.addDisciplina(poo);
        ti.addDisciplina(ed);
        adm.addDisciplina(bi);

        Aluno alfredo = new Aluno("Alfredo", "TI");
        Aluno amelia = new Aluno("Amélia", "TI");
        Aluno ana = new Aluno("Ana", "ADM");

        ti.addAluno(alfredo);
        ti.addAluno(amelia);
        adm.addAluno(ana);

        Ensalamento ensalamento = new Ensalamento();
        ensalamento.criarTurma(mia, poo);
        ensalamento.criarTurma(saulo, ed);
        ensalamento.criarTurma(paula, bi);

        ensalamento.imprimirTurmas();
    }
}
