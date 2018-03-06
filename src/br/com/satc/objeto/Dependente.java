/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.Date;

/**
 *
 * @author markson
 */
public class Dependente extends Pessoa{
    private Cliente responsavel;
    private Date dataNascimento;
    private int idade;
    // Criar um método para calcular a idade com base na data de nascimento

    public Dependente(Cliente responsavel, Date dataNascimento, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.responsavel = responsavel;
        this.dataNascimento = dataNascimento;
    }

    
    
    public Cliente getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Cliente responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
