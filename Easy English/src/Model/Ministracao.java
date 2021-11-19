package Model;

import java.io.Serializable;

public class Ministracao implements Serializable {
    //Atributos de um professor que ministra um curso
    private TipoCurso tipoCurso;
    private Professor professor;

    //Construtor
    public Ministracao(TipoCurso tipoCurso, Professor professor) {
        this.tipoCurso = tipoCurso;
        this.professor = professor;
    }

    //Getters e Setters
    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
