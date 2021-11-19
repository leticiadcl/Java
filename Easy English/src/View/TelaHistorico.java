package View;

import Control.ControleMatricula;
import Model.Aluno;
import Model.Matricula;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaHistorico extends javax.swing.JFrame {

    ControleMatricula objControleMatricula;

    public TelaHistorico(ControleMatricula pCtr) {
        objControleMatricula = pCtr;
        this.setVisible(true);
        initComponents();
    }

    //Começa com os componentes da tela
    public TelaHistorico() {
        initComponents();
    }

    //Design da tela historico
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numeroCPF = new javax.swing.JLabel();
        pegacpfhistorico = new javax.swing.JTextField();
        geraHistorico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixadetextoexibehistorico = new javax.swing.JTextArea();
        numeroCPF1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Emitir Histórico");

        jPanel1.setToolTipText("");

        numeroCPF.setText("CPF:");

        geraHistorico.setText("Emitir");
        geraHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geraHistoricoActionPerformed(evt);
            }
        });

        caixadetextoexibehistorico.setColumns(20);
        caixadetextoexibehistorico.setRows(5);
        jScrollPane1.setViewportView(caixadetextoexibehistorico);

        numeroCPF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numeroCPF1.setText("Emitir Histórico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numeroCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pegacpfhistorico)
                                .addGap(18, 18, 18)
                                .addComponent(geraHistorico))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(numeroCPF1)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroCPF1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegacpfhistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCPF)
                    .addComponent(geraHistorico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pegacpfhistorico.getAccessibleContext().setAccessibleName("Captura CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Painel Emitir Histórico");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botao Emitir Histórico
    private void geraHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geraHistoricoActionPerformed
        // TODO add your handling code here:
        //Atribui o valor CPF do aluno na caixa de texto
        String cpf = pegacpfhistorico.getText();

        try {
            //Aluno começa com null, pois vai preencher o aluno desejado
            Aluno aluno = null;
            
            //Verifica em cada aluno, se o cpf é igual o cpf buscado
            for (Aluno a : objControleMatricula.getListaAluno()) {
                if (a.getCpf().equals(cpf)) {//A variável 'a' significa todos os alunos
                    aluno = a; //Iguala o aluno buscado em aluno achado por a
                }
            }

            //Se o aluno continuar nulo, não existe esse aluno
            if (aluno == null) {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
                return;
            }

            //Lista da matricula para selecionar a matrícula/aluno buscada 
            ArrayList<Matricula> matriculasAluno = new ArrayList<Matricula>();
            
            //Lista de todas as matrículas/alunos
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();
            
            //Até verificar toda lista de matrícula, ela adiciona na lista de busca, a matrícula encontrada (matriculaAluno)
            for (Matricula matricula : matriculas) {
                if (matricula.getAluno().equals(aluno)) {
                    matriculasAluno.add(matricula);
                }
            }

            //Usa stringBuilder para emitir o histórico no TextArea do histórico
            StringBuilder relatorio = new StringBuilder("");
            for (Matricula matricula : matriculasAluno) {//Até acabar o histórico dessa matrícula encontrada (matriculaAluno)
                relatorio.append("\n");
                relatorio.append(matricula.getTurma().getAno());
                relatorio.append("/");
                relatorio.append(matricula.getTurma().getSemestre());
                relatorio.append("\nCurso: ");
                relatorio.append(matricula.getTurma().getCurso().toString());
                relatorio.append("/");
                relatorio.append(matricula.getTurma().getSemestre());
                relatorio.append("\nN1: ");
                //Se a n1 for nula, coloca um - 
                //Se não, preenche com o valor
                relatorio.append(matricula.getN1() == 0.0 ? "-" : matricula.getN1());
                relatorio.append("\nN2: ");
                //Se a n2 for nula, coloca um - 
                //Se não, preenche com o valor
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

            //Preenche o TextArea do histórico
            caixadetextoexibehistorico.setText(relatorio.toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encontrar aluno!");
        }

    }//GEN-LAST:event_geraHistoricoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHistorico().setVisible(true);
            }
        });
    }

    //Variaveis da tela histórico
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea caixadetextoexibehistorico;
    private javax.swing.JButton geraHistorico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel numeroCPF;
    private javax.swing.JLabel numeroCPF1;
    private javax.swing.JTextField pegacpfhistorico;
    // End of variables declaration//GEN-END:variables
}
