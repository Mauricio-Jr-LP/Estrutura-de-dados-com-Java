/*c. Dado um inteiro n, definir i como o enésimo elemento a partir do 
topo da pilha, deixando a pilha sem seus n elementos superiores.*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Letra_C 
{
    public static void main(String[] args)
    {
        Pilha<Integer> p = new Pilha(10);
        int numero = 0;
        int n = 5;

	p.inserir(numero++);
        int i = 100;

        for(int j=0; j<=n; j++ )
        {
            p.remover();
        }
        
        p.inserir(i);
    }
}
