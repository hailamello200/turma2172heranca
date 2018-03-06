/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Cliente;
import br.com.satc.objeto.Dependente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author haila.159517
 */
public class MainDataNascimento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
    Date data =new Date ();
    Date dataNascimento = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    dataNascimento = sdf.parse("12/03/1991");
    Cliente pai = new Cliente(data, "Markson", "123" , "666");
    Dependente filho = new Dependente(pai, dataNascimento,"Marquinho","122", "198" );

            System.out.println(filho.getIdade());
    }
    
}
