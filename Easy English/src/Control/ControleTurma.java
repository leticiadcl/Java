package Control;

import Model.Curso;
import Model.Professor;
import View.TelaTurma;
import Model.Turma;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleTurma {
    private ControlePrincipal objControlePrincipal;

    private TelaTurma objTelaTurma;
    private ArrayList<Turma> listaTurma = new ArrayList();

    public ControleTurma(ControlePrincipal pCtr) throws Exception {
        objControlePrincipal = pCtr;
        desserializaTurma();
    }
    
    //Janela para fazer cadastro
    public void janelaCadastro() {
        objTelaTurma = new TelaTurma(this);
    }
    
    //Cadastra professor conforme a lista de turmas
    public void cadastraTurma(Turma turma) throws Exception {
        listaTurma.add(turma);
        serializaTurma();
    }
    
    //Getters
    public ArrayList<Professor> getListaProfessor(){
        return objControlePrincipal.objControleProfessor.getListaProfessor();
    }
        
    public ArrayList<Turma> getListaTurma() { 
        return listaTurma;
    }
    public Curso[] getListaCurso() {
        return new Curso[] {Curso.K1,Curso.K2,Curso.K3,Curso.K4,Curso.K5,Curso.K6,
            Curso.R1,Curso.R2,Curso.R3,Curso.R4,Curso.R5,Curso.R6,Curso.R7,Curso.R8};
    }
    
    //Grava os dados cadastrados no arquivo turmas
    private void serializaTurma() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("turmas.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaTurma);
        objOS.flush();
        objOS.close();
    }

    private void desserializaTurma() throws Exception {
        File objFile = new File("turmas.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("turmas.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaTurma = (ArrayList) objIS.readObject();
            objIS.close();
        }
    }

    public void finalize() throws Exception {
        serializaTurma();
    }
}
