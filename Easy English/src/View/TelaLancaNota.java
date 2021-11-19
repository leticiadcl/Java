package View;

import Control.ControleMatricula;
import Model.Aluno;
import Model.Matricula;
import Model.Turma;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaLancaNota extends javax.swing.JFrame {

    ControleMatricula objControleMatricula;

    public TelaLancaNota(ControleMatricula pCtr) {
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
    public TelaLancaNota() {
        initComponents();
    }

    //Design da tela lança notas
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textocodigoturmarelatorio = new javax.swing.JLabel();
        botaolancanota = new javax.swing.JButton();
        pegaturma = new javax.swing.JComboBox<>();
        textocodigoturmarelatorio3 = new javax.swing.JLabel();
        pegaaluno = new javax.swing.JComboBox<>();
        textocodigoturmarelatorio4 = new javax.swing.JLabel();
        pegan1 = new javax.swing.JTextField();
        pegan2 = new javax.swing.JTextField();
        textocodigoturmarelatorio1 = new javax.swing.JLabel();
        botaocancela = new javax.swing.JButton();
        textocodigoturmarelatorio2 = new javax.swing.JLabel();
        botaosalva = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Relatório de Turma");

        jPanel1.setToolTipText("");

        textocodigoturmarelatorio.setText("Turma:");

        botaolancanota.setText("Lançar Nota");
        botaolancanota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolancanotaActionPerformed(evt);
            }
        });

        textocodigoturmarelatorio3.setText("Nome do Aluno:");

        pegaaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegaalunoActionPerformed(evt);
            }
        });

        textocodigoturmarelatorio4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textocodigoturmarelatorio4.setText("Lançar Notas");

        textocodigoturmarelatorio1.setText("N1:");

        botaocancela.setText("Cancelar");
        botaocancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelaActionPerformed(evt);
            }
        });

        textocodigoturmarelatorio2.setText("N2:");

        botaosalva.setText("Salvar");
        botaosalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(textocodigoturmarelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pegaturma, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textocodigoturmarelatorio2)
                    .addComponent(textocodigoturmarelatorio3)
                    .addComponent(textocodigoturmarelatorio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaosalva)
                        .addGap(133, 133, 133)
                        .addComponent(botaocancela)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pegaaluno, 0, 200, Short.MAX_VALUE)
                            .addComponent(pegan1)
                            .addComponent(pegan2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaolancanota)
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textocodigoturmarelatorio4)
                .addGap(171, 171, 171))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(textocodigoturmarelatorio4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegaturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textocodigoturmarelatorio))
                .addGap(18, 18, 18)
                .addComponent(botaolancanota)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textocodigoturmarelatorio3)
                    .addComponent(pegaaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textocodigoturmarelatorio1)
                    .addComponent(pegan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textocodigoturmarelatorio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaocancela)
                    .addComponent(botaosalva))
                .addContainerGap())
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
                .addGap(0, 84, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Relatório de Turma");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão Lança Notas
    private void botaolancanotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolancanotaActionPerformed
        // TODO add your handling code here:
        //Guarda o valor selecionado no comboBox da Turma
        Turma turma = (Turma) pegaturma.getSelectedItem();

        try {
            //Lista da matricula para selecionar a matrícula/aluno buscada 
            ArrayList<Matricula> matriculasTurma = new ArrayList<Matricula>();
            
            //Lista de todas as matrículas/alunos
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();

            //Até verificar toda lista de matrícula, ela adiciona na lista de busca, a matrícula encontrada (matriculaTurma)
            for (Matricula matricula : matriculas) {
                if (matricula.getTurma().equals(turma)) {
                    matriculasTurma.add(matricula);
                }
            }

            //Preenche o comboBox do nome do aluno com base na matrícula encontrada (matriculaTurma)
            javax.swing.DefaultComboBoxModel comboModelAluno = (javax.swing.DefaultComboBoxModel) pegaaluno.getModel();
            for (Matricula m : matriculasTurma) {
                comboModelAluno.addElement(m.getAluno());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar a turma!");
        }
    }//GEN-LAST:event_botaolancanotaActionPerformed

    //Botão Salvar
    private void botaosalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosalvaActionPerformed
        // TODO add your handling code here:
        //Guarda os valores selecionados no comboBox
        Turma turma = (Turma) pegaturma.getSelectedItem();
        Aluno aluno = (Aluno) pegaaluno.getSelectedItem();
        
        //Pega os valores da N1/N2 se não forem nulos ou tiverem com espaço
        double n1 = (pegan1.getText() != null && pegan1.getText().length() > 0) ? Double.parseDouble(pegan1.getText()) : null;
        double n2 = (pegan2.getText() != null && pegan2.getText().length() > 0) ? Double.parseDouble(pegan2.getText()) : null;

        try {
            //Lista de todas as matrículas/alunos
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();
            
            //Até verificar toda lista de matrícula, ela adiciona as notas que estão na caixa de texto para atualizar a matrícula
            for (Matricula matricula : matriculas) {
                //Tem que ser a mesma turma seleciona e a mesma matricula/aluno selecionado
                if (matricula.getTurma().equals(turma) && matricula.getAluno().equals(aluno)) {
                    matricula.setN1(n1);
                    matricula.setN2(n2);
                }
            }
            objControleMatricula.salvaMatriculas();//Chama a função que atualiza a matrícula/notas
            JOptionPane.showMessageDialog(null, "Sucesso ao salvar as notas!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar as notas!");
        }

        this.dispose();//Fecha a janela
    }//GEN-LAST:event_botaosalvaActionPerformed

    //Botão Cancelar
    private void botaocancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelaActionPerformed
        // TODO add your handling code here:
        this.dispose(); //Fecha a janela
    }//GEN-LAST:event_botaocancelaActionPerformed

    //Ação para atualizar as notas conforme seleciona o aluno
    private void pegaalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegaalunoActionPerformed
        // TODO add your handling code here:
        //Fixa os itens desejados
        Turma turma = (Turma) pegaturma.getSelectedItem();
        Aluno aluno = (Aluno) pegaaluno.getSelectedItem();
        
        //Lista de matricula
        ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();
        
        //Até verificar toda lista de matrícula, ela atualiza a caixa de texto da N1/N2 com as notas já cadastradas
        for (Matricula matricula : matriculas) {
            //Tem que ser a mesma turma seleciona e a mesma matricula/aluno selecionado
            if (matricula.getTurma().equals(turma) && matricula.getAluno().equals(aluno)) {
                //Se não tiver nenhuma nota cadastrada, ele só coloca espaço na caixa de texto
                pegan1.setText(matricula.getN1() != 0.0 ? String.valueOf(matricula.getN1()) : "");
                pegan2.setText(matricula.getN2() != 0.0 ? String.valueOf(matricula.getN2()) : "");
            }
        }
    }//GEN-LAST:event_pegaalunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLancaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLancaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLancaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLancaNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLancaNota().setVisible(true);
            }
        });
    }

    //Variaveis da tela lança notas
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocancela;
    private javax.swing.JButton botaolancanota;
    private javax.swing.JButton botaosalva;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> pegaaluno;
    private javax.swing.JTextField pegan1;
    private javax.swing.JTextField pegan2;
    private javax.swing.JComboBox<String> pegaturma;
    private javax.swing.JLabel textocodigoturmarelatorio;
    private javax.swing.JLabel textocodigoturmarelatorio1;
    private javax.swing.JLabel textocodigoturmarelatorio2;
    private javax.swing.JLabel textocodigoturmarelatorio3;
    private javax.swing.JLabel textocodigoturmarelatorio4;
    // End of variables declaration//GEN-END:variables
}
