package View;

import Control.ControleProfessor;
import Model.Ministracao;
import Model.Professor;
import Model.TipoCurso;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaProfessor extends javax.swing.JFrame {

    ControleProfessor objControleProfessor;

    public TelaProfessor(ControleProfessor pCtr) {
        objControleProfessor = pCtr;
        
        initComponents();
        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaProfessor() {
        initComponents();
    }

    //Design da tela professor
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotulonomeprofesor = new javax.swing.JLabel();
        peganomeprofessor = new javax.swing.JTextField();
        rotulocpfprofessor = new javax.swing.JLabel();
        pegacpfprofessor = new javax.swing.JTextField();
        rotulocursoprofessor = new javax.swing.JLabel();
        botaocadastraprofesor = new javax.swing.JButton();
        pegacursokidsprofessor = new javax.swing.JCheckBox();
        pegacursoregularprofessor = new javax.swing.JCheckBox();
        rotulonomeprofesor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Professor");

        rotulonomeprofesor.setText("Nome:");

        rotulocpfprofessor.setText("CPF:");

        rotulocursoprofessor.setText("Curso:");

        botaocadastraprofesor.setText("Cadastrar");
        botaocadastraprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastraprofesorActionPerformed(evt);
            }
        });

        pegacursokidsprofessor.setText("Kids");
        pegacursokidsprofessor.setName(""); // NOI18N

        pegacursoregularprofessor.setText("Regular");

        rotulonomeprofesor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rotulonomeprofesor1.setText("Cadastrar Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(rotulonomeprofesor1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaocadastraprofesor)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotulocpfprofessor)
                                    .addComponent(rotulonomeprofesor)
                                    .addComponent(rotulocursoprofessor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pegacursokidsprofessor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pegacursoregularprofessor))
                                    .addComponent(pegacpfprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peganomeprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rotulonomeprofesor1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peganomeprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotulonomeprofesor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegacpfprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotulocpfprofessor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pegacursokidsprofessor)
                        .addComponent(pegacursoregularprofessor))
                    .addComponent(rotulocursoprofessor))
                .addGap(31, 31, 31)
                .addComponent(botaocadastraprofesor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão Cadastrar professor
    private void botaocadastraprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastraprofesorActionPerformed
        //Atribui os valores conforme as caixas de texto
        String nome = peganomeprofessor.getText();
        String cpf = pegacpfprofessor.getText();

        Professor professor = null;

        for (Professor p : objControleProfessor.getListaProfessor()) {
            //Verifica se o professor já está cadastrado
            if (p.getNome().equals(nome) && p.getCpf().equals(cpf)) {
                JOptionPane.showMessageDialog(null, "Profesor já cadastrado!");
                return;
            }
        }
        professor = new Professor(nome, cpf);
        //Lista da ministracao
        ArrayList<Ministracao> ministracoes = new ArrayList<Ministracao>();

        //Se esse campo for selecionado, o professor ministrará o curso kids
        if (pegacursokidsprofessor.isSelected()) {
            ministracoes.add(new Ministracao(TipoCurso.KIDS, professor));
        }

        //Se esse campo for selecionado, o professor ministrará o curso regular
        if (pegacursoregularprofessor.isSelected()) {
            ministracoes.add(new Ministracao(TipoCurso.REGULAR, professor));
        }

        //Cadastra o professor com as suas ministracoes
        professor.setMinistracoes(ministracoes);

        try {
            objControleProfessor.cadastraProfessor(professor);//Chama a função para cadastrar
            JOptionPane.showMessageDialog(null, "Sucesso ao cadastrar profesor!"); 
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar profesor!");
        }
        this.dispose();  //Fecha a janela
    }//GEN-LAST:event_botaocadastraprofesorActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocadastraprofesor;
    private javax.swing.JTextField pegacpfprofessor;
    private javax.swing.JCheckBox pegacursokidsprofessor;
    private javax.swing.JCheckBox pegacursoregularprofessor;
    private javax.swing.JTextField peganomeprofessor;
    private javax.swing.JLabel rotulocpfprofessor;
    private javax.swing.JLabel rotulocursoprofessor;
    private javax.swing.JLabel rotulonomeprofesor;
    private javax.swing.JLabel rotulonomeprofesor1;
    // End of variables declaration//GEN-END:variables
}
