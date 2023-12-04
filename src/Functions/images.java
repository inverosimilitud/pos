package Functions;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class images {
    public void cargarImagen_menuItem(JMenuItem JMenuItem, String nombre_icono) {
        // Obtiene la URL de la imagen a través del classloader
        URL url = getClass().getClassLoader().getResource("images/" + nombre_icono);

        // Crea un ImageIcon a partir de la URL obtenida
        ImageIcon icono = new ImageIcon(url);

        // Redimensiona el icono al tamaño deseado
        Image imagen = icono.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagen);
        
        // Ponemos el icono en el jmenuitem
        JMenuItem.setIcon(iconoRedimensionado);
    }
    
    public void cargarImagen_menu(JMenu JMenu, String nombre_icono) {
        // Obtiene la URL de la imagen a través del classloader
        URL url = getClass().getClassLoader().getResource("images/" + nombre_icono);

        // Crea un ImageIcon a partir de la URL obtenida
        ImageIcon icono = new ImageIcon(url);

        // Redimensiona el icono al tamaño deseado
        Image imagen = icono.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagen);
        
        // Ponemos el icono en el jmenuitem
        JMenu.setIcon(iconoRedimensionado);
    }
    
    
}