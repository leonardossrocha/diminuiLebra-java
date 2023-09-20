package com.diminui.letra;
import javax.swing.JOptionPane;


public class diminuiLetras {
    //throws serve para dizer que um metodo pode lançar exceções de um
    //determinado tipo, neste caso, NullPointerException
    public static void lowCase() throws NullPointerException
        {
            String word = null;
            String newWord = null;
            
            /*
            Se esquecer de inicializar a variável word causa o NullPointerException
            Essa linha corrige a exceção criada
            */
            //Essa linha precisa ser descomentada para abrir a janela onde será escrito a palavra
            word = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
            
            
            newWord = word.toLowerCase();
            System.out.println("A palavra informada é: "+word);
            System.out.println("A palavra corrigida é: "+newWord);
        }
}
