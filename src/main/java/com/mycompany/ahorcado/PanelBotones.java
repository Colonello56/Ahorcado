package com.mycompany.ahorcado;
    
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

class PanelBotones extends JPanel{
    
    private JButton nuevoJuego;
    private JButton mostrarPista;
    
    public PanelBotones(){
        this.initComponents();
    }
    
    private void initComponents(){
        
        BoxLayout distribucion = new BoxLayout(this,2);
        this.setLayout(distribucion);
        
        this.nuevoJuego = new JButton("Nuevo Juego");
        this.add(nuevoJuego);
        
        this.mostrarPista = new JButton("Mostrar Pista");
        this.add(mostrarPista);
        
    }
    
}
