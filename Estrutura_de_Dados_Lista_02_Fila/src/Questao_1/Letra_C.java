/*c. Dado o número n, remova o n-ésimo elemento da fila, deixando a Fila sem os 
elementos anteriores. Ex: n = 3, Fila Inicial = [10,20,30,40] => Fila Final 
[40]*/

package Questao_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_C 
{
    public static void main(String [] args)
    {
        Fila f = new Fila(41);
        int n , i;
        
        for(i = 1; i<=41; i++)
            f.inserir(i);
        
        JOptionPane.showMessageDialog(null,f);
        
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero"));
        
        n = (n*10)+9;
        
        for(i = 1; i<=n; i++)
            f.remover();
        
        JOptionPane.showMessageDialog(null,f);
        
        
    }
    
}
