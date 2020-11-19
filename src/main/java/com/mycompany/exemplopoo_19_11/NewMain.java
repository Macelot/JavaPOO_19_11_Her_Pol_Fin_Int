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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Medico m=new Medico();
        m.setNome("marcelo");
        m.setSobreNome("Telles");
        m.setAnoNascimento(1980);
        System.out.println(m.toString());
        
        Paciente p = new Paciente();
        p.setAnoNascimento(1950);
        p.setSexo('M');
        System.out.println(p.toString());
        
        p = new Paciente();
        p.setAnoNascimento(1940);
        p.setSexo('F');
        System.out.println(p.toString());
        
        Pessoa pessoa;
        //pessoa = new Pessoa();
        
    }
    
}
