
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
        this.subtotalCalorias = calcularSubTotalCalorias();
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
        this.subtotalCalorias = calcularSubTotalCalorias(); // deberia cambiar el total de calorias si se cambia la cantidad de alimento
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
        this.subtotalCalorias = calcularSubTotalCalorias();//deberia
    }

    public double getSubtotalCalorias() {
        return subtotalCalorias;
    }

    public void setSubtotalCalorias(double subtotalCalorias) {
        this.subtotalCalorias = subtotalCalorias;
    }
    

    /*FUNCIONES*/

    public void modificarRenglon(double nuevaCantidad, Alimento nuevoAlimento){
        setCantidad(nuevaCantidad);
        setAlimento(nuevoAlimento);
    }

    public void imprimirRenglon(){
        System.out.println("Nombre: "+alimento.getNombre()+" - Renglon: "+nroRenglon+" - Cantidad: "+cantidad+" - Calorias: "+subtotalCalorias);

    }

    public void addAlimento(Alimento nuevoAlimento){
        setAlimento(nuevoAlimento);
    }
    
    private double calcularSubTotalCalorias(){
        return (alimento.getCaloriasPorPorcion() / 100)*cantidad;
    }
}
