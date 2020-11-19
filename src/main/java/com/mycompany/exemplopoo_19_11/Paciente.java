/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopoo_19_11;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author marce
 */
public final class Paciente extends Pessoa implements DadosPessoais{
    private String tipoSangue;
    
    public Paciente(){
        this.tipoSangue="";
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }
    
    @Override
    public String getSobreNome() {
        return switch (super.getSexo()) {
            case 'F' -> "Sra "+super.getSobreNome().toLowerCase();
            case 'M' -> "Sr. "+super.getSobreNome().toLowerCase();
            default -> ""+super.getSobreNome().toLowerCase();
        };
    }
    
    @Override
    public String mostraIdade(){
        Date dataAtual=new Date();      
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
        cal.setTime(dataAtual);
        int anoAtual = cal.get(Calendar.YEAR);
        int anoNascimento=super.getAnoNascimento();
        int idade=anoAtual-anoNascimento;
        if(anoNascimento==0){
            return "0";
        }
        if(idade<18){
            return "Criança "+idade;
        }else if((idade>=18)&&(idade<60)){
            return "Adulto "+idade;
        }else{
            return "Idoso "+idade;
        } 
    }
    
    @Override
    public String toString(){
        String r="";
        r+=super.toString();
        r+= "Tipo Sangue.....:"+this.getTipoSangue()+"\n";
        r+= "Idade...........:"+this.mostraIdade()+"\n";

        return r;
    }
    
    
}
