
package entidades;

import java.util.ArrayList;

public class MenuDiario {
    
    private int codMenu;
    private int dia;
    private double caloriasDelMenu;
    private ArrayList<RenglonMenu> renglones;
    private String estado;
    private Dieta dieta;

    public MenuDiario(int codMenu, int dia, double caloriasDelMenu, ArrayList<RenglonMenu> renglones, String estado, Dieta dieta) {
        this.codMenu = codMenu;
        this.dia = dia;
        this.caloriasDelMenu = caloriasDelMenu;
        this.renglones = renglones;
        this.estado = estado;
        this.dieta = dieta;
    }


    
    public int getCodMenu() {
        return codMenu;
    }

    public void setCodMenu(int codMenu) {
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

   /* public MenuDiario generarDietaDiaria(){
        MenuDiario dietaGenerada = new MenuDiario(this.codMenu, this.dia);
        for(RenglonMenu renglon : renglones){
            dietaGenerada.addRenglon(renglon);
        }
        dietaGenerada.calcularCaloriasDelMenu();
        return dietaGenerada;
    }*/

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
