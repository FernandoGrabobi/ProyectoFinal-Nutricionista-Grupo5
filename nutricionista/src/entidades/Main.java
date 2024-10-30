package entidades;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Crear comida
        Alimento alimento1 = new Alimento("A001", "Manzana", 52, "Desayuno", "Fruta Fresca", null);
        Alimento alimento2 = new Alimento("A002", "Pollo a la plancha", 165, "Almuerzo", "Proteina magra", "Diabetico");
        
        System.out.println("Alimentos creados:");
        System.out.println("Codigo: "+alimento1.getCodComida()+", Calorias: "+alimento1.getCaloriasPorPorcion()+
                "kcal, Tipo: "+alimento1.getTipo()+", Detalle: "+alimento1.getDetalle());
        System.out.println("Codigo: "+alimento2.getCodComida()+", Calorias: "+alimento2.getCaloriasPorPorcion()+
                "kcal, Tipo: "+alimento2.getTipo()+", Detalle: "+alimento2.getDetalle());
    
    //Crear pacinte
    //Paciente paciente = new Paciente("Ana Lopez", 30, 1.65, 70.0, 65.0);
        System.out.println("");
        System.out.println("Paciente creado: ");
       // paciente.listarLosQueLlegaron();
        
        //Crear menu diario
        MenuDiario menuDiario = new MenuDiario("M001", 1);
        menuDiario.setCaloriasDelMenu(0);//inicia siempre en cero
        
        //crear renglones
        RenglonMenu renglon1 = new RenglonMenu(1, alimento1, 150);
        RenglonMenu renglon2 = new RenglonMenu(2, alimento2, 200);
        
        menuDiario.addRenglon(renglon1);
        menuDiario.addRenglon(renglon2);
        
        //Calcular las calorias
        for(RenglonMenu renglon : menuDiario.getRenglones()){
            menuDiario.setCaloriasDelMenu(menuDiario.getCaloriasDelMenu()+ renglon.getSubtotalCalorias());
            
        }
        
        //imprimir menu
        System.out.println("");
        System.out.println("Menu Diario creado: ");
        System.out.println("Codigo del menu: "+menuDiario.getCodMenu()+" Calorias: "+menuDiario.getCaloriasDelMenu()+"kcal, Dia: "+menuDiario.getDia());
    
        //Crear dieta
        //Dieta dieta = new Dieta("D001", "Perder peso", new Date(), new Date(), paciente, 80.0, 75.0, menuDiario.getCaloriasDelMenu());
        //dieta.getMenus().add(menuDiario);
        
        //imprimir dieta
        System.out.println("");
        System.out.println("Dieta creada: ");
       // System.out.println("Codigo de dieta: "+dieta.getCodDieta()+" Nombre: "+dieta.getNombre()+" Paciente: "+dieta.getPaciente().getNombreCompleto());
       // System.out.println("Peso Inicial: "+dieta.getPesoInicial()+"kilos, Peso Final: "+dieta.getPesoFinal()+"kilos, Calorias: "+dieta.getCaloriasTotal()+"kcal");
        
    }
    
}
