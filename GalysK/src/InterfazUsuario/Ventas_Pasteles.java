package InterfazUsuario;

import Basedatos.CRUD;
import Basedatos.SQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import galysk.Pasteles;
import galysk.VentaHijo;
import galysk.VentaPadre;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ventas_Pasteles extends javax.swing.JFrame {

    CRUD crud;
    ArrayList<Integer> idpasteles;
    int VentaPSeleccionada;

    public Ventas_Pasteles() {
        initComponents();
        this.crud = new CRUD();
        this.idpasteles = new ArrayList();
        
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentasPasteles = new javax.swing.JTable();
        txtNombreCliente = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtCambio = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPagarCon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        ImgLogoSoftware = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ventas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Id Pastel:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 110, -1));

        tablaVentasPasteles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pastel", "Nombre Cliente", "Nombre del Pastel", "Dirección", "Fecha de entrega", "Precio Venta", "Cantidad", "Importe"
            }
        ));
        tablaVentasPasteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasPastelesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentasPasteles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 1235, 359));

        txtNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 420, -1));

        btnMenos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 140, 60, 42));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 97, 45));

        btnMas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMas.setText("+");
        btnMas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 140, 60, 42));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 97, 45));

        txtCambio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 650, 212, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Regresar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 186, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Cambio:  $");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, -1, -1));

        txtPagarCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPagarCon.setForeground(new java.awt.Color(255, 0, 0));
        txtPagarCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPagarConKeyPressed(evt);
            }
        });
        jPanel1.add(txtPagarCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 650, 247, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Paga con:   $");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, -1, -1));

        TxtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 188, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Total:   $");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 650, 102, -1));

        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 590, 170, 46));

        ImgLogoSoftware.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLogoSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo del software sin nombre.png"))); // NOI18N
        jPanel1.add(ImgLogoSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 228, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1420, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
                
        VentaPadre venta = new VentaPadre();
        float total = Float.parseFloat(this.TxtTotal.getText());
        venta.setTotal(total);
        venta.setFecha(obtenerFechaHora());
        

        if (this.txtPagarCon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el monto con el que se pagará para poder continuar con el pago.", "Advertencia", JOptionPane.ERROR_MESSAGE);

        } else {
//            System.out.println(SQL.insertarVentaPadre(venta));
            boolean resultado = this.crud.insertar(SQL.insertarVentaPadre(venta));
            if (resultado) {
                   

//                //Venta hijo
                DefaultTableModel modelo = (DefaultTableModel) this.tablaVentasPasteles.getModel();

                ArrayList<VentaHijo> ventaHijo = new ArrayList();
                VentaHijo vhAux;

                for (int i = 0; i < modelo.getRowCount(); i++) {
                    vhAux = new VentaHijo();

                    vhAux.setId_venta_padre(this.crud.idGenerado());
                    vhAux.setCantidad(Integer.parseInt(modelo.getValueAt(i, 6).toString()));
                    vhAux.setId_producto(this.idpasteles.get(i));

                    ventaHijo.add(vhAux);
                }
                System.out.println(SQL.insertarVentaHijo(ventaHijo));
                boolean resultado2 = this.crud.insertar(SQL.insertarVentaHijo(ventaHijo));
                CambioPago();
                if (resultado2) {
                    JOptionPane.showMessageDialog(null, "VENDIDO");
                }

            } else {
                JOptionPane.showMessageDialog(null, "NO VENDIDO");
            }
        }



    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        this.btnPagar.setEnabled(true);

        String pastel = this.txtNombreCliente.getText();
        DefaultTableModel modelo = (DefaultTableModel) this.tablaVentasPasteles.getModel();
        Pasteles PastelesCon;

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectVentasPastel(pastel));
            if (resultado == null) {
                JOptionPane.showMessageDialog(null, "No se pudo ejecutar la consulta");
                return;
            }

            while (resultado.next()) {
                this.idpasteles.add(resultado.getInt(1));

                Object[] auxiliar = {
                    resultado.getInt(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),
                    resultado.getFloat(6),
                    resultado.getInt(7),
                    resultado.getFloat(6),
                    1,
                    (resultado.getFloat(6) * 1)
                };

                modelo.addRow(auxiliar);
                this.tablaVentasPasteles.setModel(modelo);
                this.calcularTotal();
            }

            this.txtNombreCliente.setText("");

            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No hay producto con ese código");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.btnMenos.setEnabled(false);
        this.btnMas.setEnabled(false);
        this.btnPagar.setEnabled(false);

        this.txtNombreCliente.setText("");
        this.TxtTotal.setText("");
        this.txtPagarCon.setText("");
        this.txtCambio.setText("");

        limpiarTabla();
        this.VentaPSeleccionada = -1;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuGaly menu = new MenuGaly();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaVentasPastelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasPastelesMouseClicked

        this.VentaPSeleccionada = this.tablaVentasPasteles.getSelectedRow();


    }//GEN-LAST:event_tablaVentasPastelesMouseClicked

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        
        int cantidadAuxiliar = Integer.parseInt(this.tablaVentasPasteles.getValueAt(this.VentaPSeleccionada, 6).toString());
        float importeAux = Float.parseFloat(this.tablaVentasPasteles.getValueAt(this.VentaPSeleccionada, 5).toString());

        cantidadAuxiliar--;

        this.tablaVentasPasteles.setValueAt(cantidadAuxiliar, this.VentaPSeleccionada, 6);
        this.tablaVentasPasteles.setValueAt((cantidadAuxiliar * importeAux), this.VentaPSeleccionada, 7);

        this.calcularTotal();
        
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        int cantidadAuxiliar = Integer.parseInt(this.tablaVentasPasteles.getValueAt(this.VentaPSeleccionada, 6).toString());
        float importeAux = Float.parseFloat(this.tablaVentasPasteles.getValueAt(this.VentaPSeleccionada, 5).toString());

        cantidadAuxiliar++;

        this.tablaVentasPasteles.setValueAt(cantidadAuxiliar, this.VentaPSeleccionada, 6);
        this.tablaVentasPasteles.setValueAt((cantidadAuxiliar * importeAux), this.VentaPSeleccionada, 7);

        this.calcularTotal();




        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasActionPerformed

    private void txtNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyPressed
        
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnBuscar.doClick();
            txtPagarCon.requestFocus();
        }
        
        
    }//GEN-LAST:event_txtNombreClienteKeyPressed

    private void txtPagarConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagarConKeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnPagar.doClick();
           
        }
        
        
    }//GEN-LAST:event_txtPagarConKeyPressed

    
    private void calcularTotal() {

        int filas = tablaVentasPasteles.getRowCount();

        float total = 0;

        for (int i = 0; i < filas; i++) {
            float Importe = Float.parseFloat(this.tablaVentasPasteles.getValueAt(i, 7).toString());

            total += Importe;

        }
        this.TxtTotal.setText(total + "");

    }
    
    

    
    
    private void CambioPago() {

        double totalP = Double.parseDouble(TxtTotal.getText());
        double PagoC = Double.parseDouble(txtPagarCon.getText());

        double cambio = PagoC - totalP;

        txtCambio.setText(String.valueOf(cambio));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgLogoSoftware;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentasPasteles;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtPagarCon;
    // End of variables declaration//GEN-END:variables

    private String obtenerFechaHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dtf.format(LocalDateTime.now());
    }

    private void limpiarTabla() {
        tablaVentasPasteles.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID Pastel", "Nombre Cliente", "Nombre del Pastel", "Dirección", "Fecha de entrega", "Precio Venta", "Cantidad", "Importe"
                }
        ));

    }
}
