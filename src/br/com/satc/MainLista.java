/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.ArrayList;

/**
 *
 * @author markson
 */
public class MainLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        
        String nome1,nome2,nome3,nome4,nome5;
        nome1 = "Markson";
        nome2 = "Rebelo";
        nome3 = "Marcolino";
        nome4 = "Aleatório";
        nome5 = "Teste Sem criatividade";
        
        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);
        nomes.add(nome4);
        nomes.add(nome5);
        
        for (String nome : nomes) {
            if (nome.equals("Markson"))
            System.out.println(nome);
        }
        
    }
    
}
