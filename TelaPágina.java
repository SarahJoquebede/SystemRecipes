package projetinho;


import projetinho.TelaPrincipal;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetinho.Gravador;
import projetinho.Receita;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author FCOST
 */
public class TelaPágina extends javax.swing.JFrame {
      ArrayList<Receita>receitas=new ArrayList<>();
    /**
     * Creates new form TelaPágina
     */
  
    public TelaPágina(){
          try {
              receitas=(ArrayList<Receita>)Gravador.ler("receitas.data");
          } catch (IOException ex) {
              Logger.getLogger(TelaPágina.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(TelaPágina.class.getName()).log(Level.SEVERE, null, ex);
          }
        initComponents();
        setLocationRelativeTo(null);
            
          try {
              atualizarTabela();
          } catch (IOException ex) {
              Logger.getLogger(TelaPágina.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
     
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCima = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReceitas = new javax.swing.JTable();
        lbReceitasDe = new javax.swing.JLabel();
        iBNomeUsuario = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        Mopcoes = new javax.swing.JMenu();
        JClogin = new javax.swing.JCheckBoxMenuItem();
        jCVoltar = new javax.swing.JCheckBoxMenuItem();
        JCsair = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnCima.setBackground(new java.awt.Color(230, 94, 41));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cópia de PROTOTIO3.pdf (2) (2) (2).png"))); // NOI18N

        javax.swing.GroupLayout pnCimaLayout = new javax.swing.GroupLayout(pnCima);
        pnCima.setLayout(pnCimaLayout);
        pnCimaLayout.setHorizontalGroup(
            pnCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCimaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imgLogo)
                .addContainerGap(748, Short.MAX_VALUE))
        );
        pnCimaLayout.setVerticalGroup(
            pnCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCimaLayout.createSequentialGroup()
                .addComponent(imgLogo)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        tbReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prato", "Ingredientes", "Modo de preparo"
            }
        ));
        jScrollPane1.setViewportView(tbReceitas);

        lbReceitasDe.setBackground(new java.awt.Color(255, 255, 255));
        lbReceitasDe.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        lbReceitasDe.setText("Receitas de");

        iBNomeUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        iBNomeUsuario.setForeground(new java.awt.Color(230, 94, 41));

        btExcluir.setBackground(new java.awt.Color(44, 44, 44));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ApagarImg.png"))); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tfPesquisar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        tfPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(230, 94, 41));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pesquisar2Img.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        jMenuBar2.setBackground(new java.awt.Color(230, 94, 41));
        jMenuBar2.setForeground(new java.awt.Color(230, 94, 41));

        Mopcoes.setText("Opções");

        JClogin.setSelected(true);
        JClogin.setText("Login");
        Mopcoes.add(JClogin);

        jCVoltar.setSelected(true);
        jCVoltar.setText("Voltar");
        jCVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCVoltarActionPerformed(evt);
            }
        });
        Mopcoes.add(jCVoltar);

        JCsair.setSelected(true);
        JCsair.setText("Sair");
        JCsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCsairActionPerformed(evt);
            }
        });
        Mopcoes.add(JCsair);

        jMenuBar2.add(Mopcoes);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbReceitasDe, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iBNomeUsuario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbReceitasDe)
                    .addComponent(iBNomeUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void excluirReceita() {
    // Obtém o modelo da tabela
    DefaultTableModel model = (DefaultTableModel) tbReceitas.getModel();
    
    // Verifica se alguma linha está selecionada
    int selectedRow = tbReceitas.getSelectedRow();
    
    if (selectedRow != -1) {
        // Remove a linha selecionada
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Receita excluída com sucesso!");
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione uma receita para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
    public void atualizarTabela()throws IOException{
        Gravador.gravar("receitas.data", receitas);
        DefaultTableModel modelo=(DefaultTableModel)tbReceitas.getModel();
        modelo.setNumRows(0);
        Object coluna[]=new Object [3];
        for(int i=0; i<=receitas.size(); i++){
            coluna[0]=receitas.get(i).getTitulo();
            coluna[1]=receitas.get(i).getIngrediente();
            coluna [2]=receitas.get(i).getTempoPreparo();
            modelo.addRow(coluna);
        }
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        excluirReceita();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed
    private void pesquisarReceitas() {
    String termoPesquisa = tfPesquisar.getText().trim().toLowerCase(); // Obtém o texto digitado e converte para minúsculas
    DefaultTableModel model = (DefaultTableModel) tbReceitas.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    tbReceitas.setRowSorter(sorter);
   
    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + termoPesquisa, 0));
}
  
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
     
         pesquisarReceitas();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void JCsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCsairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_JCsairActionPerformed
    private void abrirTelaCadastro() {
    TelaPrincipal telaCadastro = new TelaPrincipal(); 
    telaCadastro.setVisible(true);
    telaCadastro.setLocationRelativeTo(null);
    this.dispose();
    }
    private void jCVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCVoltarActionPerformed
        // TODO add your handling code here:
        abrirTelaCadastro();
        
    }//GEN-LAST:event_jCVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPágina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPágina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPágina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPágina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPágina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem JClogin;
    private javax.swing.JCheckBoxMenuItem JCsair;
    private javax.swing.JMenu Mopcoes;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel iBNomeUsuario;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JCheckBoxMenuItem jCVoltar;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbReceitasDe;
    private javax.swing.JPanel pnCima;
    private javax.swing.JTable tbReceitas;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
