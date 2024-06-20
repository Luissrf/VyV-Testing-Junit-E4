package InterfazUsuario;

import Basedatos.CRUD;
import Basedatos.SQL;
import galysk.Pasteles;
import galysk.Clientes;
import galysk.Inventario;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PastelUI extends javax.swing.JFrame {

    List<Clientes> ClientesEP;
    CRUD crud;
    int idSeleccionado;
    Pasteles pasteles;

    public PastelUI() {
        initComponents();
        this.crud = new CRUD();
        this.cargarClientes();
        this.mostrarPastel();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxCliente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPastel = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombePastel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxClientePastel = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxPeso = new javax.swing.JComboBox<>();
        boxRelleno = new javax.swing.JComboBox<>();
        boxSabor = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtid_pastel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1404, 791));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxCliente.setBackground(new java.awt.Color(255, 255, 255));
        boxCliente.setPreferredSize(new java.awt.Dimension(1404, 791));
        boxCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPastel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPastel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPastelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPastel);

        boxCliente.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 1271, 167));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("Borrar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        boxCliente.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 160, 39));

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        boxCliente.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 160, 39));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        boxCliente.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 380, 160, 39));

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        boxCliente.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 160, 39));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("Regresar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        boxCliente.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 366, 39));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pasteles letra.png"))); // NOI18N
        boxCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 480, 90));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Peso:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 98, 58, -1));

        txtNombePastel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNombePastel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombePastelKeyPressed(evt);
            }
        });
        jPanel1.add(txtNombePastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 95, 179, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 174, 104, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre Pastel:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 98, 141, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Sabor:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 98, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Precio Venta: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 174, 130, -1));

        boxClientePastel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(boxClientePastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 170, 165, -1));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 171, 169, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Relleno:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 98, -1, -1));

        boxPeso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boxPeso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/2 Kg", "1 Kg", "2 Kg", "3 Kg" }));
        jPanel1.add(boxPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 95, 106, -1));

        boxRelleno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boxRelleno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mermelada", "Chocolate", "Crema", "Chantilly", "Dulce de Leche" }));
        jPanel1.add(boxRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 95, -1, -1));

        boxSabor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boxSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vainilla", "Chocolate", "Fresa", "Limón" }));
        jPanel1.add(boxSabor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 95, 133, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("$");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 174, 19, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Id del pastel:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 33, 130, -1));

        txtid_pastel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid_pastel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtid_pastel.setEnabled(false);
        jPanel1.add(txtid_pastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 30, 230, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 174, 102, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 171, 131, -1));

        boxCliente.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 1191, 220));

        getContentPane().add(boxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1380, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        MenuGaly menu = new MenuGaly();
        menu.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Pasteles pasteles = new Pasteles();
        Inventario inventario = new Inventario();

        String nombrePastel = this.txtNombePastel.getText();
        String pesoo = boxPeso.getSelectedItem().toString();
        String rellenoo = boxRelleno.getSelectedItem().toString();
        String saborr = boxSabor.getSelectedItem().toString();

        float pv = Float.parseFloat(this.txtPrecio.getText());

        int indice = this.boxClientePastel.getSelectedIndex();
        int idCli = this.ClientesEP.get(indice).getId_cliente();

        int hay = Integer.parseInt(this.txtCantidad.getText());

        pasteles.setNombre_pastel(nombrePastel);
        pasteles.setPeso(pesoo);
        pasteles.setRelleno(rellenoo);
        pasteles.setSabor(saborr);
        pasteles.setPrecio_venta(pv);
        pasteles.setId_cliente(idCli);

        inventario.setCantidad(hay);
        //Guardar en la base de datos

        boolean resultado = this.crud.insertPasteles(inventario, pasteles);

        
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
            this.mostrarPastel();
        } else {
            JOptionPane.showMessageDialog(null, "NO Insertado ");
        }
    

    
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void tablaPastelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPastelMouseClicked

        this.btnActualizar.setEnabled(true);
        this.btnEliminar.setEnabled(true);

        int fila = this.tablaPastel.getSelectedRow();
        this.idSeleccionado = Integer.parseInt(this.tablaPastel.getValueAt(fila, 0).toString());

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectPastel(this.idSeleccionado));

            if (resultado.next()) {
                this.txtid_pastel.setText(resultado.getString(1));
                this.txtNombePastel.setText(resultado.getString(2));
                this.boxPeso.setSelectedItem(resultado.getString(3));
                this.boxRelleno.setSelectedItem(resultado.getString(4));
                this.boxSabor.setSelectedItem(resultado.getString(5));
                this.txtPrecio.setText(resultado.getFloat(6) + "");

                int id = resultado.getInt(8);
                for (int i = 0; i < this.ClientesEP.size(); i++) {
                    if (this.ClientesEP.get(i).getId_cliente() == id) {
                        this.boxClientePastel.setSelectedItem(this.ClientesEP.get(i).getNombre_cliente());
                        break;
                    }
                }
                
                this.txtCantidad.setText(resultado.getInt(7) + "");

            }

            this.btnInsertar.setEnabled(false);

        } catch (SQLException e) {
            System.err.println("Error" + e.getMessage());
        }


    }//GEN-LAST:event_tablaPastelMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        this.pasteles = new Pasteles();

        // Asegurarse de establecer el id_pastel en el objeto Pasteles.
        this.pasteles.setId_pastel(this.idSeleccionado);

        this.pasteles.setNombre_pastel(this.txtNombePastel.getText());
        String nombrePastel = this.txtNombePastel.getText();
        String pesoo = boxPeso.getSelectedItem().toString();
        String rellenoo = boxRelleno.getSelectedItem().toString();
        String saborr = boxSabor.getSelectedItem().toString();

        float pv = Float.parseFloat(this.txtPrecio.getText());

        int indice = this.boxClientePastel.getSelectedIndex();
        int idCli = this.ClientesEP.get(indice).getId_cliente();

        this.pasteles.setId_cliente(this.idSeleccionado);
        this.pasteles.setNombre_pastel(nombrePastel);
        this.pasteles.setPeso(pesoo);
        this.pasteles.setRelleno(rellenoo);
        this.pasteles.setSabor(saborr);
        this.pasteles.setPrecio_venta(pv);
        this.pasteles.setId_cliente(idCli);

        //Guardar en la base de datos
        boolean resultado = this.crud.actualizarEliminar(SQL.actualizarPasteles(this.pasteles));

        if (resultado) {
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
            this.btnNuevo.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "NO Actualizado ");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        this.btnActualizar.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnInsertar.setEnabled(true);

        this.txtNombePastel.setText("");
        this.boxPeso.setSelectedIndex(0);
        this.boxRelleno.setSelectedIndex(0);
        this.boxSabor.setSelectedIndex(0);
        this.txtPrecio.setText("");
        this.boxClientePastel.setSelectedIndex(0);
        this.txtid_pastel.setText("");
        this.txtCantidad.setText("");

        this.mostrarPastel();

        this.idSeleccionado = -1;


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtNombePastelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombePastelKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCantidad.requestFocus();
        }
        
        
    }//GEN-LAST:event_txtNombePastelKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPrecio.requestFocus();
        }
        
        
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnInsertar.doClick();
        }
        
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void limpiarTabla() {
        tablaPastel.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void eliminar() {
        int fila = tablaPastel.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto para eliminar");
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este pedido?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                String valor = tablaPastel.getValueAt(fila, 0).toString();
                int id = Integer.parseInt(valor);

                boolean res = this.crud.actualizarEliminar(SQL.eliminarPasteles(id));
                this.mostrarPastel();
                if (res) {
                    JOptionPane.showMessageDialog(null, "Datos del pastel eliminados correctamente");

                } else {
                    JOptionPane.showMessageDialog(null, "NO ELIMINADO");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxCliente;
    private javax.swing.JComboBox<String> boxClientePastel;
    private javax.swing.JComboBox<String> boxPeso;
    private javax.swing.JComboBox<String> boxRelleno;
    private javax.swing.JComboBox<String> boxSabor;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPastel;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombePastel;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtid_pastel;
    // End of variables declaration//GEN-END:variables

    public void mostrarPastel() {
        this.limpiarTabla();
        DefaultTableModel Tabla = (DefaultTableModel) this.tablaPastel.getModel();

        Tabla.addColumn("ID");
        Tabla.addColumn("Nombre del pastel");
        Tabla.addColumn("Peso");
        Tabla.addColumn("Relleno");
        Tabla.addColumn("Sabor");
        Tabla.addColumn("Precio");
        Tabla.addColumn("Cantidad");
        Tabla.addColumn("Cliente");
        Tabla.addColumn("Descripción del pastel");

        try {
            ResultSet resultado = this.crud.seleccionar(SQL.selectTodosPasteles1());
            while (resultado.next()) {
                Object[] depAux = {
                    resultado.getInt(1),
                    resultado.getString(2),
                    resultado.getString(3),
                    resultado.getString(4),
                    resultado.getString(5),
                    resultado.getFloat(6),
                    resultado.getInt(9),
                    resultado.getString(7),
                    resultado.getString(8),};

                Tabla.addRow(depAux);

            }//cierra while

            this.tablaPastel.setModel(Tabla);

        } catch (SQLException e) {
            System.err.println("Error:" + e.getMessage());

        }

    }//cierra mostrar

    private void cargarClientes() {

        this.boxClientePastel.removeAllItems();

        try {
            ResultSet rst = this.crud.seleccionar(SQL.selectTodosClientes());

            Clientes cli;

            //Instancia que va a guardar todos los departamentos
            this.ClientesEP = new ArrayList();

            while (rst.next()) {

                this.boxClientePastel.addItem(rst.getString(2));
                cli = new Clientes();

                cli.setId_cliente(rst.getInt(1));
                cli.setNombre_cliente(rst.getString(2));
                this.ClientesEP.add(cli);
            }

        } catch (SQLException e) {
            System.err.println("Error al cargar el departamento: " + e.getMessage());
        }
    }

}
