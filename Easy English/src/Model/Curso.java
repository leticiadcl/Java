package Model;

import java.io.Serializable;
import java.util.Objects;

public class Curso implements Serializable {
    //Atributos de um curso
    private TipoCurso tipoCurso;
    private int semestre;
    public static Curso K1 = new Curso(TipoCurso.KIDS, 1);
    public static Curso K2 = new Curso(TipoCurso.KIDS, 2);
    public static Curso K3 = new Curso(TipoCurso.KIDS, 3);
    public static Curso K4 = new Curso(TipoCurso.KIDS, 4);
    public static Curso K5 = new Curso(TipoCurso.KIDS, 5);
    public static Curso K6 = new Curso(TipoCurso.KIDS, 6);
    public static Curso R1 = new Curso(TipoCurso.REGULAR, 1);
    public static Curso R2 = new Curso(TipoCurso.REGULAR, 2);
    public static Curso R3 = new Curso(TipoCurso.REGULAR, 3);
    public static Curso R4 = new Curso(TipoCurso.REGULAR, 4);
    public static Curso R5 = new Curso(TipoCurso.REGULAR, 5);
    public static Curso R6 = new Curso(TipoCurso.REGULAR, 6);
    public static Curso R7 = new Curso(TipoCurso.REGULAR, 7);
    public static Curso R8 = new Curso(TipoCurso.REGULAR, 8);
    
    //Construtor 
    public Curso(TipoCurso tipoCurso, int semestre) {
        this.tipoCurso = tipoCurso;
        this.semestre = semestre;
    }

    //Getters e Setters
    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }   
    
    //Para listar os cursos pelo nome + semestre
    @Override
    public String toString() {
        return tipoCurso.getNome() + semestre;
    }
    
    //Função que compara a igualdade do objeto com a classe
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tipoCurso);
        hash = 59 * hash + this.semestre;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (this.semestre != other.semestre) {
            return false;
        }
        if (!Objects.equals(this.tipoCurso, other.tipoCurso)) {
            return false;
        }
        return true;
    }
}
