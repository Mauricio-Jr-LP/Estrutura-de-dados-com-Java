/*b. Definir i com o segundo elemento a partir do topo da pilha, deixando
a pilha inalterada.*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_B 
{
    public static void main(String[] args)
    {
        Pilha <Integer> pilha = new Pilha(10);
        
        for(int i = 0; i<10;i++)
        pilha.inserir(i);
        
        int i = 100;
        int auxiliar = pilha.remover();
        int auxiliar2 = pilha.remover();
        
        pilha.remover();
        pilha.inserir(i);				
        pilha.inserir(auxiliar2);
        pilha.inserir(auxiliar);
        
    }
    
}
