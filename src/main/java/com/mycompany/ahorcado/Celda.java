package com.mycompany.ahorcado;
    
import javax.swing.JButton;

class Celda {
    private boolean esCorrecta;
    private JButton btn;
    
    public Celda(String a){
        this.btn = new JButton(a);
    }
    
    public JButton getBtn(){
        return btn;
    }
    
    public void setBtn(JButton btn){
        this.btn = btn;
    }
}
