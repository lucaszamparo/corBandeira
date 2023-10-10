package com.mycompany.corbandeira;

import javax.swing.JOptionPane;

public class Corbandeira {

    public static void main(String[] args) {
        //Variaveis
        String corVermelho, corAzul, corVerde, corBranco, corAmarelo;
        
        //Instancia
        Bandeira bandeira = new Bandeira();
        Perguntas perguntas = new Perguntas();
        
        //Entrada
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Akinator!");
        JOptionPane.showMessageDialog(null, "Pense em um Pais ARG/CHL/MEX/BRA/COL");
        
        //Perguntas
        corVermelho = perguntas.perguntaVermelho();
        corAzul = perguntas.perguntaAzul();
        corVerde = perguntas.perguntaVerde();
        corBranco = perguntas.perguntaBranco();
        corAmarelo = perguntas.perguntaAmarelo();
        
        //Construtor
        bandeira.descobrirPais(corVermelho, corAzul, corVerde, corBranco, corAmarelo);
                 
    }
}
