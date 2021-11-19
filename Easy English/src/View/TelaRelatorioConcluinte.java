package View;

import Control.ControleMatricula;
import Model.Curso;
import Model.Matricula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaRelatorioConcluinte extends javax.swing.JFrame {

    ControleMatricula objControleMatricula;

    public TelaRelatorioConcluinte(ControleMatricula pCtr) {
        objControleMatricula = pCtr;
        initComponents();
        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaRelatorioConcluinte() {
        initComponents();
    }

    //Design da tela relatorio concluinte
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textorelatorioturmakids = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textorelatorioturmaregular = new javax.swing.JLabel();
        gerarelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        geraturmaregular = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        geraturmakids = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de alunos concluintes");

        textorelatorioturmakids.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textorelatorioturmakids.setText("Relatório Turma Kids");

        textorelatorioturmaregular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textorelatorioturmaregular.setText("Relatório Turma Regular");

        gerarelatorio.setText("Gerar Relatório");
        gerarelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarelatorioActionPerformed(evt);
            }
        });

        geraturmaregular.setColumns(20);
        geraturmaregular.setRows(5);
        jScrollPane1.setViewportView(geraturmaregular);

        geraturmakids.setColumns(20);
        geraturmakids.setRows(5);
        jScrollPane2.setViewportView(geraturmakids);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(gerarelatorio)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textorelatorioturmaregular)
                        .addGap(161, 161, 161))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(textorelatorioturmakids))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textorelatorioturmakids)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textorelatorioturmaregular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gerarelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão Emitir relatório
    private void gerarelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarelatorioActionPerformed
        // TODO add your handling code here:
        try {
            //Lista da matricula do curso Kids
            ArrayList<Matricula> matriculasKids = new ArrayList<Matricula>();
            
            //Lista da matricula do curso Regular
            ArrayList<Matricula> matriculasRegular = new ArrayList<Matricula>();
            
            //Lista de todas as matriculas
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();

             //Até verificar toda lista de matrícula, ela vai adicionando na lista Kids os alunos Kids
            for (Matricula matricula : matriculas) {
                if (matricula.getTurma().getCurso().equals(Curso.K6)) {
                    matriculasKids.add(matricula);
                }
            }
            
            //Se a matricula kids estiver vazia, não tem alunos kids
            if (matriculasKids.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há alunos concluintes do curso kids!");
            }

            //Usa stringBuilder para emitir o histórico no TextArea do relatório
            StringBuilder relatorioKids = new StringBuilder("");
            for (Matricula matricula : matriculasKids) {//Até acabar o relatório dessa matrícula encontrada (matriculaKids)
                relatorioKids.append("Nome: ");
                relatorioKids.append(matricula.getAluno().getNome());
                relatorioKids.append("\nCPF: ");
                relatorioKids.append(matricula.getAluno().getCpf());
                relatorioKids.append("\n");
            }

            //Preenche o TextArea com a turma kids
            geraturmakids.setText(relatorioKids.toString());
            
            //Até verificar toda lista de matrícula, ela vai adicionando na lista regular os alunos regulares
            for (Matricula matricula : matriculas) {//Verifica se o curso é R8
                if (matricula.getTurma().getCurso().equals(Curso.R8)) {
                    matriculasRegular.add(matricula);
                }
            }
            
            //Se a matricula regular estiver vazia, não tem alunos regular
            if (matriculasRegular.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há alunos concluintes do curso regular!");
            }

            //Usa stringBuilder para emitir o histórico no TextArea do relatório
            StringBuilder relatorioRegular = new StringBuilder("");
            for (Matricula matricula : matriculasRegular) {//Até acabar o relatório dessa matrícula encontrada (matriculaRegular)
                relatorioRegular.append("Nome: ");
                relatorioRegular.append(matricula.getAluno().getNome());
                relatorioRegular.append("\nCPF: ");
                relatorioRegular.append(matricula.getAluno().getCpf());
                relatorioRegular.append("\n");
            }

            //Preenche o TextArea com a turma regular
            geraturmaregular.setText(relatorioRegular.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar os relatorios dos alunos concluintes!");
        }
    }//GEN-LAST:event_gerarelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorioConcluinte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioConcluinte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioConcluinte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioConcluinte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioConcluinte().setVisible(true);
            }
        });
    }
    
    //Variaveis da tela relatorio concluinte
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gerarelatorio;
    private javax.swing.JTextArea geraturmakids;
    private javax.swing.JTextArea geraturmaregular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel textorelatorioturmakids;
    private javax.swing.JLabel textorelatorioturmaregular;
    // End of variables declaration//GEN-END:variables
}
