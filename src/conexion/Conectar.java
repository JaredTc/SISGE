
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conectar {
     public static Connection conectar = null;
    public static Statement sentencia;
    public static ResultSet resultado;
    public static Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //sisge
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_escolar", "root", "");
//    Conexion a db remoto    conectar = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/czpqAQRyNT", "czpqAQRyNT", "oRmnwemJyD");

            sentencia = conectar.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conectar;
    }
    
}
