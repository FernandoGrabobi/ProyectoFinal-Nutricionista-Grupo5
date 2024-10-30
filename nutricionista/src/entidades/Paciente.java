
package entidades;

public class Paciente {
    
    private String nombreCompleto;
    private int edad;
    private double altura; // en metros
    private String sexo;
    private double pesoActual; // en kg
    private double pesoBuscado; // en kg
    private String condicionEspecial;
   

    public Paciente(String nombreCompleto, int edad, double altura, String sexo,double pesoActual, double pesoBuscado, String condicionEspecial) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.altura = altura;
        this.sexo = sexo;
        this.pesoActual = pesoActual;
        this.pesoBuscado = pesoBuscado;
        this.condicionEspecial = condicionEspecial;
        
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        /// hay que hacer el arraylist de tipo paciente para mostrar los pacientes que llegaron al peso
        System.out.println("Nombre Completo: "+nombreCompleto);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+altura);
        System.out.println("sexo: "+sexo);
        System.out.println("Peso Actual: "+pesoActual);
        System.out.println("Peso Buscado: "+pesoBuscado);
        System.out.println("Condicion especial: "+condicionEspecial);
    }
    
}
