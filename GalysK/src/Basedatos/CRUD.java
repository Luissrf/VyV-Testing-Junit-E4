package Basedatos;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import galysk.Clientes;
import galysk.Inventario;
import galysk.Pasteles;

public class CRUD {

    Statement statement = null;
    PreparedStatement pst;
    int filaAfectada;
    ResultSet rst;

    public CRUD() {
        this.pst = null;
        this.rst = null;
        this.statement = null;
        this.filaAfectada = Integer.MAX_VALUE;
    }//cierra el metodo CRUD

    public boolean insertar(String sql) {

        try {

            this.pst = (PreparedStatement) Conexion.conexion.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            this.filaAfectada = this.pst.executeUpdate();
            System.out.println("Insertado correctamente");
            return true;

        } catch (SQLException e) {
            System.err.println("Error al insertar:" + e.getMessage());
            return false;
        }
    }//Cierra insertar

    /*
    public boolean updateProductos(pastel inventario, Productos producto){
    try{

            this.filaAfectada = this.pst.executeUpdate();
            System.out.println("Insertado correctamente");
            
            return true;
    } catch (SQLException e) {
        System.err.println("Error al actualizar: " + e.getMessage());
        return false;
    }
}//cierra producto
    
     */
    public ResultSet seleccionar(String sql) {

        try {
            this.statement = Conexion.conexion.createStatement();
            return this.statement.executeQuery(sql);

        } catch (SQLException | ClassCastException e) {
            System.out.println("Error al selecionar: " + e.getMessage());
            return null;

        }
    }//cierr el selccionar

    public boolean insertClientes(Clientes clientes) {

        try {

            if (this.insertar(SQL.insertClientes(clientes))) {
                this.rst = this.pst.getGeneratedKeys();
            }//Cierra el primer if

            return true;

        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }

    }

    public boolean actualizarEliminar(String sql) {
        try {
            this.statement = Conexion.conexion.createStatement();
            this.statement.executeUpdate(sql);
            return true;
        } catch (SQLException | ClassCastException e) {
            System.err.println("Error al realizar la accion" + e.getMessage());
            return false;
        }

    }
    
    
    public boolean insertPasteles(Inventario inventario, Pasteles pasteles) {

        try {

            if (this.insertar(SQL.insertInventario(inventario))) {
                this.rst = this.pst.getGeneratedKeys();

                if (this.rst.next()) {
                    pasteles.setId_inventario(this.rst.getInt(1));

                    this.insertar(SQL.insertPastel1(pasteles));

                }//Cierra el segundo if   

            }//Cierra el primer if           
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar: " + e.getMessage());
            return false;
        }

    }
        public int idGenerado() {
        int idAux = 0;
        try {

            this.rst = this.pst.getGeneratedKeys();
            if (this.rst.next()) {
                idAux = this.rst.getInt(1);

            }
        } catch (SQLException e) {
            System.out.println("error " + e.getMessage());
        }

        return idAux;
    }

   

}//cierra la public class CRUD

