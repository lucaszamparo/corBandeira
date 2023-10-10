/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corbandeira;

import javax.swing.JOptionPane;

public class Bandeira {    
    public String descobrirPais(String corVermelho,String corAzul,String corVerde,String corBranco,String corAmarelo){
        //Chile
        if(corVermelho.equals("S") && corAzul.equals("S") && corBranco.equals("S")){
            JOptionPane.showMessageDialog(null, "Chile");
        
        //México
        } else if(corVerde.equals("S") && corBranco.equals("S") && corVermelho.equals("S")){
            JOptionPane.showMessageDialog(null, "México");
        
        //Colômbia
        } else if(corAmarelo.equals("S") && corAzul.equals("S") && corVermelho.equals("S")){
            JOptionPane.showMessageDialog(null, "Colômbia");
        
        //Argentina
        } else if(corAzul.equals("S") && corBranco.equals("S") && corAmarelo.equals("S") &&corVerde.equals("N")){
            JOptionPane.showMessageDialog(null, "Argentina");
        
        //Brasil
        } else if(corVerde.equals("S") && corAzul.equals("S") && corAmarelo.equals("S") && corBranco.equals("S")){
            JOptionPane.showMessageDialog(null, "Brasil");
        
        //Pais Invalido
        } else{
            JOptionPane.showMessageDialog(null, "Pais inválido");
        }
        return null;
    }
    
}
