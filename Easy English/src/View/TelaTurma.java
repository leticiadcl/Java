package View;

import Control.ControleTurma;
import Model.Curso;
import Model.Ministracao;
import Model.Professor;
import Model.Turma;
import javax.swing.JOptionPane;

public class TelaTurma extends javax.swing.JFrame {

    ControleTurma objControleTurma;

    public TelaTurma(ControleTurma pCtr) {
        objControleTurma = pCtr;
        initComponents();

        //Preenche o comboBox do Curso com base na classe Curso
        javax.swing.DefaultComboBoxModel comboModelCurso = (javax.swing.DefaultComboBoxModel) pegacursoturma.getModel();
        for (Curso curso : objControleTurma.getListaCurso()) {
            comboModelCurso.addElement(curso);
        }

        //Preenche o comboBox do Professor com base na classe Professor
        javax.swing.DefaultComboBoxModel comboModelProfessor = (javax.swing.DefaultComboBoxModel) pegarprofessor.getModel();
        for (Professor prof : objControleTurma.getListaProfessor()) {
            comboModelProfessor.addElement(prof);
        }

        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaTurma() {
        initComponents();
    }

    //Design da tela turma
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pegasemestreturma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pegaanoturma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pegacapacidadeturma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pegahorarioturma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pegacursoturma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        botaoCriar = new javax.swing.JButton();
        pegarprofessor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Turma");

        jLabel2.setText("Semestre:");

        pegasemestreturma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel3.setText("Ano:");

        jLabel4.setText("Capacidade:");

        jLabel5.setText("Horário:");

        jLabel6.setText("Curso:");

        jLabel8.setText("Professor:");

        botaoCriar.setText("Cadastrar");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cadastrar Turma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoCriar)
                            .addComponent(pegahorarioturma, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(pegacapacidadeturma)
                            .addComponent(pegaanoturma)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pegacursoturma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pegasemestreturma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pegarprofessor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel7)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegaanoturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegacapacidadeturma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegahorarioturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegarprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegasemestreturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegacursoturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(botaoCriar)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão Cadastrar turma
    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        // TODO add your handling code here:     
        //Atribui os valores conforme as caixas de texto
        int capacidade = Integer.parseInt(pegacapacidadeturma.getText());
        String horario = pegahorarioturma.getText();
        int ano = Integer.parseInt(pegaanoturma.getText());
        
        //Guarda os valores selecionados nos comboBox Curso/Professor/Semestre
        Curso curso = (Curso) pegacursoturma.getSelectedItem();
        Professor professor = (Professor) pegarprofessor.getSelectedItem();
        int semestre = Integer.parseInt((String) pegasemestreturma.getSelectedItem());
        
        //Coloca no formato desejado do código da turma
        String codigo = horario + curso.toString();

        //Usa a variável boolean para saber se o professor pode ou não dar determinado curso
        boolean professorMinistra = false;
        
        //Até verificar toda ministracao (quais cursos cada professor pode dar)
        //Verifica se o curso da ministracao é igual o curso que deseja abrir turma
        //Se sim, coloca o professor como professor desse curso, já que ele ministra
        for (Ministracao ministracao : professor.getMinistracoes()) {
            if (ministracao.getTipoCurso().equals(curso.getTipoCurso())) {
                professorMinistra = true;
            }
        }

        //Se a variavel continuar falsa, não pode ministrar esse determinado curso
        if (professorMinistra == false) {
            JOptionPane.showMessageDialog(null, "Professor não ministra esse tipo de curso!");
            return;
        }

        try {
            //Cadastra a turma conforme o codigo desejado + semestre + ano + capacidade +
            // horario + curso + professor que pode dar o curso
            Turma turma = new Turma(codigo, semestre, ano, capacidade, horario, curso, professor);
            objControleTurma.cadastraTurma(turma);//Chama a função para cadastrar
            JOptionPane.showMessageDialog(null, "Sucesso ao cadastrar turma!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar turma!");
        }

        this.dispose(); //Fecha a janela
    }//GEN-LAST:event_botaoCriarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTurma().setVisible(true);
            }
        });
    }

    //Variaveis da tela turma
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pegaanoturma;
    private javax.swing.JTextField pegacapacidadeturma;
    private javax.swing.JComboBox<String> pegacursoturma;
    private javax.swing.JTextField pegahorarioturma;
    private javax.swing.JComboBox<String> pegarprofessor;
    private javax.swing.JComboBox<String> pegasemestreturma;
    // End of variables declaration//GEN-END:variables
}
