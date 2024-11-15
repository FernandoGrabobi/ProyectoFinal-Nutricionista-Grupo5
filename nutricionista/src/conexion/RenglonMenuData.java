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

public class RenglonMenuData {
    
    private Connection con = null;
    private List<RenglonMenu> renglonesParaMenu = new ArrayList<>();
    private List<MenuDiario> menusParaDieta = new ArrayList<>();
    private int contadorDia = 1;
    Date fechaInicio = new Date();
    Date fechaFin = new Date();
    
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

    if(menusParaDieta.size() <= 5){
        if (renglonesParaMenu.size() == 5) {

           MenuDiario nuevoMenu = new MenuDiario(contadorDia, new ArrayList<>(renglonesParaMenu), paciente);

           contadorDia++;  
           renglonesParaMenu.clear();
           JOptionPane.showMessageDialog(null, "MenuDiario añadido con exito");
           menusParaDieta.add(nuevoMenu);

       }
    }else{
        JOptionPane.showMessageDialog(null, " Ya se cargaron los 5 MenusDiarios");
        Dieta nuevaDieta = new Dieta(paciente.getNombre(),fechaInicio, fechaFin,paciente, paciente.getPesoActual(),paciente.getPesoBuscado() , (ArrayList<MenuDiario>) menusParaDieta,true);
    }
   
    
}
    

    
}
