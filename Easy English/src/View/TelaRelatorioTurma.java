package View;

import Control.ControleMatricula;
import Model.Matricula;
import Model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaRelatorioTurma extends javax.swing.JFrame {
    ControleMatricula objControleMatricula;

    public TelaRelatorioTurma(ControleMatricula pCtr) {
        objControleMatricula = pCtr;
        initComponents();

        //Preenche o comboBox da Turma com base na classe Turma
        javax.swing.DefaultComboBoxModel comboModelTurma = (javax.swing.DefaultComboBoxModel) pegaturma.getModel();
        for (Turma turma : objControleMatricula.getListaTurma()) {
            comboModelTurma.addElement(turma);
        }

        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaRelatorioTurma() {
        initComponents();
    }

    //Design da tela relatorio turma
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        textocodigoturmarelatorio1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        textocodigoturmarelatorio = new javax.swing.JLabel();
        botaorelatorioturma = new javax.swing.JButton();
        geraturma = new javax.swing.JScrollPane();
        gerarelatorioturma = new javax.swing.JTextArea();
        pegaturma = new javax.swing.JComboBox<>();
        textocodigoturmarelatorio2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        textocodigoturmarelatorio1.setText("Turma:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Turma");

        jPanel1.setToolTipText("");

        textocodigoturmarelatorio.setText("Turma:");

        botaorelatorioturma.setText("Gerar Relatório");
        botaorelatorioturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaorelatorioturmaActionPerformed(evt);
            }
        });

        gerarelatorioturma.setColumns(20);
        gerarelatorioturma.setRows(5);
        geraturma.setViewportView(gerarelatorioturma);

        textocodigoturmarelatorio2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textocodigoturmarelatorio2.setText("Relatório da Turma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textocodigoturmarelatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pegaturma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(geraturma, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(textocodigoturmarelatorio2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(botaorelatorioturma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textocodigoturmarelatorio2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegaturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textocodigoturmarelatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaorelatorioturma)
                .addGap(14, 14, 14)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(geraturma, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Relatório de Turma");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão gerar relatorio turma
    private void botaorelatorioturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaorelatorioturmaActionPerformed
        // TODO add your handling code here:
        //Guarda o valor selecionado no comboBox da Turma
        Turma turma = (Turma) pegaturma.getSelectedItem();
        
        try {
            //Lista da matricula conforme a turma
            ArrayList<Matricula> matriculasTurma = new ArrayList<Matricula>();
            
            //Lista de todas as matriculas 
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();

            //Até verificar toda lista de matrícula, ela vai adicionando na lista as matriculas da turma desejada
            for (Matricula matricula : matriculas) {
                if (matricula.getTurma().equals(turma)) {
                    matriculasTurma.add(matricula);
                }
            }

            //Usa stringBuilder para emitir o relatorio no TextArea
            StringBuilder relatorio = new StringBuilder("");
            for (Matricula matricula : matriculasTurma) {//Até acabar o relatório dessas matrículas encontradas
                relatorio.append("Nome: ");
                relatorio.append(matricula.getAluno().getNome());
                relatorio.append("\nCPF: ");
                relatorio.append(matricula.getAluno().getCpf());
                relatorio.append("\nN1: ");
                //Se N1 for nula, coloca um -
                //Se não, coloca o valor dela
                relatorio.append(matricula.getN1() == 0.0 ? "-" : matricula.getN1());
                relatorio.append("\nN2: ");
                //Se N2 for nula, coloca um -
                //Se não, coloca o valor dela
                relatorio.append(matricula.getN2() == 0.0 ? "-" : matricula.getN2());

                //Se a N1 e N2 não forem nulas, calcula a media entre elas e coloca a situacao do aluno
                if ((matricula.getN2() != 0.0) && (matricula.getN1() != 0.0)) {
                    double media = ((matricula.getN1() + matricula.getN2()) / 2);
                    relatorio.append("\nMédia: ");
                    relatorio.append(media);
                    relatorio.append("\nSituação: ");
                    relatorio.append(media >= 6.0 ? "Aprovado" : "Reprovado");
                }

                relatorio.append("\n");
            }

            //Preenche o TextArea com a turma desejada
            gerarelatorioturma.setText(relatorio.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório da turma!");
        }
    }//GEN-LAST:event_botaorelatorioturmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorioTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaolancanota;
    private javax.swing.JButton botaolancanota1;
    private javax.swing.JButton botaolancanota2;
    private javax.swing.JButton botaolancanota3;
    private javax.swing.JButton botaorelatorioturma;
    private javax.swing.JTextArea gerarelatorioturma;
    private javax.swing.JScrollPane geraturma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> pegaturma;
    private javax.swing.JLabel textocodigoturmarelatorio;
    private javax.swing.JLabel textocodigoturmarelatorio1;
    private javax.swing.JLabel textocodigoturmarelatorio2;
    private javax.swing.JLabel textocodigoturmarelatorio3;
    private javax.swing.JLabel textocodigoturmarelatorio4;
    private javax.swing.JLabel textocodigoturmarelatorio5;
    private javax.swing.JLabel textocodigoturmarelatorio6;
    // End of variables declaration//GEN-END:variables
}
