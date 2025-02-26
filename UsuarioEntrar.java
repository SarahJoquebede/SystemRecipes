
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author FCOST
 */
public class UsuarioEntrar extends javax.swing.JFrame {

    /**
     * Creates new form TelaEntrar
     */
    public UsuarioEntrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfIniciarSeção = new javax.swing.JLabel();
        tfNome = new javax.swing.JLabel();
        tpNome = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        pfSenha = new javax.swing.JPasswordField();
        tfSenha = new javax.swing.JLabel();
        imgPainel = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receitas com Afeto - Entrar");
        setMaximumSize(new java.awt.Dimension(870, 580));
        setMinimumSize(new java.awt.Dimension(870, 580));
        getContentPane().setLayout(null);

        tfIniciarSeção.setBackground(new java.awt.Color(0, 0, 0));
        tfIniciarSeção.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        tfIniciarSeção.setForeground(new java.awt.Color(254, 136, 1));
        tfIniciarSeção.setText("Iniciar Sessão");
        getContentPane().add(tfIniciarSeção);
        tfIniciarSeção.setBounds(540, 130, 260, 30);

        tfNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfNome.setText("Nome");
        getContentPane().add(tfNome);
        tfNome.setBounds(550, 200, 100, 16);

        tpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tpNome);
        tpNome.setBounds(550, 220, 220, 22);

        btEntrar.setBackground(new java.awt.Color(254, 136, 1));
        btEntrar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btEntrar);
        btEntrar.setBounds(560, 340, 200, 40);
        getContentPane().add(pfSenha);
        pfSenha.setBounds(550, 280, 220, 22);

        tfSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tfSenha.setText("Senha");
        getContentPane().add(tfSenha);
        tfSenha.setBounds(550, 260, 100, 16);

        imgPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PanelUser.png"))); // NOI18N
        getContentPane().add(imgPainel);
        imgPainel.setBounds(490, 30, 350, 490);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoEntrar.png"))); // NOI18N
        imgFundo.setAutoscrolls(true);
        imgFundo.setMinimumSize(new java.awt.Dimension(880, 560));
        getContentPane().add(imgFundo);
        imgFundo.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpNomeActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
    String nomeDigitado = tpNome.getText().trim();
    String senhaDigitada = new String(pfSenha.getPassword());
    if (nomeDigitado.isEmpty() || senhaDigitada.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
}
         if (nomeDigitado.equals(Usuario.nomeUsuario) && senhaDigitada.equals(Usuario.senhaUsuario)) {
        JOptionPane.showMessageDialog(this, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        this.dispose();  
    } else {
        JOptionPane.showMessageDialog(this, "Nome ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
    String nome = tfNome.getText(); 
    new TelaPágina().setVisible(true); 
    this.dispose(); 

    

    }//GEN-LAST:event_btEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioEntrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel imgPainel;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JLabel tfIniciarSeção;
    private javax.swing.JLabel tfNome;
    private javax.swing.JLabel tfSenha;
    private javax.swing.JTextField tpNome;
    // End of variables declaration//GEN-END:variables
}
