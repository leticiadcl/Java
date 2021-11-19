
package View;

import Control.ControlePrincipal;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private ControlePrincipal objControlePrincipal;
    
    public TelaPrincipal(ControlePrincipal pCtr) {
        objControlePrincipal = pCtr;
        initComponents();
    }

    public TelaPrincipal() {
        initComponents();
    }

    //Design da tela principal
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuprincipal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Menu Principal");

        menuprincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cadastrar Professor", "Cadastrar Turma", "Cadastrar Aluno", "Lançar Nota", "Renovar Matrícula", "Emitir Historico", "Emitir Relatório de Turma", "Emitir Relatório de Concluintes" }));
        menuprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuprincipalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/888294014.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(menuprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(menuprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        objControlePrincipal.finalize();
        this.dispose();
    } 
 
    //Opcoes de Menu
    private void menuprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuprincipalActionPerformed
         String opcao =menuprincipal.getSelectedItem().toString();
        switch(opcao){
            case "Cadastrar Professor":  
                objControlePrincipal.janelaProfessor();
                break;
            case "Cadastrar Turma":
                objControlePrincipal.janelaTurma();
                break;
            case  "Cadastrar Aluno":
                objControlePrincipal.janelaAluno();
                break;
            case "Renovar Matrícula":  
                objControlePrincipal.janelaRenovar();
                break;
            
            case "Lançar Nota":
                objControlePrincipal.janelaLancaNota();
                break;
            case "Emitir Historico":
               objControlePrincipal.janelaHistorico();
                break;
            case "Emitir Relatório de Turma":
                objControlePrincipal.janelaRelatorioTurma();
                break;
            case "Emitir Relatório de Concluintes":
                objControlePrincipal.janelaRelatorioConcluinte();
                break;
    }//GEN-LAST:event_menuprincipalActionPerformed
    
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    //Variavel menu
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> menuprincipal;
    // End of variables declaration//GEN-END:variables
}
