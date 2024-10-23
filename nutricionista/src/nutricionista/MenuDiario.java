
package nutricionista;

import java.util.ArrayList;

public class MenuDiario {
    
    private String codMenu;
    private int dia;
    private double caloriasDelMenu;
    private ArrayList<RenglonMenu> renglones;
    private String estado;

    public MenuDiario(String codMenu, int dia) {
        this.codMenu = codMenu;
        this.dia = dia;
        this.renglones = new ArrayList<>();
        this.caloriasDelMenu = 0.0; //inicia en cero
        this.estado = "Activado"; //inicia el estado
    }

    public String getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(String codMenu) {
        this.codMenu = codMenu;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getCaloriasDelMenu() {
        return caloriasDelMenu;
    }

    public void setCaloriasDelMenu(double caloriasDelMenu) {
        this.caloriasDelMenu = caloriasDelMenu;
    }

    public ArrayList<RenglonMenu> getRenglones() {
        return renglones;
    }

    public void setRenglones(ArrayList<RenglonMenu> renglones) {
        this.renglones = renglones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    /*FUNCIONES*/

    public void alterarDietaDiaria(double caloriasCambio){
        this.caloriasDelMenu += caloriasCambio;
        for(RenglonMenu renglon : renglones){
            int calorasCambio = 0;
            renglon.setSubtotalCalorias(renglon.getSubtotalCalorias() + (calorasCambio / renglones.size()));
        }
    }

    public MenuDiario generarDietaDiaria(){
        MenuDiario dietaGenerada = new MenuDiario(this.codMenu, this.dia);
        for(RenglonMenu renglon : renglones){
            dietaGenerada.addRenglon(renglon);
        }
        dietaGenerada.calcularCaloriasDelMenu();
        return dietaGenerada;
    }

    public MenuDiario armarDietaDiaria(ArrayList<RenglonMenu> nuevosRenglones){
        this.renglones.clear();
        this.renglones.addAll(nuevosRenglones);
        calcularCaloriasDelMenu();
        return null;
    }

    public void addRenglon(RenglonMenu renglon){
        this.renglones.add(renglon);
        calcularCaloriasDelMenu();
    }
    
    private void calcularCaloriasDelMenu(){
        double totalCalorias = 0;
        for(RenglonMenu renglon : renglones){
            totalCalorias += renglon.getSubtotalCalorias();
        }
        this.caloriasDelMenu = totalCalorias;
    }

    
}
