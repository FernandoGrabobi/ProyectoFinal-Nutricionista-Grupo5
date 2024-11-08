package conexion;

import java.sql.Connection;

public class PacienteData {
    
    private Connection con = null;
    
    public PacienteData(){
        con = Conexion.getConexion();
    }
    
    //agregar un paciente
    public void agregarPaciente(){
        String sql = "INSERT INTO paciente(nombre, edad, altura, pesoActual, pesoBuscado, sexo, condicionEspecial)"
                + "VALUES ("luciano",23,1.80,84,78,"Masculino","Diabetico")";
    }



}
