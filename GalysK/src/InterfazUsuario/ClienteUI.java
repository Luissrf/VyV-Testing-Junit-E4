package InterfazUsuario;

import javax.swing.JOptionPane;

import Basedatos.CRUD;
import Basedatos.SQL;

import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import galysk.Clientes;
import java.awt.event.KeyEvent;

public class ClienteUI extends javax.swing.JFrame {

    Clientes clientes;
    CRUD crud;
    int idSeleccionarC;

    public ClienteUI() {
        initComponents();
        this.crud = new CRUD();
        this.mostrarClientes();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre_Cliente = new javax.swing.JTextField();
        txt_Fecha_Entrega = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_idPedido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionPastel = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre de Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 176, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Fecha de Entrega:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Dirección:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txt_Nombre_Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Nombre_ClienteKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Nombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 227, -1));

        txt_Fecha_Entrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Fecha_EntregaActionPerformed(evt);
            }
        });
        txt_Fecha_Entrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Fecha_EntregaKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Fecha_Entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 227, -1));

        txt_Direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_DireccionKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 292, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descripción del pastel:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo de la empresa.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 189, -1));

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 101, -1));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 101, -1));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 802, -1));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 117, -1));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, 101, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Numero de pedido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 176, -1));

        txt_idPedido.setEnabled(false);
        jPanel1.add(txt_idPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 227, -1));

        txtDescripcionPastel.setColumns(20);
        txtDescripcionPastel.setRows(5);
        txtDescripcionPastel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionPastelKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcionPastel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 409, 98));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        MenuGaly menu = new MenuGaly();
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.btnActualizar.setEnabled(false);
        this.btnBorrar.setEnabled(false);
        this.btnInsertar.setEnabled(true);

        this.txt_idPedido.setText("");
        this.txt_Nombre_Cliente.setText("");
        this.txt_Fecha_Entrega.setText("");
        this.txt_Direccion.setText("");
        this.txtDescripcionPastel.setText("");

        this.mostrarClientes();

        this.idSeleccionarC = -1;

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed

        this.clientes = new Clientes();

        String nombre = this.txt_Nombre_Cliente.getText();
        String fechaE = this.txt_Fecha_Entrega.getText();
        String Direccion = this.txt_Direccion.getText();
        String Descripcion = this.txtDescripcionPastel.getText();

        this.clientes.setNombre_cliente(nombre);
        this.clientes.setFecha(fechaE);
        this.clientes.setDireccion(Direccion);
        this.clientes.setDescripcion(Descripcion);

        boolean resultado = this.crud.insertar(SQL.insertClientes(this.clientes));

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Pedido Insertado Correctamente");
            this.mostrarClientes();
        } else {
            JOptionPane.showMessageDialog(null, "Pedido NO Insertado Correctamente");
        }


    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este pedido?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {

            boolean resultado = this.crud.actualizarEliminar(SQL.eliminarPClientes(this.idSeleccionarC));

            if (resultado) {

                JOptionPane.showMessageDialog(null, "ELIMINADO");

                this.btnNuevo.doClick();

            } else {
                JOptionPane.showMessageDialog(null, "NO ELIMINADO");
            }
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

        this.btnActualizar.setEnabled(true);
        this.btnBorrar.setEnabled(true);

        int fila = this.tablaClientes.getSelectedRow();

        this.idSeleccionarC = Integer.parseInt(this.tablaClientes.getValueAt(fila, 0).toString());

        try {

            ResultSet resultado = this.crud.seleccionar(SQL.selectTodosclientes(this.idSeleccionarC));

            if (resultado.next()) {

                this.txt_idPedido.setText(resultado.getString(1));
                this.txt_Nombre_Cliente.setText(resultado.getString(2));
                this.txt_Fecha_Entrega.setText(resultado.getString(3));
                this.txt_Direccion.setText(resultado.getString(4));
                this.txtDescripcionPastel.setText(resultado.getString(5));

            }//Cierra if

            this.btnInsertar.setEnabled(false);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        this.clientes = new Clientes();

        this.clientes.setNombre_cliente(this.txt_Nombre_Cliente.getText());
        this.clientes.setFecha(this.txt_Fecha_Entrega.getText());
        this.clientes.setDireccion(this.txt_Direccion.getText());
        this.clientes.setDescripcion(this.txtDescripcionPastel.getText());

        this.clientes.setId_cliente(this.idSeleccionarC);

        boolean resultado = this.crud.actualizarEliminar(SQL.actualizarPedidosC(this.clientes));

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Pedido ACTUALIZADO Correctamente");
            this.btnNuevo.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "Pedido NO ACTUALIZADO Correctamente");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txt_Fecha_EntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Fecha_EntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Fecha_EntregaActionPerformed

    private void txt_Nombre_ClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Nombre_ClienteKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Fecha_Entrega.requestFocus();
        }


    }//GEN-LAST:event_txt_Nombre_ClienteKeyPressed

    private void txt_Fecha_EntregaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Fecha_EntregaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_Direccion.requestFocus();
        }


    }//GEN-LAST:event_txt_Fecha_EntregaKeyPressed

    private void txtDescripcionPastelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionPastelKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInsertar.doClick();
            txt_idPedido.setText("");
            txt_Nombre_Cliente.setText("");
            txt_Fecha_Entrega.setText("");
            txt_Direccion.setText("");
            txtDescripcionPastel.setText("");
        }


    }//GEN-LAST:event_txtDescripcionPastelKeyPressed

    private void txt_DireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DireccionKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDescripcionPastel.requestFocus();

        }
    }//GEN-LAST:event_txt_DireccionKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextArea txtDescripcionPastel;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Fecha_Entrega;
    private javax.swing.JTextField txt_Nombre_Cliente;
    private javax.swing.JTextField txt_idPedido;
    // End of variables declaration//GEN-END:variables

    private void mostrarClientes() {

        this.limpiarTabla();
        DefaultTableModel modelo = (DefaultTableModel) this.tablaClientes.getModel();

        modelo.addColumn("Número de Pedido");
        modelo.addColumn("Cliente");
        modelo.addColumn("Fecha de Entrega");
        modelo.addColumn("Direccion");
        modelo.addColumn("Descripcción");

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectTodosClientes());

            while (resultado.next()) {

                Object[] depAux = {
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5)
                };
                modelo.addRow(depAux);

            } // cierra while

            this.tablaClientes.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    } // Cierre de mostrarDepartamentos

    private void limpiarTabla() {
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));

    }

}
