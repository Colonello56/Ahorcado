package com.mycompany.ahorcado;
    
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JPanel;

class Palabra extends JPanel{
    int x = 0;
    private ArrayList palabras;
    private TextField txt;
    
    public Palabra(){
        ArrayList<String> palabras = new ArrayList();
        palabras.add("U N I V E R S I D A D");
        this.initComponents();
    }
    
    private void initComponents(){
        
        GridLayout distribucion = new GridLayout(1,0);
        this.setLayout(distribucion);
    }
    
    public void generarPanel(){
        String parts[] = "U N I V E R S I D A D".split(" ");
        
        for (int i = 0; i < parts.length; i++) {
            this.add(txt = new TextField(parts[i]));
            txt.setVisible(true);
        }
        
    }
    
}
