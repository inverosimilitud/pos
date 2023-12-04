
package pdv_update;

import Ventanas.login;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Pdv_update {
    public static void main(String[] args) {
        login principal = new login();
        Dimension d = new Dimension(250, 320);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setTitle("Inicio de sesión"); //cambia el titulo de la ventana
        principal.setSize(d);
        principal.setLocationRelativeTo(null); //centra la ventana en la pantalla}
        principal.setVisible(true);
        principal.setResizable(false);
    }
    
}
