package Control;

import Model.Aluno;
import Model.Matricula;
import Model.Turma;
import View.TelaHistorico;
import View.TelaLancaNota;
import View.TelaRelatorioConcluinte;
import View.TelaRelatorioTurma;
import View.TelaRenovar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleMatricula {
    public ControlePrincipal objControlePrincipal;
    TelaHistorico objTelaHistorico;
    TelaRenovar objTelaRenovar;
    TelaRelatorioConcluinte objTelaRelatorioConcluinte;
    TelaRelatorioTurma objTelaRelatorioTurma;
    TelaLancaNota objTelaLancaNota;
    ArrayList<Matricula> listaMatricula= new ArrayList<>();

    public ControleMatricula(ControlePrincipal pCtr) throws Exception {
        objControlePrincipal = pCtr;
        desserializaMatricula();
    }
    
    //Janelas para fazer o respectivo cadastro
    public void janelaHistorico() {
        objTelaHistorico = new TelaHistorico(this);
    }
    
    public void janelaRenovar(){
        objTelaRenovar = new TelaRenovar(this);
    }
    
    public void janelaRelatorioConcluinte(){
        objTelaRelatorioConcluinte = new TelaRelatorioConcluinte(this);
    }
    
    public void janelaRelatorioTurma(){
        objTelaRelatorioTurma = new TelaRelatorioTurma(this);
    }
    
    public void janelaLancaNota(){
        objTelaLancaNota = new TelaLancaNota(this);
    }

    //Cadastra matricula conforme a lista de matricula
    public void cadastraMatricula(Matricula matricula)throws Exception{
        listaMatricula.add(matricula);
        serializaMatricula();
    }
    
    //Atualiza as notas conforme a matricula (lança notas)
    public void salvaMatriculas()throws Exception{
        serializaMatricula();
    }
    
    //Getters das listas
    public ArrayList<Matricula> getListaMatricula() {
        return listaMatricula;
    }
    
    public ArrayList<Aluno> getListaAluno(){
        return objControlePrincipal.objControleAluno.getListaAluno();
    }
    
    public ArrayList<Turma> getListaTurma(){
        return objControlePrincipal.objControleTurma.getListaTurma();
    }
    
    //Grava os dados cadastrados no arquivo matriculas
    private void serializaMatricula() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("matriculas.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaMatricula);
        objOS.flush();
        objOS.close();
    }

    private void desserializaMatricula() throws Exception {
        File objFile = new File("matriculas.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("matriculas.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaMatricula = (ArrayList) objIS.readObject();
            objIS.close();
        }
    }

    public void finalize() throws Exception {
        serializaMatricula();
    }
}