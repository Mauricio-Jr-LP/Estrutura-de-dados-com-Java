/*f. Definir i como o último elemento da pilha, deixando a pilha inalterada.
(Dica: use outra pilha auxiliar.)*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_F 
{
    public static void main(String[] args)
    {
        Pilha <Integer> p = new Pilha(100);

            for(int i = 100; i<101; i++)
            {
              p.inserir(i);

              p.remover();
            }
        
    }
}
