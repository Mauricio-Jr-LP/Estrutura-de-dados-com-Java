/*a. Definir i com o segundo elemento a partir do topo da pilha, deixando
a pilha sem seus dois elementos superiores.*/

package Questao_01;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_A 
{
    public static void main(String [] args)
    {
        Pilha <Integer> pilha = new Pilha(10);
        for(int i = 0; i<10; i++)
        {
            pilha.inserir(i);
        }
        
        for(int i = 0; i<100; i++)
        {
            pilha.remover();
        }
        
        pilha.remover();
        pilha.remover();
        pilha.remover();
        pilha.inserir(100);
                
    }
    
}
