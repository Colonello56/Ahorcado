package com.mycompany.ahorcado;
    
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

class PanelTablero extends JPanel{
    
    int nFilas = 4;
    int nCol = 7;
    private Celda[][] casillas;
    private ArrayList letras;
    
    public PanelTablero(){
        this.letras = new ArrayList();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        letras.add('D');
        this.initComponents();
    }
    
    private void initComponents(){
        this.casillas = new Celda[nFilas][nCol];
        
        GridLayout distribucion = new GridLayout(this.nFilas, this.nCol);
        this.setLayout(distribucion);
    }
    
    public void generarTablero() {

        int a = 0;
        for (int i = 0; i < this.nFilas; i++) {
            for (int j = 0; j < this.nCol; j++) {
                this.casillas[i][j] = new Celda((letras.get(a)).toString());
                this.casillas[i][j].getBtn().setBackground(Color.GREEN);
                this.add(this.casillas[i][j].getBtn());
                this.casillas[i][j].getBtn().addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                    }
                });
                a++;
            }
        }
    }
}
