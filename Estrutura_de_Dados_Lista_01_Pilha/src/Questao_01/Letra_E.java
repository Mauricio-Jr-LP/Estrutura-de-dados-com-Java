/*e. Definir i como o último elemento da pilha, deixando a pilha vazia.*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_E 
{
    public static void main(String[] args)
    {
        Pilha <Integer> p = new Pilha(10);
        
        for(int i = 100; i<101;i++)
        {
            p.inserir(i);

            p.topo = i;

            p.remover();
        }
    }
    
}
