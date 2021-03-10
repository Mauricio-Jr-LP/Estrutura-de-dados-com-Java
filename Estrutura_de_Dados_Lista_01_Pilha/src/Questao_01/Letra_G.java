/*g. Definir i como o terceiro elemento a partir do final da pilha.*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_G 
{
    public static void main(String[] args)
    {
        Pilha <Integer> p = new Pilha<Integer>(10);
        
        for(int i = 0; i<10;i++)
            p.inserir(i);
        
        Pilha<Integer>p_aux = new Pilha<Integer>(10);
        
        for(int i = 0; i< 2; i++)
        {
            int e = p.remover();
            p.inserir(e);
        }
        while (p_aux.estaVazia()== false)
        {
            int e = p_aux.remover();
        }
        
    }
}
