
package conexion;

import entidades.Dieta;
import entidades.MenuDiario;
import entidades.RenglonMenu;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import entidades.Paciente;

public class MenuDiarioData {
    
    private Connection con = null;
    Paciente paciente = new Paciente();
    
    public MenuDiarioData() {
        con = Conexion.getConexion();
    }
    
    public void agregarMenuDiario(MenuDiario menudiario) {
    String sql = "INSERT INTO menu_diario (codMenu, dia) VALUES (?, ?)";

    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setInt(1, menudiario.getCodMenu());
        ps.setInt(2, menudiario.getDia());
       
   

        ps.executeUpdate();

        // Obtener el ID generado para codMenu y asignarlo al objeto MenuDiario
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            menudiario.setCodMenu(rs.getInt(1));
        }

        // Guardar los renglones 
        for (RenglonMenu renglon : menudiario.getRenglones()) {
            RenglonMenuData renglonMenuData = new RenglonMenuData();
            renglonMenuData.agregarRenglon(renglon,paciente);  
        }

        JOptionPane.showMessageDialog(null, "Menú diario agregado con éxito.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al agregar menú diario: " + e.getMessage());
    }
}

    
}
