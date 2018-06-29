/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_interfgrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Estudiante
 */
public class PanelInicial extends JPanel
{
    private ArrayList<JPanel> jPanelList;
    
    public PanelInicial()
    {
        this.iniciarPanelInicial();
    }
    
    public void iniciarPanelInicial()
    {
        this.setBackground(Color.BLUE);
        GridLayout gLayout = new GridLayout(2,2,1,1);
        this.setLayout(gLayout);
        
        this.crearJPanelList();
    }
    
    public void crearJPanelList(){
       

}
    }
    