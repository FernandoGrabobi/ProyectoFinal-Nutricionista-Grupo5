package conexion;

import java.sql.*;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

public class Conexion {

    private static final String DATABASE_URL = "jdbc:mariadb://";
    private static final String DATABASE_HOST = "localhost";
    private static final String DATABASE_PUERTO = ":3306";
    private static final String DATABASE_DB = "/nutricionista_2024";
    private static final String DATABASE_USUARIO = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Conexion conexion = null;
    private static Connection con = null;

    private Conexion() {
        try {
            // Cargar drivers
            Class.forName("org.mariadb.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver" + ex);
        }
    }

    public static Connection getConexion() {
        if (con == null) {
            conexion = new Conexion();

            try {
                con = (Connection) DriverManager.getConnection(
                        DATABASE_URL
                        + DATABASE_HOST
                        + DATABASE_PUERTO
                        + DATABASE_DB
                        + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user="
                        + DATABASE_USUARIO
                        + "&password="
                        + DATABASE_PASSWORD
                );

                Statement miStatement = con.createStatement();
                ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM PACIENTE");

                System.out.println("Conectado");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return con;
    }

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
    }
}
