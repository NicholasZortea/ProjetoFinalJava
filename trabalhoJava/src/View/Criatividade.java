/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ConsultaPreferencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;





public class Criatividade extends javax.swing.JFrame {

    /**
     * Creates new form Criatividade
     */
    public Criatividade() {
        initComponents();
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        marcaSorveteCb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoSorveteCb = new javax.swing.JComboBox<>();
        sorveteCb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registroFuncionarioTf = new javax.swing.JTextField();
        cadastraPreferenciaBtn = new javax.swing.JButton();
        deletaPreferenciaBtn = new javax.swing.JButton();
        consultaPreferenciaBtn = new javax.swing.JButton();
        fecharBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de preferência de sabores de sorvete");

        marcaSorveteCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um Abaixo>", "Kibon", "Mayorka" }));
        marcaSorveteCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaSorveteCbActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca de sorvete:");

        jLabel3.setText("Tipo de sorvete:");

        tipoSorveteCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o tipo>", "Frutas", "Vegano", "Cremoso" }));
        tipoSorveteCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSorveteCbActionPerformed(evt);
            }
        });

        sorveteCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o sorvete>" }));
        sorveteCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorveteCbActionPerformed(evt);
            }
        });

        jLabel4.setText("Sorvete");

        jLabel5.setText("Registro do Funcionário:");

        registroFuncionarioTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroFuncionarioTfActionPerformed(evt);
            }
        });

        cadastraPreferenciaBtn.setText("Cadastra Prefereência");
        cadastraPreferenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraPreferenciaBtnActionPerformed(evt);
            }
        });

        deletaPreferenciaBtn.setText("Deletar Preferência");
        deletaPreferenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaPreferenciaBtnActionPerformed(evt);
            }
        });

        consultaPreferenciaBtn.setText("Consultar Prefência");
        consultaPreferenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPreferenciaBtnActionPerformed(evt);
            }
        });

        fecharBtn.setText("Fechar");
        fecharBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(cadastraPreferenciaBtn)
                        .addGap(75, 75, 75)
                        .addComponent(deletaPreferenciaBtn)
                        .addGap(74, 74, 74)
                        .addComponent(consultaPreferenciaBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(marcaSorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tipoSorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(registroFuncionarioTf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(340, 340, 340))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecharBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecharBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaSorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoSorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorveteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registroFuncionarioTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastraPreferenciaBtn)
                    .addComponent(deletaPreferenciaBtn)
                    .addComponent(consultaPreferenciaBtn))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marcaSorveteCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaSorveteCbActionPerformed
        if(marcaSorveteCb.getSelectedItem() == "Kibon"){
            tipoSorveteCb.removeAllItems();
            tipoSorveteCb.addItem("Vegano");
            tipoSorveteCb.addItem("Frutas");
            tipoSorveteCb.addItem("Cremoso");
            tipoSorveteCb.addItem("Zero Açúcar");            
        }
        
        if(marcaSorveteCb.getSelectedItem() == "Mayorka"){
            tipoSorveteCb.removeAllItems();
            tipoSorveteCb.addItem("Especiais 2 Litros");
            tipoSorveteCb.addItem("Clássicos 2 Litros");
            tipoSorveteCb.addItem("Favoritos 2 Litros");
            tipoSorveteCb.addItem("Premium 1 Litro");            
        }
        
        if(marcaSorveteCb.getSelectedItem() == "<Selecione um Abaixo>"){
            tipoSorveteCb.removeAllItems();
            tipoSorveteCb.addItem("<Selecione a Marca>");
                     
        }
    }//GEN-LAST:event_marcaSorveteCbActionPerformed

    private void sorveteCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorveteCbActionPerformed
        
        
    }//GEN-LAST:event_sorveteCbActionPerformed

    private void tipoSorveteCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSorveteCbActionPerformed
        if(tipoSorveteCb.getSelectedItem() == "Vegano"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Magnum Vegano Amêndoas");
            sorveteCb.addItem("Deliciosamente Vegano");
        }
        else if(tipoSorveteCb.getSelectedItem() == "Frutas"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Fruttare uva");
            sorveteCb.addItem("Fruttare muita fruta morango");
            sorveteCb.addItem("Fruttare muita fruta manga");
            sorveteCb.addItem("Fruttare maracujá");
            sorveteCb.addItem("Fruttare limão");
            sorveteCb.addItem("Fruttare coco");
        }
        else if(tipoSorveteCb.getSelectedItem() == "Cremoso"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Cremossísimo napolitano especial");
            sorveteCb.addItem("Cremossísimo napolitano");
            sorveteCb.addItem("Cremossísimo flocos");
            sorveteCb.addItem("Cremossísimo creme");
            sorveteCb.addItem("Cremossísimo chocolate");
            sorveteCb.addItem("Cremossísimo chicabon");
            sorveteCb.addItem("Cremossísimo 4 em 1 chocolate");
            sorveteCb.addItem("Cremossísimo 4 em 1");
            sorveteCb.addItem("Cremossísimo 2 em 1 frutas vermelhas");
            sorveteCb.addItem("Cremossísimo 2 en 1 frutas tropicais");
            
        }
        else if(tipoSorveteCb.getSelectedItem() == "Zero Açúcar"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Chicabon zero açúcar");
        }
        else if(tipoSorveteCb.getSelectedItem() == "Especiais 2 Litros"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Chocolate branco com morango");
            sorveteCb.addItem("Sublime");
            sorveteCb.addItem("Tentação");
        }
        else if(tipoSorveteCb.getSelectedItem() == "Clássicos 2 Litros"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Abacaxi");
            sorveteCb.addItem("Carioca");
            sorveteCb.addItem("Chocolate");
            sorveteCb.addItem("Creme");
            sorveteCb.addItem("Flocos");
            sorveteCb.addItem("Mezcla");
            sorveteCb.addItem("Napolitano");
        }
        else if(tipoSorveteCb.getSelectedItem() == "Favoritos 2 Litros"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Leite condensado com café");
            sorveteCb.addItem("Marta rocha");
            sorveteCb.addItem("Ninho trufado");
            sorveteCb.addItem("Torta belga");            
        }
        else if(tipoSorveteCb.getSelectedItem() == "Premium 1 Litro"){
            sorveteCb.removeAllItems();
            sorveteCb.addItem("Banana caramelizada");
            sorveteCb.addItem("Nozes");         
        }else {
            sorveteCb.removeAllItems();
            sorveteCb.addItem("<Selecione o Tipo>");
        }
    }//GEN-LAST:event_tipoSorveteCbActionPerformed

    private void registroFuncionarioTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroFuncionarioTfActionPerformed
        
    }//GEN-LAST:event_registroFuncionarioTfActionPerformed

    private void cadastraPreferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraPreferenciaBtnActionPerformed
        String nome;
        String idade;
        String frase = "";
        boolean arquivoExiste = true;
        String caminho = registroFuncionarioTf.getText() + ".dat";
            FileInputStream stream = null;
        try {
            stream = new FileInputStream(caminho);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "O funcionário não existe");
            arquivoExiste = false;
        }
        if(arquivoExiste){
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = null;
        try {
            linha = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Criatividade.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        while(linha != null) {
            
            
            try {
                
                linha = br.readLine();
                if(linha == null){
                break;
                }
                frase += linha;
            } catch (IOException ex) {
                Logger.getLogger(Criatividade.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

        nome = StringUtils.substringBetween(frase, "Nome: ", ";");
        idade = StringUtils.substringBetween(frase,"Idade: ", ";");
        
   
        FileWriter arq = null;
                    try {
                        arq = new FileWriter(registroFuncionarioTf.getText() + "sorvete.dat");
                    }catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    PrintWriter gravarArq = new PrintWriter(arq);
                    gravarArq.print("Nome: " + nome + ";");
                    gravarArq.println();
                    gravarArq.print("Idade: " + idade + ";");
                    gravarArq.println();
                    gravarArq.print("Marca preferida: " + marcaSorveteCb.getSelectedItem() + ";");
                    gravarArq.println();
                    gravarArq.print("Tipo preferido: " + tipoSorveteCb.getSelectedItem() + ";");
                    gravarArq.println();
                    gravarArq.print("Sorvete preferido: " + sorveteCb.getSelectedItem() + ";");

                    try {
                        arq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(null, "Preferência Cadastrada");
        }
    }//GEN-LAST:event_cadastraPreferenciaBtnActionPerformed

    private void consultaPreferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPreferenciaBtnActionPerformed
        ConsultaPreferencia consultapreferencia = new ConsultaPreferencia();
        consultapreferencia.setVisible(true);
        
    }//GEN-LAST:event_consultaPreferenciaBtnActionPerformed

    private void deletaPreferenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaPreferenciaBtnActionPerformed
        String Arquivo = registroFuncionarioTf.getText() + "sorvete.dat";
        File file = new File(Arquivo);
        if(file.delete()){
            JOptionPane.showMessageDialog(null, "Preferência do funcionário deletada com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "O registro de funcionário não existe");
        }
    }//GEN-LAST:event_deletaPreferenciaBtnActionPerformed

    private void fecharBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Criatividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Criatividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Criatividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Criatividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Criatividade().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastraPreferenciaBtn;
    private javax.swing.JButton consultaPreferenciaBtn;
    private javax.swing.JButton deletaPreferenciaBtn;
    private javax.swing.JButton fecharBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> marcaSorveteCb;
    private javax.swing.JTextField registroFuncionarioTf;
    private javax.swing.JComboBox<String> sorveteCb;
    private javax.swing.JComboBox<String> tipoSorveteCb;
    // End of variables declaration//GEN-END:variables
}
