package program.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lazon
 */
public class RegisterView extends javax.swing.JFrame {

    /**
     * Creates new form RegisterView
     */
    public RegisterView() {
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

        BtnGr_ToS = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        Data = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_Password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TF_RepeatPass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FTF_Birthday = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        CB_PS = new javax.swing.JCheckBox();
        CB_Xbox = new javax.swing.JCheckBox();
        CB_Stadia = new javax.swing.JCheckBox();
        CB_Switch = new javax.swing.JCheckBox();
        CB_Ouya = new javax.swing.JCheckBox();
        CB_PC = new javax.swing.JCheckBox();
        CB_PSP = new javax.swing.JCheckBox();
        CB_NES = new javax.swing.JCheckBox();
        CB_Mobile = new javax.swing.JCheckBox();
        ToS = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Btn_Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register, please :)");
        setMinimumSize(new java.awt.Dimension(578, 429));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Data.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setText("Register Data");
        Data.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, -1));

        jLabel2.setText("Username");
        Data.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, 63, -1));
        Data.add(TF_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 34, 196, -1));

        jLabel3.setText("E-Mail");
        Data.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));
        Data.add(TF_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 68, 196, -1));

        jLabel4.setText("Password");
        Data.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 111, -1, -1));
        Data.add(TF_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 108, 196, -1));

        jLabel5.setText("Repeat password");
        Data.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, -1, -1));
        Data.add(TF_RepeatPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 148, 196, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("Personal Data");
        Data.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 182, -1, -1));

        jLabel8.setText("Day of birth");
        Data.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, -1, -1));

        FTF_Birthday.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        Data.add(FTF_Birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 210, 196, -1));

        jLabel9.setText("Used platforms");
        Data.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 244, -1, -1));

        CB_PS.setText("Play Station");
        Data.add(CB_PS, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 278, -1, -1));

        CB_Xbox.setText("XBox");
        Data.add(CB_Xbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 304, -1, -1));

        CB_Stadia.setText("Stadia");
        CB_Stadia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_StadiaActionPerformed(evt);
            }
        });
        Data.add(CB_Stadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 304, -1, -1));

        CB_Switch.setText("Switch");
        Data.add(CB_Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 330, -1, -1));

        CB_Ouya.setText("Ouya");
        CB_Ouya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_OuyaActionPerformed(evt);
            }
        });
        Data.add(CB_Ouya, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 278, -1, -1));

        CB_PC.setText("PC");
        CB_PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PCActionPerformed(evt);
            }
        });
        Data.add(CB_PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        CB_PSP.setText("PSP");
        CB_PSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PSPActionPerformed(evt);
            }
        });
        Data.add(CB_PSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 278, -1, -1));

        CB_NES.setText("NES");
        CB_NES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_NESActionPerformed(evt);
            }
        });
        Data.add(CB_NES, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 304, -1, -1));

        CB_Mobile.setText("Mobile");
        CB_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MobileActionPerformed(evt);
            }
        });
        Data.add(CB_Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 330, -1, -1));

        ToS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("Terms of Service");
        ToS.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 6, -1, -1));

        jTextPane1.setText("Nuestra aplicaci ́on tiene que ser capaz de almacenar un nuevo usuario con distintos datos como nombre, apellidos, fecha nacimiento entre otros datos. Aqu ́ı se pueden usar muchos eventos, tantos para mostrar campos de ayuda o mensajes de error si no se cumple ciertas condici ́on, os los dejo a vuestra creatividad. Dichos datos pueden ser almacenados en una array o lista y usado a lo largo del programa aunque esto genera un problema ya que cuando se cierre la aplicaci ́on los nuevos usuarios no se quedar ́an guardados para arreglarlos es necesario implementar la parte extra.Nuestra aplicaci ́on tiene que ser capaz de almacenar un nuevo usuario con distintos datos como nombre, apellidos, fecha nacimiento entre otros datos. Aqu ́ı se pueden usar muchos eventos, tantos para mostrar campos de ayuda o mensajes de error si no se cumple ciertas condici ́on, os los dejo a vuestra creatividad. Dichos datos pueden ser almacenados en una array o lista y usado a lo largo del programa aunque esto genera un problema ya que cuando se cierre la aplicaci ́on los nuevos usuarios no se quedar ́an guardados para arreglarlos es necesario implementar la parte extra.Nuestra aplicaci ́on tiene que ser capaz de almacenar un nuevo usuario con distintos datos como nombre, apellidos, fecha nacimiento entre otros datos. Aqu ́ı se pueden usar muchos eventos, tantos para mostrar campos de ayuda o mensajes de error si no se cumple ciertas condici ́on, os los dejo a vuestra creatividad. Dichos datos pueden ser almacenados en una array o lista y usado a lo largo del programa aunque esto genera un problema ya que cuando se cierre la aplicaci ́on los nuevos usuarios no se quedar ́an guardados para arreglarlos es necesario implementar la parte extra.");
        jScrollPane2.setViewportView(jTextPane1);

        ToS.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 34, 221, 262));

        BtnGr_ToS.add(jRadioButton1);
        jRadioButton1.setText("Accept ToS");
        ToS.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 308, -1, -1));

        BtnGr_ToS.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Reject ToS");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        ToS.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 334, -1, -1));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ToS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ToS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 400));

        Btn_Register.setText("Register");
        getContentPane().add(Btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_StadiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_StadiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_StadiaActionPerformed

    private void CB_OuyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_OuyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_OuyaActionPerformed

    private void CB_PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_PCActionPerformed

    private void CB_PSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_PSPActionPerformed

    private void CB_NESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_NESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_NESActionPerformed

    private void CB_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MobileActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnGr_ToS;
    private javax.swing.JButton Btn_Register;
    private javax.swing.JCheckBox CB_Mobile;
    private javax.swing.JCheckBox CB_NES;
    private javax.swing.JCheckBox CB_Ouya;
    private javax.swing.JCheckBox CB_PC;
    private javax.swing.JCheckBox CB_PS;
    private javax.swing.JCheckBox CB_PSP;
    private javax.swing.JCheckBox CB_Stadia;
    private javax.swing.JCheckBox CB_Switch;
    private javax.swing.JCheckBox CB_Xbox;
    private javax.swing.JPanel Data;
    private javax.swing.JFormattedTextField FTF_Birthday;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Password;
    private javax.swing.JTextField TF_RepeatPass;
    private javax.swing.JTextField TF_Username;
    private javax.swing.JPanel ToS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
