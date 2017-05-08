package com.mycompany.ahorcado;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;

public class VentanaContenedora extends JFrame{
    private PanelBotones panelBotones;
    private PanelTablero panelTablero;
    private Palabra panelPalabras;
    
    public VentanaContenedora(){
        this.initComponents();
    }
    
    private void initComponents(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 400);
        
        this.setLocation(150, 300);
        this.setTitle("Ahorcado");
        
        this.panelBotones = new PanelBotones();
        this.panelTablero = new PanelTablero();
        this.panelTablero.generarTablero();
        this.panelPalabras = new Palabra();
        this.panelPalabras.generarPanel();
        
        this.add(this.panelBotones, BorderLayout.SOUTH);
        this.add(this.panelTablero, BorderLayout.CENTER);
        this.add(this.panelPalabras, BorderLayout.NORTH);
        
        this.setVisible(true);
        
        
    }
    
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, null);
}
}
