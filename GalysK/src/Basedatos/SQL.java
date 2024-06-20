package Basedatos;

import galysk.Clientes;
import galysk.Inventario;
import galysk.Pasteles;
import galysk.VentaHijo;
import galysk.VentaPadre;
import java.util.ArrayList;
import galysk.Usuario;

public class SQL {

    //------------------------  CLIENTES  ---------------------  
    public static String insertClientes(Clientes clientes) {
        return "INSERT INTO cliente VALUES (NULL, '"
                + clientes.getNombre_cliente() + "', '"
                + clientes.getFecha() + "', '"
                + clientes.getDireccion() + "', '"
                + clientes.getDescripcion() + "')";
    }

    //Liena de codigo para visualizar todos los pedidos de Clientes
    public static String selectTodosClientes() {
        return "SELECT * FROM cliente";

    }

    //Linea de codigo para borrar los pedidos de los clientes
    public static String eliminarPClientes(int id) {
        return "DELETE FROM cliente WHERE id_cliente = " + id;
    }

    public static String selectClientes(int id) {
        return "SELECT * FROM cliente WHERE id_cliente = " + id;

    }

    public static String selectTodosclientes(int id) {
        return "SELECT c.id_cliente, "
                + "c.nombre_cliente, "
                + "c.fecha_entrega, "
                + "c.direccion, "
                + "c.descripcion "
                + "FROM cliente c "
                + "WHERE c.id_cliente =" + id;
    }

    public static String actualizarPedidosC(Clientes clientes) {
        return "UPDATE cliente SET nombre_cliente = '"
                + clientes.getNombre_cliente()
                + "', fecha_entrega = '" + clientes.getFecha()
                + "', direccion = '" + clientes.getDireccion()
                + "', descripcion = '" + clientes.getDescripcion()
                + "' WHERE cliente.id_cliente = "
                + clientes.getId_cliente();
    }

    //------------------------ PASTELES  ---------------------
    public static String insertPastel1(Pasteles pasteles) {
        return "INSERT INTO pastel VALUES (NULL, '"
                + pasteles.getNombre_pastel() + "', '"
                + pasteles.getPeso() + "', '"
                + pasteles.getRelleno() + "', '"
                + pasteles.getSabor() + "', "
                + pasteles.getPrecio_venta() + ", "
                + pasteles.getId_inventario() + ", "
                + pasteles.getId_cliente() + ")";
    }

    public static String selectTodosPasteles1() {
        return "SELECT p.id_pastel, "
                + "p.nombre_pastel, "
                + "p.peso, "
                + "p.relleno, "
                + "p.sabor, "
                + "p.precio_venta, "
                + "c.nombre_cliente, "
                + "c.descripcion, "
                + "i.cantidad "
                + "FROM pastel p INNER JOIN cliente c "
                + "ON p.id_cliente = c.id_cliente "
                + "INNER JOIN inventario i "
                + "ON p.id_inventario = i.id_inventario";
    }

    public static String selectPastel() {
        return "SELECT * FROM pastel";

    }

    public static String selectPastel(int id) {
        return "SELECT * FROM pastel WHERE id_pastel =" + id;
    }

    public static String actualizarPasteles(Pasteles pasteles) {
        return "UPDATE pastel SET nombre_pastel = '"
                + pasteles.getNombre_pastel() + "', "
                + "peso = '" + pasteles.getPeso() + "', "
                + "relleno = '" + pasteles.getRelleno() + "', "
                + "sabor = '" + pasteles.getSabor() + "', "
                + "precio_venta = " + pasteles.getPrecio_venta() + ", "
                + "id_cliente = " + pasteles.getId_cliente() + " "
                + "WHERE pastel.id_pastel = " + pasteles.getId_pastel();
    }

    public static String eliminarPasteles(int id) {
        return "DELETE FROM pastel WHERE id_pastel = " + id;
    }// cierre de eliminar producto

    public static String selectVentasPastel(String pastel) {
        return "SELECT p.id_pastel, "
                + "c.nombre_cliente, "
                + "p.nombre_pastel, "
                + "c.direccion, "
                + "c.fecha_entrega, "
                + "p.precio_venta, "
                + "i.cantidad "
                + "FROM pastel p INNER JOIN cliente c "
                + "ON p.id_cliente = c.id_cliente "
                + "INNER JOIN inventario i "
                + "ON p.id_inventario = i.id_inventario WHERE p.id_pastel = " + pastel;
    }

    public static String insertInventario(Inventario inventario) {
        return "INSERT INTO inventario VALUES (NULL, "
                + inventario.getCantidad() + " )";

    }

    public static String insertarVentaPadre(VentaPadre venta) {
        return "INSERT INTO venta_padre VALUES (null,'" + venta.getFecha() + "'," + venta.getTotal() + ")";

    }

    public static String insertarVentaHijo(ArrayList<VentaHijo> ventaHijo) {
        String sentencia = "INSERT INTO venta_hijo VALUES";

        for (int i = 0; i < ventaHijo.size(); i++) {
            sentencia += "(NULL,";
            sentencia += ventaHijo.get(i).getCantidad() + ",";
            sentencia += ventaHijo.get(i).getId_producto() + ",";
            sentencia += ventaHijo.get(i).getId_venta_padre();
            sentencia += ")";
            sentencia += (i + 1 < ventaHijo.size()) ? "," : ";";
        }

        return sentencia;

    }

    public static String selectTodosVentasPadre(int id) {
        return "SELECT id_venta_padre, fecha, total  FROM venta_padre WHERE id_venta_padre = " + id;
    }
    
    public static String acceso(Usuario usuario){
        return "SELECT * FROM usuario WHERE nombre_usuario ='"+usuario.getNombre_usuario()+"' AND contraseña = '"+ usuario.getContraseña() +"'";
    
    }
}
