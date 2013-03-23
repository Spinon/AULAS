/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.AULAS;

/**
 *
 * @author Cliente
 */
public class Main {
    Main(){
        
    }
    public static void main(String[] args) {
        
        System.out.print("Novo Paciente: ");
        Paciente x = new Paciente(Scan.teclado());
        System.out.println(x.nome);
    }
}
