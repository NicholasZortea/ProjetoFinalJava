
package View;

import Model.Estagiario;
import Model.Funcionario;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        desativaCaixaTexto();
        setEstagiario(false);
    }
    private String sexo;
    private Boolean estagiario;

    public Boolean getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(Boolean estagiario) {
        this.estagiario = estagiario;
    }
    
    public void desativaCaixaTexto(){
            bolsaTf.setText(null);
            horasTrabalhadasTf.setText(null);
            bolsaTf.setBackground(Color.gray);
            horasTrabalhadasTf.setBackground(Color.gray);
            bolsaTf.setEditable(false);
            horasTrabalhadasTf.setEditable(false);
    }
    
    public void ativaCaixaTexto(){
            bolsaTf.setEditable(true);
            horasTrabalhadasTf.setEditable(true);
            setEstagiario(true);
            bolsaTf.setText("Ex: 1");
            horasTrabalhadasTf.setText("Ex: 16");
            bolsaTf.setBackground(Color.white);
            horasTrabalhadasTf.setBackground(Color.white);
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBt = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nomeTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idadeTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alturaTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefoneTf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ruaTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bairroTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        registroTf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salarioTf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        masculinoBt = new javax.swing.JRadioButton();
        femininoBt = new javax.swing.JRadioButton();
        nInformarBt = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        estagiarioRbt = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bolsaTf = new javax.swing.JTextField();
        horasTrabalhadasTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cadastrar Funcionário");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Deletar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        nomeTf.setText("Ex: Gelis dionson");

        jLabel1.setText("Nome:");

        jLabel2.setText("idade:");

        idadeTf.setText("Ex: 99");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Altura em cm:");

        alturaTf.setText("Ex: 190");

        jLabel5.setText("Telefone:");

        telefoneTf.setText("Ex: (54) 99999-9999");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Endereço");

        jLabel7.setText("Rua:");

        ruaTf.setText("Ex: Jacarandá");

        jLabel8.setText("Bairro:");

        bairroTf.setText("Ex: Centro");
        bairroTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bairroTf)
                    .addComponent(ruaTf, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Registro:");

        registroTf.setText("Ex: 1");

        jLabel10.setText("Salário:");

        salarioTf.setText("Ex: 1700.00");

        GrupoBt.add(masculinoBt);
        masculinoBt.setText("Masculino");
        masculinoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoBtActionPerformed(evt);
            }
        });

        GrupoBt.add(femininoBt);
        femininoBt.setText("Feminino");
        femininoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femininoBtActionPerformed(evt);
            }
        });

        GrupoBt.add(nInformarBt);
        nInformarBt.setText("Prefiro não informar");
        nInformarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nInformarBtActionPerformed(evt);
            }
        });

        estagiarioRbt.setText("O funcionário é estágiario");
        estagiarioRbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estagiarioRbtActionPerformed(evt);
            }
        });

        jLabel11.setText("Bolsa:");

        jLabel12.setText("Horas trabalhadas:");

        horasTrabalhadasTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasTrabalhadasTfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idadeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estagiarioRbt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(femininoBt)
                    .addComponent(jLabel3)
                    .addComponent(masculinoBt))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nInformarBt)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(alturaTf)
                            .addComponent(registroTf, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(bolsaTf))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(horasTrabalhadasTf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salarioTf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idadeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estagiarioRbt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masculinoBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femininoBt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nInformarBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bolsaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horasTrabalhadasTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alturaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registroTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salarioTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int registro = Integer.parseInt(registroTf.getText());
        double salario = Double.parseDouble(salarioTf.getText());
        String nome = nomeTf.getText();
        int idade = Integer.parseInt(idadeTf.getText());
        String rua = ruaTf.getText();
        String bairro = bairroTf.getText();
        String SexoSelecionado = getSexo();
        int altura = Integer.parseInt(alturaTf.getText());
        String telefone = telefoneTf.getText();   

        
                if(getEstagiario() == true){
                    int bolsa = Integer.parseInt(bolsaTf.getText());
                    int horas_trabalho = Integer.parseInt(horasTrabalhadasTf.getText());
                    Estagiario e = new Estagiario(bolsa, horas_trabalho, registro, salario, nome, idade, rua, bairro, sexo, altura, telefone);
                    
                    FileWriter arq = null;
                    try {
                        arq = new FileWriter(e.getRegistro()+ ".dat");
                    }catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.print("Registro: " + e.getRegistro() + ";");
                    gravarArq.println();
                    gravarArq.print("Salário: " + e.getSalario() + ";");
                    gravarArq.println();
                    gravarArq.print("Nome: " + e.getNome() + ";");
                    gravarArq.println();
                    gravarArq.print("Idade: " + e.getIdade() + ";");
                    gravarArq.println();
                    gravarArq.print("Rua: " + e.getRua() + ";");
                    gravarArq.println();
                    gravarArq.print("Bairro: " + e.getBairro() + ";");
                    gravarArq.println();
                    gravarArq.print("Sexo: " + e.getSexo() + ";");
                    gravarArq.println();
                    gravarArq.print("Altura: " + e.getAltura() + " cm;");
                    gravarArq.println();
                    gravarArq.print("Registro: "+ e.getRegistro() + ";");
                    gravarArq.println();
                    gravarArq.print("Telefone: " + e.getTelefone() + ";");
                    gravarArq.println();
                    gravarArq.print("Bolsa: " + e.getBolsa() + ";");
                    gravarArq.println();
                    gravarArq.print("Horas Trabalhadas: " + e.getHoras_servico() + ";");

                    try {
                        arq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if (getEstagiario() == false){
                    Funcionario f = new Funcionario(registro, salario, nome, idade, rua, bairro, SexoSelecionado, altura, telefone);
                    FileWriter arq = null;
                    try {
                        arq = new FileWriter(f.getRegistro()+ ".dat");
                    } catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.print("Registro: " + f.getRegistro() + ";");
                    gravarArq.println();
                    gravarArq.print("Salário: " + f.getSalario() + ";");
                    gravarArq.println();
                    gravarArq.print("Nome: " + f.getNome() + ";");
                    gravarArq.println();
                    gravarArq.print("Idade: " + f.getIdade() + ";");
                    gravarArq.println();
                    gravarArq.print("Rua: " + f.getRua() + ";");
                    gravarArq.println();
                    gravarArq.print("Bairro: " + f.getBairro() + ";");
                    gravarArq.println();
                    gravarArq.print("Sexo: " + f.getSexo() + ";");
                    gravarArq.println();
                    gravarArq.print("Altura: " + f.getAltura() + " cm;");
                    gravarArq.println();
                    gravarArq.print("Registro: "+ f.getRegistro() + ";");
                    gravarArq.println();
                    gravarArq.print("Telefone: " + f.getTelefone() + ";");

                    try {
                        arq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bairroTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTfActionPerformed

    private void masculinoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoBtActionPerformed
        if (masculinoBt.isSelected()){
            setSexo("Masculino");
        }
    }//GEN-LAST:event_masculinoBtActionPerformed

    private void femininoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femininoBtActionPerformed
       if(femininoBt.isSelected()){
           setSexo("Feminino");
       }
    }//GEN-LAST:event_femininoBtActionPerformed

    private void nInformarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nInformarBtActionPerformed
        if(nInformarBt.isSelected()){
            setSexo("Prefere não informar");
        }
    }//GEN-LAST:event_nInformarBtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Arquivo = registroTf.getText() + ".dat";
        File file = new File(Arquivo);
        file.delete();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void estagiarioRbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estagiarioRbtActionPerformed
        if (estagiarioRbt.isSelected()){
            setEstagiario(true);
            ativaCaixaTexto();
        }
        else if (estagiarioRbt.isSelected() == false)
        {
            setEstagiario(false);
            desativaCaixaTexto();
        }
         
    }//GEN-LAST:event_estagiarioRbtActionPerformed

    private void horasTrabalhadasTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasTrabalhadasTfActionPerformed
        
    }//GEN-LAST:event_horasTrabalhadasTfActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBt;
    private javax.swing.JTextField alturaTf;
    private javax.swing.JTextField bairroTf;
    private javax.swing.JTextField bolsaTf;
    private javax.swing.JCheckBox estagiarioRbt;
    private javax.swing.JRadioButton femininoBt;
    private javax.swing.JTextField horasTrabalhadasTf;
    private javax.swing.JTextField idadeTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton masculinoBt;
    private javax.swing.JRadioButton nInformarBt;
    private javax.swing.JTextField nomeTf;
    private javax.swing.JTextField registroTf;
    private javax.swing.JTextField ruaTf;
    private javax.swing.JTextField salarioTf;
    private javax.swing.JTextField telefoneTf;
    // End of variables declaration//GEN-END:variables
}
