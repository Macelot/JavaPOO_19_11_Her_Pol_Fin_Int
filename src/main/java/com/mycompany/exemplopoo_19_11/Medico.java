/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopoo_19_11;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author marce
 */
public final class Medico extends Pessoa implements DadosPessoais,Serializable{
    private int crm;
    private float salario;

    //exemplo de sobrecarga overload
    public Medico(int docCrm){
        this.crm=docCrm;
    }
    public Medico(float s){
        this.salario=s;
    }
    public Medico(){
        this.salario=0.01f;
        this.crm=1;
    }
    
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public String mostraIdade(){
        Date dataAtual=new Date();      
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
        cal.setTime(dataAtual);
        int anoAtual = cal.get(Calendar.YEAR);
        int anoNascimento=super.getAnoNascimento();
        int idade=anoAtual-anoNascimento;
        return String.valueOf(idade);
    
    }
    
    @Override
    public String getSobreNome(){
        return "Dr. "+super.getSobreNome();
    }
    
    @Override
    public String toString(){
        String r=super.toString();
        r+= "Salário ........:"+this.getSalario()+"\n";
        r+= "CRM ............:"+this.getCrm()+"\n";
        r+= "Idade...........:"+this.mostraIdade()+"\n";
        return r;
    }  
}
