package com.diminui.letra;

public class class_lowWord {

    public static void main(String[] args) {
        
        /* 1ª forma de escrever, sem tratamento
        diminuiLetras low = new diminuiLetras();
        low.lowCase();
        */
        //Fim da primeira forma
        
        //2ª forma de escrever, com tratamento
        //Esse bloco seve para tratar a exceção NullPointerExcetion
        try{
            diminuiLetras low = new diminuiLetras();
            low.lowCase();
        } catch(NullPointerException e)
        {
            System.out.println("Exceção NullPointerExeption identificada");
            System.out.println("Método diminuiLetras() tratado\n"+e);
        }
        //O Bloco termina aqui
        }
}
