package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexion {
    
    private conexion(){ 
    
        try {
    
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc.mysql://localhost:3306/nutricionista_2024", "root", "");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase conexión: error al cargar el driver"+ ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Clase conexión: error al conectarse a la bs"+ ex.getMessage());
        }
    }
}
