package Control;

import View.TelaProfessor;
import Model.Professor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControleProfessor {
    TelaProfessor objTelaProfessor;
    public ControlePrincipal objControlePrincipal;
    ArrayList<Professor> listaProfessor = new ArrayList<>();

    public ControleProfessor(ControlePrincipal pCtr) throws Exception {
        objControlePrincipal = pCtr;
        desserializaProfessor();
    }

    //Janela para fazer cadastro
    public void janelaCadastro() {
        objTelaProfessor = new TelaProfessor(this);
    }

    //Cadastra professor conforme a lista de professores
    public void cadastraProfessor(Professor professor) throws Exception {
        listaProfessor.add(professor);
        serializaProfessor();
    }
    
    //Get da lista de professores
    public ArrayList<Professor> getListaProfessor() {
        return listaProfessor;
    }

    //Grava os dados cadastrados no arquivo professores
    private void serializaProfessor() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("professores.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaProfessor);
        objOS.flush();
        objOS.close();
    }

    private void desserializaProfessor() throws Exception {
        File objFile = new File("professores.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("professores.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaProfessor = (ArrayList) objIS.readObject();
            objIS.close();
        }
    }

    public void finalize() throws Exception {
        serializaProfessor();
    }
}