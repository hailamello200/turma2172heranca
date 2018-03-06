/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author markson
 */
public class Cliente extends Pessoa {
    private Date dataCadastro;
    private ArrayList<Dependente> dependentes;

    public Cliente(Date dataCadastro, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.dataCadastro = dataCadastro;
    }

    
    
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    
    
    
}
