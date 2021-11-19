package Control;

import View.TelaPrincipal;

public class ControlePrincipal {
    TelaPrincipal objLimitePrincipal;
    public ControleTurma objControleTurma;
    public ControleAluno objControleAluno;
    public ControleProfessor objControleProfessor;
    public ControleMatricula objControleMatricula;

    public ControlePrincipal() {
        try {
            objControleProfessor = new ControleProfessor(this);
            objControleAluno = new ControleAluno(this);
            objControleTurma = new ControleTurma(this);
            objControleMatricula = new ControleMatricula(this);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro ao abrir arquivo");
        }
        objLimitePrincipal = new TelaPrincipal(this);
        objLimitePrincipal.setVisible(true);
    }
    
    //Janelas para fazer o respectivo cadastro
    public void janelaTurma() {
        objControleTurma.janelaCadastro();
    }

    public void janelaAluno() {
        objControleAluno.janelaCadastro();
    }

    public void janelaProfessor() {
        objControleProfessor.janelaCadastro();
    }

    public void janelaHistorico() {
        objControleMatricula.janelaHistorico();
    }

    public void janelaRelatorioTurma() {
        objControleMatricula.janelaRelatorioTurma();
    }

    public void janelaRelatorioConcluinte() {
        objControleMatricula.janelaRelatorioConcluinte();
    }

    public void janelaRenovar() {
        objControleMatricula.janelaRenovar();
    }

    public void janelaLancaNota() {
        objControleMatricula.janelaLancaNota();
    }

    public void finalize() {
        try {
            objControleTurma.finalize();
            objControleProfessor.finalize();
            objControleAluno.finalize();
        } catch (Exception ex) {
            System.out.println("Erro ao salvar arquivo.");
        }
    }

    public static void main(String[] args) {
        ControlePrincipal main = new ControlePrincipal();
    }
}
