package conexion;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PacienteData {
    
    private Connection con = null;
    
    public PacienteData(){
        con = Conexion.getConexion();
    }
    
    //agregar un paciente
    public void agregarPaciente(Paciente paciente){
        String sql = "INSERT INTO `paciente`(nombre, apellido, edad, altura, pesoActual, pesoBuscado, sexo, condicionEspecial) VALUES"
                + " (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getEdad());
            ps.setInt(4, paciente.getAltura());
            ps.setFloat(5, paciente.getPesoActual());
            ps.setFloat(6, paciente.getPesoBuscado());
            ps.setString(7, paciente.getSexo());
            ps.setString(8, paciente.getCondicionEspecial());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                paciente.setNroPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null," - Paciente añadido con exito.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla paciente "+ex.getMessage());
        }
                      
        
       
    }



}
