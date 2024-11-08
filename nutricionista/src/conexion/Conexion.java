
package conexion;

import java.sql.*;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;



public class Conexion {

    public static void main(String[] args) {
        
        try{
            //1- Crear conexion
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/nutricionista_2024","root" , "");
        
            //2- Crear objeto Statement.
            Statement miStatement = conexion.createStatement();
            
            //3- Ejecutar SQL
            
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PACIENTE");
            
            //4- Recorred el ResultSet
                    
            while (miResultSet.next()){
            
                System.out.println(miResultSet.getString("NOMBRE") + " " + miResultSet.getString("EDAD"));
                
            }
            
            
        } catch (Exception e){
        
            System.out.println("Hubo un error al conectar con la base de datos");
            
            e.printStackTrace();
        }
        
        
        
    }
    
}
