/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_interfgrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Estudiante
 */
public class Ventana extends JFrame implements ActionListener{

    
    private PanelInicial unPanelInicial;
    private JMenuBar barraMenu;
    private JMenu menuPersonas;
    private JMenu menuEditar;
    private JMenu menuVer;
    private JMenuItem menuItem;
    private JMenuItem menuItem1;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenuItem menuItem7;
  
    
    
    public Ventana(String t, int an, int al, int x, int y)
    {
        this.iniciarVentana(t, an, al, x, y);
    }
    
    public void iniciarVentana(String t, int an, int al, int x, int y)
    {
        this.setTitle(t);
        this.setSize(an, al);
        this.setLocation(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        unPanelInicial= new PanelInicial();
        this.add(unPanelInicial);
        this.iniciarMenu();
        this.setJMenuBar(this.barraMenu);
        
        this.setVisible(true);
    }
    
    public void iniciarMenu()
    {
        this.barraMenu= new JMenuBar();
        this.menuItem = new JMenuItem("Ingresar");
        this.menuItem1 = new JMenuItem("Ver");
        this.menuItem5 = new JMenuItem("Salir");
        this.menuItem6 = new JMenuItem("Importar desde Ecplise");
        this.menuItem7 = new JMenuItem("Sincronizar Proyectos");
        this.menuPersonas = new JMenu("Personas");
        this.menuEditar = new JMenu("Editar");
        this.menuVer = new JMenu("Ver",false);
        this.barraMenu.add(this.menuPersonas);
        this.barraMenu.add(this.menuEditar);
        this.barraMenu.add(this.menuVer);
        
        menuPersonas.add(this.menuItem);
        menuPersonas.add(this.menuItem1);
        menuPersonas.add(menuItem5);
        menuItem.addActionListener(this);
    }

    public PanelInicial getUnPanelInicial() {
        return unPanelInicial;
    }

    public void setUnPanelInicial(PanelInicial unPanelInicial) {
        this.unPanelInicial = unPanelInicial;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.getMenuItem()==ae.getSource()){
            
            VentanaPersona vP = new VentanaPersona();
            vP.iniciarVentanaPersona();
            this.getContentPane().add(vP);
    }
        
        
    
    
}

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JMenu getMenuPersonas() {
        return menuPersonas;
    }

    public void setMenuPersonas(JMenu menuPersonas) {
        this.menuPersonas = menuPersonas;
    }

    public JMenu getMenuEditar() {
        return menuEditar;
    }

    public void setMenuEditar(JMenu menuEditar) {
        this.menuEditar = menuEditar;
    }

    public JMenu getMenuVer() {
        return menuVer;
    }

    public void setMenuVer(JMenu menuVer) {
        this.menuVer = menuVer;
    }

    public JMenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(JMenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public JMenuItem getMenuItem1() {
        return menuItem1;
    }

    public void setMenuItem1(JMenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public JMenuItem getMenuItem5() {
        return menuItem5;
    }

    public void setMenuItem5(JMenuItem menuItem5) {
        this.menuItem5 = menuItem5;
    }

    public JMenuItem getMenuItem6() {
        return menuItem6;
    }

    public void setMenuItem6(JMenuItem menuItem6) {
        this.menuItem6 = menuItem6;
    }

    public JMenuItem getMenuItem7() {
        return menuItem7;
    }

    public void setMenuItem7(JMenuItem menuItem7) {
        this.menuItem7 = menuItem7;
    }
    }
