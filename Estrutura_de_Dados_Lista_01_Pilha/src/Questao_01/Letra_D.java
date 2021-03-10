/*d. Dado um inteiro n, definir i como o enésimo elemento a partir do
topo da pilha, deixando a pilha inalterada.*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_D 
{
    public static void main(String[] args)
    {
        Pilha <Integer> p = new Pilha(10);
        
        for(int i = 0; i<10;i++)
        {
            p.inserir(i);
        }
        
        Pilha<Integer>p_aux = new Pilha(10);
        
        while (p_aux.estaVazia()== false)
        {
            int e = p_aux.remover();
        }
    }
}
