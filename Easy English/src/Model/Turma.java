package Model;

import java.io.Serializable;
import java.util.Objects;

public class Turma implements Serializable {
    //Atributos de uma turma
    private String codigo;
    private int semestre;
    private int ano;
    private int capacidade;
    private String horario;
    private Curso curso;
    private Professor professor;

    //Construtor
    public Turma(String codigo,int semestre, int ano, int capacidade, String horario, Curso curso, Professor professor) {
        this.codigo = codigo;
        this.semestre = semestre;
        this.ano = ano;
        this.capacidade = capacidade;
        this.horario = horario;
        this.curso = curso;
        this.professor = professor;
    } 

    //Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    //Para listar as turmas pelo código + ano.semestre
    @Override
    public String toString() {
        return  "Código: " + codigo + " " + ano + "." + semestre;
    }

    //Função que compara a igualdade do objeto com a classe
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        hash = 37 * hash + this.semestre;
        hash = 37 * hash + this.ano;
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
        final Turma other = (Turma) obj;
        if (this.semestre != other.semestre) {
            return false;
        }
        if (this.ano != other.ano) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
}