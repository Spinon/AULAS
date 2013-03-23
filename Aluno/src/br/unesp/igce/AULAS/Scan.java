package br.unesp.igce.AULAS;

import java.io.*;
class Scan{
    public static String teclado()  
    {  
        try {  
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  
            // Le entao a palagra SAIR nao seja digitada  
            String linha = "";               
            linha = reader.readLine(); 
            return linha;   
        }  
        catch (IOException e) {  
            return ("Erro: "+ e);  
        }  
    }
}
