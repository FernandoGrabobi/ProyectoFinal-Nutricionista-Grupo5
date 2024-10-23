
package nutricionista;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Alimento {
    
    private String codComida;
    private String nombre;
    private double caloriasPorPorcion; // por 100g
    private String problemaAlimenticio; //celiaco, etc.
    private String tipo; // desayuno, merienda, etc.
    private String detalle; // descripción breve

    public Alimento(String codComida, String nombre, double caloriasPorPorcion, String tipo, String detalle, String problemaAlimenticio) {
        this.codComida = codComida;
        this.nombre = nombre;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.tipo = tipo;
        this.detalle = detalle;
        this.problemaAlimenticio = problemaAlimenticio;
    }

    public String getCodComida() {
        return codComida;
    }

    public void setCodComida(String codComida) {
        this.codComida = codComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }

    public void setCaloriasPorPorcion(double caloriasPorPorcion) {
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
    /*FUNCIONES*/

    public static List<Alimento> filtrarXIngred(List<Alimento> lista, String ingredientes){
        List<Alimento> filtrados = new ArrayList<>();
        for(Alimento alimento : lista){
            if(alimento.getDetalle().toLowerCase().contains(ingredientes.toLowerCase())){
                filtrados.add(alimento);
            }
        }
        
        return filtrados;
    }

    public List<Alimento> filtrarNombre(List<Alimento> lista, String nombre){
        List<Alimento> filtrados = new ArrayList<>();
        for(Alimento alimento : lista){
            if(alimento.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                filtrados.add(alimento);
            }
        }
        return filtrados;
    }


    public static List<Alimento> filtrarXCalorias(List<Alimento> lista, double maxCalorias) {
        List<Alimento> filtrados = new ArrayList<>();
        for (Alimento alimento : lista) {
            if (alimento.getCaloriasPorPorcion() <= maxCalorias) {
                filtrados.add(alimento);
            }
        }
        return filtrados;
    }

    public void modificarAlimento(String nuevoNombre, double nuevasCalorias, String nuevoTipo, String nuevoDetalle, String nuevoProblema) {
        this.nombre = nuevoNombre;
        this.caloriasPorPorcion = nuevasCalorias;
        this.tipo = nuevoTipo;
        this.detalle = nuevoDetalle;
        this.problemaAlimenticio = nuevoProblema;
    }



}
