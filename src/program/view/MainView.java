/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package program.view;

import javax.swing.JEditorPane;
import program.controllers.ProfileManager;
import program.controllers.UserLogic;

/**
 *
 * @author Cassy McJack
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    
    public MainView() {
        initComponents();
        UserLogic.Init();
    }

    public void updateComponent() {
    	label_username.setText(ProfileManager.getUsername());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Brand = new javax.swing.JLabel();
        Images = new javax.swing.JPanel();
        image1 = new javax.swing.JLabel();
        LoginInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        LoginButtons = new javax.swing.JPanel();
        btn_Login = new javax.swing.JButton();
        btn_Register = new javax.swing.JButton();
        Play = new javax.swing.JPanel();
        Btn_Play = new javax.swing.JButton();
        InfoPanel = new javax.swing.JPanel();
        Btn_Info1 = new javax.swing.JButton();
        Btn_Info2 = new javax.swing.JButton();
        Btn_Info3 = new javax.swing.JButton();
        Btn_Info4 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casandra Gameworks Launcher");
        setBackground(new java.awt.Color(54, 56, 58));
        setMinimumSize(new java.awt.Dimension(774, 562));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Brand.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Brand.setText("Casandra Gameworks Laucher!~");
        getContentPane().add(Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 40));

        Images.setBackground(new java.awt.Color(155, 162, 168));
        Images.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Media1.png"))); // NOI18N
        Images.add(image1);

        getContentPane().add(Images, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 510, 370));

        LoginInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Welcome:");
        LoginInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        label_username.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        label_username.setText("Desconocido");
        LoginInfo.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(LoginInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 40));

        LoginButtons.setLayout(new java.awt.BorderLayout());

        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        LoginButtons.add(btn_Login, java.awt.BorderLayout.LINE_END);

        btn_Register.setText("Sign up");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        LoginButtons.add(btn_Register, java.awt.BorderLayout.LINE_START);

        getContentPane().add(LoginButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 160, 30));

        Play.setLayout(new java.awt.GridLayout(1, 0));

        Btn_Play.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Btn_Play.setText("PLAY!");
        Btn_Play.setEnabled(false);
        Play.add(Btn_Play);

        getContentPane().add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 160, 50));

        InfoPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        Btn_Info1.setText("Mandela County is here!");
        Btn_Info1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info1ActionPerformed(evt);
            }
        });
        InfoPanel.add(Btn_Info1);

        Btn_Info2.setText("Happy Cafe big REVEAL!");
        Btn_Info2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info2ActionPerformed(evt);
            }
        });
        InfoPanel.add(Btn_Info2);

        Btn_Info3.setText("About us");
        Btn_Info3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info3ActionPerformed(evt);
            }
        });
        InfoPanel.add(Btn_Info3);

        Btn_Info4.setText("Our first videogame");
        Btn_Info4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Info4ActionPerformed(evt);
            }
        });
        InfoPanel.add(Btn_Info4);
        InfoPanel.add(filler1);
        InfoPanel.add(filler2);
        InfoPanel.add(filler3);

        getContentPane().add(InfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 370));

        jProgressBar1.setValue(99);
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 530, 30));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Downloading.....  99% (With MEDAC's internet ETA 999:99:00)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RegisterView regi = new RegisterView();
        regi.myMain = MainView.this;
        regi.setVisible(true);
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        this.setVisible(false);
        LoginView log = new LoginView();
        log.myMain = MainView.this;
        log.setVisible(true);
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void Btn_Info1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info1ActionPerformed
        // TODO add your handling code here:
        image1.setVisible(true);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Media1.png")));
    }//GEN-LAST:event_Btn_Info1ActionPerformed

    private void Btn_Info2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info2ActionPerformed
        // TODO add your handling code here:
        image1.setVisible(true);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Media2.png")));
    }//GEN-LAST:event_Btn_Info2ActionPerformed

    private void Btn_Info3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info3ActionPerformed
        // TODO add your handling code here:
        image1.setVisible(true);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Media3.png")));
    }//GEN-LAST:event_Btn_Info3ActionPerformed

    private void Btn_Info4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Info4ActionPerformed
        image1.setVisible(true);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/Media4.png")));
    }//GEN-LAST:event_Btn_Info4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Brand;
    private javax.swing.JButton Btn_Info1;
    private javax.swing.JButton Btn_Info2;
    private javax.swing.JButton Btn_Info3;
    private javax.swing.JButton Btn_Info4;
    private javax.swing.JButton Btn_Play;
    private javax.swing.JPanel Images;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel LoginButtons;
    private javax.swing.JPanel LoginInfo;
    private javax.swing.JPanel Play;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Register;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel label_username;
    // End of variables declaration//GEN-END:variables
}
