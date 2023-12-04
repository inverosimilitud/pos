package Functions;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class gridBagConstrints{
    
    public static GridBagConstraints modificar_posición(int gridx, int gridy, int inset_top,
            int inset_left, int inset_bottom, int inset_right,  int gridwidth, int gridheight,
            int ipady, int ipadx, double weightx, double weighty, int GbcPosicion){
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = gridx; //columna posición   
        gbc.gridy = gridy; //fila posición
        gbc.fill = GridBagConstraints.BOTH; //cómo se estira el componente para rellenar su espacio designado
        gbc.insets = new Insets(inset_top, inset_left, inset_bottom, inset_right); //espacio al rededor del componente
        gbc.ipadx = ipadx; //tamaño horizontal mínimo
        gbc.ipady = ipady; //tamaño vertical mínimo
        gbc.gridwidth = gridwidth; //columnas que utilizará el componente horizontalmente
        gbc.gridheight = gridheight; //columnas que utilizará el componente verticalmente
        gbc.weightx = weightx; //peso de casilla horizontalmente
        gbc.weighty = weighty; //peso de casilla verticalmente
        gbc.anchor = GbcPosicion; // posición del componente dentro de su celda
        return gbc;
    }
    
}