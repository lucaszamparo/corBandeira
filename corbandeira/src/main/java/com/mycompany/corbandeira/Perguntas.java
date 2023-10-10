package com.mycompany.corbandeira;

import javax.swing.JOptionPane;

public class Perguntas {
    
    public String perguntaVermelho(){
        return JOptionPane.showInputDialog("1. A bandeira tem cor vermelho? S/N");
    }
    
    public String perguntaAzul(){
        return JOptionPane.showInputDialog("2 A bandeira tem cor azul? S/N");
    }
    
    public String perguntaVerde(){
        return JOptionPane.showInputDialog("3. A bandeira tem cor verde? S/N");
    }
    
    public String perguntaBranco(){
        return JOptionPane.showInputDialog("4. A bandeira tem cor branco? S/N");
    }
    
    public String perguntaAmarelo(){
        return JOptionPane.showInputDialog("5. A bandeira tem cor amarelo? S/N");
    }
}
