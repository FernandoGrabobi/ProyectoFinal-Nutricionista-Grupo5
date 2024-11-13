
package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlimentoData {
    
    private Connection con = null;
    
    public AlimentoData(){
        con = Conexion.getConexion();
    }
    
    public List<String> obtenerAlimentos() {
      List<String> alimentos = new ArrayList<>();
      String query = "SELECT nombre FROM alimento";

      try (PreparedStatement stmt = Conexion.getConexion().prepareStatement(query);
           ResultSet rs = stmt.executeQuery()) {

          while (rs.next()) {
              alimentos.add(rs.getString("nombre"));
          }
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Error al obtener alimentos: " + e.getMessage());
      }

      return alimentos;
  }

}
