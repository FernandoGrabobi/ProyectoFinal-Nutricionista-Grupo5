
package entidades;

import java.util.ArrayList;

public class MenuDiario {
    
    private int codMenu;
    private int dia;
    private ArrayList<RenglonMenu> renglones;
    private Paciente paciente;
   

    public MenuDiario( int dia, ArrayList<RenglonMenu> renglones, Paciente paciente) {
        this.dia = dia;
        this.renglones = renglones;
        this.paciente = paciente;
    }


    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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

    public ArrayList<RenglonMenu> getRenglones() {
        return renglones;
    }

    public void setRenglones(ArrayList<RenglonMenu> renglones) {
        this.renglones = renglones;
    }


}
