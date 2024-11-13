
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
    
    public int obtenerCaloriasPor100g(String nombreAlimento) {
        String query = "SELECT caloriasPor100g FROM alimento WHERE nombre = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nombreAlimento);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getInt("caloriasPor100g");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener calorías: " + e.getMessage());
        }
        return 0; // Retornar 0 si no se encuentran las calorías
    }


}
