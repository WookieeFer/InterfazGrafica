
package deber_interfgrafica;

import javax.swing.JComboBox;
import javax.swing.JInternalFrame;


public class VentanaPersona extends JInternalFrame{
    private JComboBox combo;
    
    public void iniciarVentanaPersona(){
        String [] datos = new String [5];
        datos[0]="Juan";
        datos[1]="Victor";
        datos[2]="Pablo";
        datos[3]="Crisitan";
        datos[4]="Wilson";
        combo= new JComboBox(datos);
        
        this.setTitle("Ventana Interna");
        this.setSize(200, 100);
        this.setClosable(true);
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.getContentPane().add(combo);
        this.setVisible(true);     
    }
}