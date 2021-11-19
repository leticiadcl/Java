package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Aluno implements Serializable {
    //Atributos de um aluno
    private String nome;
    private String cpf;
    private String email;
    private Date dataNascimento;
    private String nomeResponsavel;
    private String cpfResponsavel;

    //Construtor para alunos de menor de idade
    public Aluno(String nome, String cpf, String email, Date dataNascimento, String nomeResponsavel, String cpfResponsavel) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
    }
    
    //Construtor para alunos de maior de idade
    public Aluno(String nome, String cpf, String email, Date dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeNascimento() {
        return dataNascimento;
    }

    public void setDataDeNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }
    
    //Para listar os alunos pelo nome
    @Override
    public String toString() {
        return nome;
    }  
    
    //Função que compara a igualdade do objeto com a classe
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.cpf);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
}
