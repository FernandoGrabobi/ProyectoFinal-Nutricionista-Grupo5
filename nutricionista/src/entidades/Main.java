package entidades;

import java.util.Date;
import javax.swing.JInternalFrame;
import nutricionistaVista.FormularioVista;

 public static void main(String[] args) {
        // Crear el JFrame principal
        JFrame mainFrame = new JFrame("Prueba de JInternalFrame");
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null); // Centrar la ventana

        // Crear el JDesktopPane y añadirlo al JFrame
        JDesktopPane desktopPane = new JDesktopPane();
        mainFrame.setContentPane(desktopPane);

        // Crear una instancia del JInternalFrame que quieres probar
        FormularioVista internalFrame = new FormularioVista();
        
        // Añadir el JInternalFrame al JDesktopPane
        desktopPane.add(internalFrame);

        // Mostrar el JInternalFrame
        internalFrame.setVisible(true);

        // Mostrar el JFrame principal
        mainFrame.setVisible(true);
    }
}

// Clase JInternalFrame que quieres probar
class FormularioVista extends JInternalFrame {
    public FormularioVista() {
        setTitle("Formulario de Prueba");
        setSize(300, 200);
        setClosable(true);
        setResizable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

