package conexion;

import entidades.Dieta;
import entidades.MenuDiario;
import entidades.Paciente;
import entidades.RenglonMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import nutricionistaVista.menuDiariosYDieta;

public class RenglonMenuData {
    
    private Connection con = null;
    private List<RenglonMenu> renglonesParaMenu = new ArrayList<>();
    private List<MenuDiario> menusParaDieta = new ArrayList<>();
    private int contadorDia = 1;
    Date fechaInicio = new Date();
    Date fechaFin = new Date();
    menuDiariosYDieta vistaMenuDiarios = new menuDiariosYDieta();
    
    
    public RenglonMenuData() {
        con = Conexion.getConexion();
    }
    
    public void agregarRenglon(RenglonMenu renglonmenu, Paciente paciente){
        String sql = "INSERT INTO `renglonmenu`(nroRenglon, alimento_id , cantidad, subtotalCalorias) VALUES"
                + " (?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, renglonmenu.getNroRenglon());
            ps.setInt(2, renglonmenu.getAlimento().getCodComida());
            ps.setInt(3, renglonmenu.getCantidad());
            ps.setInt(4, renglonmenu.getSubtotalCalorias());
        
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                renglonmenu.setIdRenglon(rs.getInt(1));
            }
            ps.close();
            
            agregarAlArray(renglonmenu,paciente);        
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla renglonMenu "+ex.getMessage());
        }                   
    }    
    

    public void agregarAlArray(RenglonMenu renglonmenu, Paciente paciente) {
       renglonesParaMenu.add(renglonmenu);
       
       if (renglonesParaMenu.size() == 4) {
           MenuDiario nuevoMenu = new MenuDiario(contadorDia, new ArrayList<>(renglonesParaMenu), paciente);
           menusParaDieta.add(nuevoMenu);
           contadorDia++;
           renglonesParaMenu.clear();

           JOptionPane.showMessageDialog(null, "Menú cargado correctamente para el día " + (contadorDia - 1));
           vistaMenuDiarios.cargarMenusEnTextFields(menusParaDieta); 
       } else {
           JOptionPane.showMessageDialog(null, "Faltan " + (5 - renglonesParaMenu.size()) + " renglones para completar el menú.");
       }

       if (menusParaDieta.size() >= 5) {
           JOptionPane.showMessageDialog(null, "Ya se cargaron los 5 MenusDiarios.");
       }
   }

    
    
}
