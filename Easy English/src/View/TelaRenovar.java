package View;

import Control.ControleMatricula;
import Model.Aluno;
import Model.Curso;
import Model.Matricula;
import Model.TipoCurso;
import Model.Turma;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class TelaRenovar extends javax.swing.JFrame {

    ControleMatricula objControleMatricula;

    public TelaRenovar(ControleMatricula pCtr) {
        objControleMatricula = pCtr;
        initComponents();
        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaRenovar() {
        initComponents();
    }

    //Design da tela renovar matricula
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cpfalunorenovar3 = new javax.swing.JLabel();
        botaomatricularenovar1 = new javax.swing.JButton();
        cpfalunorenovar = new javax.swing.JLabel();
        cpfalunorenovar4 = new javax.swing.JLabel();
        botaorenova = new javax.swing.JButton();
        pegacpf = new javax.swing.JTextField();
        pegaano = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pegasemestre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        cpfalunorenovar3.setText("Nome do Aluno:");

        botaomatricularenovar1.setText("Renovar Matricula");
        botaomatricularenovar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaomatricularenovar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Renovar Matrícula");

        cpfalunorenovar.setText("CPF do Aluno:");

        cpfalunorenovar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpfalunorenovar4.setText("Renovar Matrícula");

        botaorenova.setText("Renovar Matrícula");
        botaorenova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaorenovaActionPerformed(evt);
            }
        });

        jLabel1.setText("Ano que deseja renovar:");

        jLabel2.setText("Semestre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(cpfalunorenovar4)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpfalunorenovar)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaorenova)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pegasemestre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pegaano)
                            .addComponent(pegacpf))
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(cpfalunorenovar4)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfalunorenovar)
                    .addComponent(pegacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegaano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegasemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addComponent(botaorenova)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaomatricularenovar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaomatricularenovar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaomatricularenovar1ActionPerformed

    private void botaorenovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaorenovaActionPerformed
        // TODO add your handling code here:
        String cpf = pegacpf.getText();
        int ano = Integer.parseInt(pegaano.getText());
        int semestre = Integer.parseInt(pegasemestre.getText());
        
        try {
            //Aluno começa com null, pois vai preencher o aluno desejado
            Aluno verifica = null;

            //Verifica em cada aluno, se o cpf é igual o cpf buscado
            for (Aluno a : objControleMatricula.getListaAluno()) {
                if (a.getCpf().equals(cpf)) {//A variável 'a' significa todos os alunos
                    verifica = a; //Iguala o aluno buscado em aluno achado por a
                }
            }

            //Se o aluno continuar nulo, não existe esse aluno
            if (verifica == null) {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
                return;
            }

            //Lista de todas as matriculas
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();

            //Comeca com null a ultima matricula
            Matricula ultimaMatricula = null;

            //Até verificar a matricula, ela verifica se é o mesmo aluno e se é o semestre/ano são atuais
            for (Matricula matricula : matriculas) {
                if (matricula.getAluno().equals(verifica)) {
                    ultimaMatricula = matricula; //Coloca na ultima matricula
                }
            }

            //Se a ultima matricula continuar nula, nao tem matricula do semestre atual
            if (ultimaMatricula == null) {
                JOptionPane.showMessageDialog(null, "Matrícula não encontrada!");
                return;
            }

            //Pega o curso que o aluno está fazendo no semestre atual
            Curso curso = ultimaMatricula.getTurma().getCurso();

            //Calcula a media da N1 e N2
            double media = (ultimaMatricula.getN1() + ultimaMatricula.getN2()) / 2;

            //Se a media for menor que 6, aluno reprovado
            if (media < 6.0) {
                int semestreCurso = curso.getSemestre();
                //Aluno faz o curso de novo
                if (curso.getTipoCurso().equals(TipoCurso.KIDS)) {
                    curso = new Curso(TipoCurso.KIDS, semestreCurso);
                } else {
                    curso = new Curso(TipoCurso.REGULAR, semestreCurso);
                }
            }

            //Se a media for maior que 6, aluno aprovado
            if (media >= 6.0) {
                int semestreCurso = curso.getSemestre();
                //Aluno passa de curso
                if (curso.getTipoCurso().equals(TipoCurso.KIDS)) {
                    if (semestreCurso == 6) {//Se chegar no K6, vai para R5
                        curso = Curso.R5;
                    } else {//Soma +1 para cada curso do kids
                        curso = new Curso(TipoCurso.KIDS, semestreCurso + 1);
                    }
                } else {
                    if (semestreCurso == 8) {//O aluno terminou o easyEnglish, pois acabou o R8
                        JOptionPane.showMessageDialog(null, "Aluno já cursou o último curso!");
                        return;
                    } else {//Cada curso R, soma +1
                        curso = new Curso(TipoCurso.REGULAR, semestreCurso + 1);
                    }
                }
            }

            //Turma começa com null, pois vai preencher as turmas conforme a idade
            Turma turma = null;

            //Preenche que o curso
            for (Turma t : objControleMatricula.getListaTurma()) {
                if (t.getCurso().equals(curso) && t.getAno() == ano && t.getSemestre() == semestre) {
                    turma = t;//Preenche a turma vazia e coloca os alunos da turma 
                }
            }

            //Se a turma continuar vazia, não tem turmas
            if (turma == null) {
                JOptionPane.showMessageDialog(null, "Não há turma disponivel para esse aluno! Por favor crie uma!");
                return;
            }

            //Contador de quantas matriculas cada turma tem
            int matriculasTurma = 0;

            //Até verificar toda lista de matrícula, ela vai somando +1, para ter total de matrículas em cada turma
            for (Matricula matricula : matriculas) {
                if (matricula.getTurma().equals(turma)) {
                    matriculasTurma++;
                }
            }

            //Se a matricula for maior que a capacidade da turma, não deixará matricular nessa turma
            if (matriculasTurma >= turma.getCapacidade()) {
                JOptionPane.showMessageDialog(null, "Não há vagas disponiveis na turma " + turma.getCodigo());
                return;
            }

            //Renova a matricula
            Matricula matricula = new Matricula(verifica, turma);
            objControleMatricula.cadastraMatricula(matricula);//Chama a função para cadastrar
            JOptionPane.showMessageDialog(null, "Sucesso ao renovar matrícula!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao renovar matrícula!");
        }

        this.dispose(); //Fecha a janea
    }//GEN-LAST:event_botaorenovaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRenovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRenovar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaomatricularenovar1;
    private javax.swing.JButton botaorenova;
    private javax.swing.JLabel cpfalunorenovar;
    private javax.swing.JLabel cpfalunorenovar3;
    private javax.swing.JLabel cpfalunorenovar4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField pegaano;
    private javax.swing.JTextField pegacpf;
    private javax.swing.JTextField pegasemestre;
    // End of variables declaration//GEN-END:variables
}
