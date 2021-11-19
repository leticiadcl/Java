package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Professor implements Serializable {
    //Atributo de um professor
    private String nome;
    private String cpf;
    private ArrayList<Ministracao> ministracoes; //Já que pode ministrar os dois cursos

    //Construtor
    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Ministracao> getMinistracoes() {
        return ministracoes;
    }

    public void setMinistracoes(ArrayList<Ministracao> ministracoes) {
        this.ministracoes = ministracoes;
    }

    //Para listar os professores pelo nome
    @Override
    public String toString() {
        return nome;
    }
}
