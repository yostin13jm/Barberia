/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;


public class Loggin extends javax.swing.JFrame {
    //instancia del formulario Registro
    public static Registro registrar;
    
    public Loggin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLoggin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img-logo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Todos los derechos reservados © Itla Barber Shop");

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITLA BARBER SHOP");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img-logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Loggin");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 120, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Email");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 125, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 147, 300, 38));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        background.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 300, 40));

        btnLoggin.setBackground(new java.awt.Color(0, 102, 102));
        btnLoggin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLoggin.setForeground(new java.awt.Color(0, 0, 0));
        btnLoggin.setText("inciar sesion");
        btnLoggin.setBorderPainted(false);
        background.add(btnLoggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 150, 34));

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("No tengo una cuenta");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 160, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 102, 2));
        btnRegistrar.setText("Registrarme");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        background.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 144, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed
    
    //Cambia a la pagina de registro al hacer click en el btn
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar = new Registro();
        registrar.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

   
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnLoggin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
