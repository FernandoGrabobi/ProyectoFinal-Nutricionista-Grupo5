
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
    
    
    
}
