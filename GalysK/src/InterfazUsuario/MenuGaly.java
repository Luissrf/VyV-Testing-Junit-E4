package InterfazUsuario;

public class MenuGaly extends javax.swing.JFrame {

    public MenuGaly() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClientesMenu = new javax.swing.JButton();
        btnPastelesMenu = new javax.swing.JButton();
        btnVentasMenu = new javax.swing.JButton();
        btnInfoVentasMenu = new javax.swing.JButton();
        ImgLogoSoftware = new javax.swing.JLabel();
        LetrasMenu = new javax.swing.JLabel();
        ImagenGrandeMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClientesMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClientesMenu.setText("Clientes");
        btnClientesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientesMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, 50));

        btnPastelesMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPastelesMenu.setText("Pastel");
        btnPastelesMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPastelesMenu.setPreferredSize(new java.awt.Dimension(123, 41));
        btnPastelesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastelesMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnPastelesMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 260, 50));

        btnVentasMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVentasMenu.setText("Ventas");
        btnVentasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 270, 50));

        btnInfoVentasMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInfoVentasMenu.setText("Informes de Ventas");
        btnInfoVentasMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoVentasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoVentasMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfoVentasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 280, 280, 50));

        ImgLogoSoftware.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLogoSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo del software sin nombre.png"))); // NOI18N
        jPanel1.add(ImgLogoSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 228, 200));

        LetrasMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LetrasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Letras del Menu.png"))); // NOI18N
        jPanel1.add(LetrasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, 210));

        ImagenGrandeMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImagenGrandeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo del menu.png"))); // NOI18N
        jPanel1.add(ImagenGrandeMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 1520, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPastelesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastelesMenuActionPerformed
        PastelUI pasUI = new PastelUI();
        pasUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnPastelesMenuActionPerformed

    private void btnClientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesMenuActionPerformed
        ClienteUI cliUI = new ClienteUI();
        cliUI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnClientesMenuActionPerformed

    private void btnInfoVentasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoVentasMenuActionPerformed
        InformeUI inf = new InformeUI();
        inf.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoVentasMenuActionPerformed

    private void btnVentasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasMenuActionPerformed
        Ventas_Pasteles VentaP = new Ventas_Pasteles();
        VentaP.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnVentasMenuActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenGrandeMenu;
    private javax.swing.JLabel ImgLogoSoftware;
    private javax.swing.JLabel LetrasMenu;
    private javax.swing.JButton btnClientesMenu;
    private javax.swing.JButton btnInfoVentasMenu;
    private javax.swing.JButton btnPastelesMenu;
    private javax.swing.JButton btnVentasMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
