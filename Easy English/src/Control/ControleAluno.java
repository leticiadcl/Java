package Control;

import View.TelaAluno;
import Model.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControleAluno {
    public ControlePrincipal objControlePrincipal; 
    TelaAluno objTelaAluno; 
    ArrayList<Aluno> listaAluno = new ArrayList<>();

    public ControleAluno(ControlePrincipal pCtr) throws Exception {
        objControlePrincipal = pCtr;
        desserializaAluno();
    }
    

    //Janela para fazer cadastro
    public void janelaCadastro() {
        objTelaAluno = new TelaAluno(this);
    }

    //Cadastra aluno conforme a lista de alunos
    public void cadastraAluno(Aluno aluno)throws Exception{
        listaAluno.add(aluno);
        serializaAluno();
    }
    
    //Get da lista de alunos
    public ArrayList<Aluno> getListaAluno() {
        return listaAluno;
    }
    
    //Grava os dados cadastrados no arquivo alunos
    private void serializaAluno() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("alunos.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaAluno);
        objOS.flush();
        objOS.close();
    }

    private void desserializaAluno() throws Exception {
        File objFile = new File("alunos.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("alunos.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaAluno = (ArrayList) objIS.readObject();
            objIS.close();
        }
    }

    public void finalize() throws Exception {
        serializaAluno();
    }
}
