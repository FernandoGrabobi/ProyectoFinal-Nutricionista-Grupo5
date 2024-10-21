
package nutricionista;

public class RenglonMenu {
    
    private int nroRenglon;
    private Alimento alimento;
    private double cantidad; // en gramos
    private double subtotalCalorias;

    public RenglonMenu(int nroRenglon, Alimento alimento, double cantidad) {
        this.nroRenglon = nroRenglon;
        this.alimento = alimento;
        this.cantidad = cantidad;
        this.subtotalCalorias = (alimento.getCaloriasPorPorcion() / 100) * cantidad;
    }

    public int getNroRenglon() {
        return nroRenglon;
    }

    public void setNroRenglon(int nroRenglon) {
        this.nroRenglon = nroRenglon;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(double subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }
    

    /*FUNCIONES*/

    public void modificarRenglon(){

    }

    public void imprimirRenglon(){

    }

    public void addAlimento(){

    }
    
}
