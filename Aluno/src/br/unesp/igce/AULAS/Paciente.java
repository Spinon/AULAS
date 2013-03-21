/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.AULAS;

/**
 *
 * @author aluno
 */
public class Paciente {
    private String nome;
    private String endereço;

Paciente (String nome) {
    this.nome = nome;
    this.endereço = " ";
}

    public static void main(String[] args) {
        Paciente x = new Paciente("Lucas Defavori");
    }
    
}