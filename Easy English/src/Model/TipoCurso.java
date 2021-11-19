package Model;

import java.io.Serializable;
import java.util.Objects;

public class TipoCurso  implements Serializable {
    //Atributos do tipo de curso (Kids/Regular)
    private String nome;    
    public static TipoCurso KIDS = new TipoCurso("K");
    public static TipoCurso REGULAR = new TipoCurso("R");

    //Construtor
    public TipoCurso(String nome) {
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Função que compara a igualdade do objeto com a classe
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nome);
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
        final TipoCurso other = (TipoCurso) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}