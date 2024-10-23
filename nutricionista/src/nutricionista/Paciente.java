
package nutricionista;

public class Paciente {
    
    private String nombreCompleto;
    private int edad;
    private double altura; // en metros
    private double pesoActual; // en kg
    private double pesoBuscado; // en kg

    public Paciente(String nombreCompleto, int edad, double altura, double pesoActual, double pesoBuscado) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.altura = altura;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }
    

    /*FUNCIONES*/

    public void cambiarPesoDeseado(double nuevoPesoBuscado){
        this.pesoBuscado = nuevoPesoBuscado;
    }

    public void actualizarPesoAct(double nuevoPesoAct){
        this.pesoActual = nuevoPesoAct;
    }

    public boolean seAcercaAlPeso(){
        double diferencia = Math.abs(this.pesoBuscado - this.pesoActual);
        return diferencia <= 1.0;
    }

    public void listarLosQueLlegaron(){
        System.out.println("Nombre Completo: "+nombreCompleto);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("Peso Actual: "+pesoActual);
        System.out.println("Peso Buscado: "+pesoBuscado);
    }
    
}
