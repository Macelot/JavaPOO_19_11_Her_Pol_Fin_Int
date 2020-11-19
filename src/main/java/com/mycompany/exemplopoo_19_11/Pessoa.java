/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplopoo_19_11;

/**
 *
 * @author marce
 */
abstract class Pessoa {
    private String nome;
    private String sobreNome;
    private float altura;
    private float peso;
    private int anoNascimento;
    private Character sexo;
    
    public Pessoa(){
        this.nome="";
        this.sobreNome="";
        this.altura=0;
        this.peso=0;
        this.anoNascimento=0;
        this.sexo=' ';
    }

    //exemplo de método que não pode ser modificado
    final public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = Character.toUpperCase(sexo);
    }
    
    @Override
    public String toString(){
        String r="";
        r+= "Nome ...........:"+this.getNome()+", "+this.getSobreNome()+"\n";
        r+= "Peso ...........:"+this.getPeso()+"\n";
        r+= "Altura .........:"+this.getAltura()+"\n";
        r+= "Ano ............:"+this.getAnoNascimento()+"\n";
        r+= "Sexo ...........:"+this.getSexo()+"\n";
        return r;
    }
    
    
}
