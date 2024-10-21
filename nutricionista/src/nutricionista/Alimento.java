
package nutricionista;

public class Alimento {
    
    private String codComida;
    private String nombre;
    private double caloriasPorPorcion; // por 100g
    private String tipo; // desayuno, merienda, etc.
    private String detalle; // descripción breve

    public Alimento(String codComida, String nombre, double caloriasPorPorcion, String tipo, String detalle) {
        this.codComida = codComida;
        this.nombre = nombre;
        this.caloriasPorPorcion = caloriasPorPorcion;
        this.tipo = tipo;
        this.detalle = detalle;
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

    public List<Alimento> filtrarXIngred(int){

    }

    public List<Alimento> filtrarNombre(String){

    }

    public List<Alimento> filtrarxCalorias100(int){

    }

    public void modificarAlimento(Alimento){

    }



}
