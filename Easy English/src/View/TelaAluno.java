package View;

import Control.ControleAluno;
import Control.ControleMatricula;
import Control.ControleTurma;
import Model.Aluno;
import Model.Curso;
import Model.Matricula;
import Model.Turma;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaAluno extends javax.swing.JFrame {

    ControleAluno objControleAluno;
    ControleTurma objControleTurma;
    ControleMatricula objControleMatricula;

    public TelaAluno(ControleAluno pCtr) {
        objControleAluno = pCtr;
        objControleTurma = objControleAluno.objControlePrincipal.objControleTurma;
        objControleMatricula = objControleAluno.objControlePrincipal.objControleMatricula;
        initComponents();
        this.setVisible(true);
    }

    //Começa com os componentes da tela
    public TelaAluno() {
        initComponents();
    }

    //Design da tela Aluno
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtData1 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        pegadiamat = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        peganome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        pegacpf = new javax.swing.JTextField();
        rotuloalertamenor = new javax.swing.JLabel();
        lblNomeR = new javax.swing.JLabel();
        lblCpfR = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        rotuloalertamenor1 = new javax.swing.JLabel();
        rotuloalertamenor2 = new javax.swing.JLabel();
        pegaemail = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        peganomeresponsavel = new javax.swing.JTextField();
        pegacpfresponsavel = new javax.swing.JTextField();
        lblSemestre = new javax.swing.JLabel();
        pegadatanasc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pegaano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Aluno");

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        lblEmail.setText("E-mail:");

        rotuloalertamenor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotuloalertamenor.setText("Prencha os campos abaixo SOMENTE  se o estudante for menor de idade.");

        lblNomeR.setText("Nome:");

        lblCpfR.setText("CPF:");

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        rotuloalertamenor1.setText("Dados do Responsável");

        rotuloalertamenor2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rotuloalertamenor2.setText("Cadastrar Aluno");

        lblData.setText("Data de Nascimento:");

        lblSemestre.setText("Data de matrícula:");

        jLabel1.setText("Ano:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpfR)
                            .addComponent(lblNomeR))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pegacpfresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peganomeresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCadastrar)))
                    .addComponent(rotuloalertamenor)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(rotuloalertamenor1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSemestre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(peganome)
                                .addComponent(pegacpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pegaemail)
                                .addComponent(pegadatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pegadiamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(rotuloalertamenor2))
                .addGap(168, 168, 168))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pegaano, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloalertamenor2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peganome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pegacpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pegaemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pegadatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pegadiamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSemestre)))
                    .addComponent(lblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pegaano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(rotuloalertamenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotuloalertamenor1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeR)
                    .addComponent(peganomeresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfR)
                    .addComponent(pegacpfresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCadastrar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botao Cadastrar
    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        //Atribui os valores nas caixas de textos 
        String nome = peganome.getText();
        String cpf = pegacpf.getText();
        String email = pegaemail.getText();
        String dataDeNascimento = pegadatanasc.getText();
        String diaMatricula = pegadiamat.getText();
        String nomeResponsavel = peganomeresponsavel.getText();
        String cpfResponsavel = pegacpfresponsavel.getText();
        int ano = Integer.parseInt(pegaano.getText());

        try{
            //Usa a biblioteca Date para fazer a comparacao e saber a idade do aluno
            //a variavel nascimento é a data do nascimento do aluno
            Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeNascimento);
            //a variavel dia é o dia da matricula
            Date dia = new SimpleDateFormat("dd/MM/yyyy").parse(diaMatricula);

            //Essa instant1 é a variavel que guarda o today (variavel que armazena o formato correto
            // da data de hoje
            Instant instant1 = Instant.ofEpochMilli(dia.getTime());
            LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
            LocalDate localDate1 = localDateTime1.toLocalDate();

            //Essa instant2 é a variavel que guarda o dt (variavel que armazena o formato correto
            // da caixa de data de nascimento
            Instant instant2 = Instant.ofEpochMilli(nascimento.getTime());
            LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant2, ZoneId.systemDefault());
            LocalDate localDate2 = localDateTime2.toLocalDate();

            //A variavel anos mostra a idade do aluno
            long anos = ChronoUnit.YEARS.between(localDate2, localDate1);
                      
            //Verifica se a idade é menor que 18 e se o nome/CPF do responsavel estão vazios.
            if (anos < 18 && (nomeResponsavel == null || nomeResponsavel.trim().length() == 0 || cpfResponsavel == null || cpfResponsavel.trim().length() == 0)) {
                JOptionPane.showMessageDialog(null, "Dados do responsável não estão preenchidos!");
                return;
            }

            //Cadastra o aluno (nome + cpf + nascimento (formato certo da data de nascimento) + nomeR + CPFR)
            Aluno aluno = new Aluno(nome, cpf, email, nascimento, nomeResponsavel, cpfResponsavel);
            objControleAluno.cadastraAluno(aluno); //Chama a função cadastrar do aluno

            //System.out.prin;
            //Turma começa com null, pois vai preencher as turmas conforme a idade
            Turma turmaA = null;

            //Se os alunos tiverem a idade menor que 12 anos e verifica se a turma selecionada é K1
            if (anos <= 12) {
                for (Turma t : objControleTurma.getListaTurma()) {//Preenche que o curso como R1 (regular 1), semestre e ano atuais
                    if (t.getCurso().equals(Curso.K1) && t.getAno() == ano) {
                        turmaA = t;
                    }  
                }
            }
            else{
                for (Turma t : objControleTurma.getListaTurma()) {//Preenche que o curso como R1 (regular 1), semestre e ano atuais
                    if (t.getCurso().equals(Curso.R1) && t.getAno() == ano) {
                        turmaA = t;//Preenche a turma vazia e coloca os alunos da turma Regular 1
                    }
                }
            }

            //Se a turma continuar vazia, não tem turmas K1 e R1 (iniciais) disponíveis
            if (turmaA == null) {
                JOptionPane.showMessageDialog(null, "Não há turma disponível para esse aluno! Por favor crie uma!");
                return;
            }

            //Lista da matricula para controlar a quantidade de matrícula na turma
            ArrayList<Matricula> matriculas = objControleMatricula.getListaMatricula();
            int matriculasTurma = 0; //Contador de quantas matriculas cada turma tem

            //Até verificar toda lista de matrícula, ela vai somando +1, para ter total de matrículas em cada turma
            for (Matricula matricula : matriculas) {
                if (matricula.getTurma().equals(turmaA)) {
                    matriculasTurma++;
                }
            }

            //Se a matricula for maior que a capacidade da turma, não deixará matricular nessa turma
            if (matriculasTurma >= turmaA.getCapacidade()) {
                JOptionPane.showMessageDialog(null, "Não há vagas disponíveis na turma " + turmaA.getCodigo());
                return;
            }
            
            //Cadastra a matrícula (id alunos + id turma)
            Matricula matricula = new Matricula(aluno, turmaA);
            objControleMatricula.cadastraMatricula(matricula);//Chama a função cadastrar a matrícula de cada aluno
            JOptionPane.showMessageDialog(null, "Sucesso ao cadastrar aluno!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno!");
        }

        this.dispose();//Fecha a janela
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    //Variaveis da tela aluno
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblCpfR;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeR;
    private javax.swing.JLabel lblSemestre;
    private javax.swing.JTextField pegaano;
    private javax.swing.JTextField pegacpf;
    private javax.swing.JTextField pegacpfresponsavel;
    private javax.swing.JTextField pegadatanasc;
    private javax.swing.JTextField pegadiamat;
    private javax.swing.JTextField pegaemail;
    private javax.swing.JTextField peganome;
    private javax.swing.JTextField peganomeresponsavel;
    private javax.swing.JLabel rotuloalertamenor;
    private javax.swing.JLabel rotuloalertamenor1;
    private javax.swing.JLabel rotuloalertamenor2;
    private javax.swing.JTextField txtData1;
    // End of variables declaration//GEN-END:variables
}
