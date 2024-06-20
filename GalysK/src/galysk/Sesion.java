package galysk;

import Basedatos.Conexion;
import InterfazUsuario.Login;
import InterfazUsuario.MenuGaly;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.UIManager;

public class Sesion {

    public void consultarUsuario(String user, String pass) {

        Conexion db = new Conexion();

        String nombre_usuario = null;
        String contraseña = null;
        try {

            Connection cn = db.iniciar();
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("SELECT nombre_usuario , contraseña FROM usuario");
            ResultSet rs = pst.executeQuery();

            boolean usuarioEncontrado = false;

            while (rs.next()) {
                nombre_usuario = rs.getString(1);
                contraseña = rs.getString(2);

                if (user.equals(nombre_usuario) && pass.equals(contraseña)) {
                    usuarioEncontrado = true;
                    break;
                }
            }

            if (usuarioEncontrado) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + user);

                //abre la ventana de menu
                MenuGaly menu = new MenuGaly();
                menu.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

            }

        } catch (Exception e) {

            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * TEMAS: AcrylLookAndFeel AeroLookAndFeel AluminiumLookAndFeel
         * BernsteinLookAndFeel FastLookAndFeel HiFiLookAndFeel McWinLookAndFeel
         * MintLookAndFeel NoireLookAndFeel SmartLookAndFeel LunaLookAndFeel
         * TextureLookAndFeel McWinLookAndFeel SmartLookAndFeel AcrylLookAndFeel
         * TextureLookAndFeel MintLookAndFeel AcrylLookAndFeel
         */

        try {
            UIManager.setLookAndFeel(new MintLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        Conexion.iniciar();

        if (Conexion.conexion != null) {

            Login menu = new Login();
            menu.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(null, "DESCONECTADO DE LA BASE DE DATOS");

        }

    }// cierra main

}
