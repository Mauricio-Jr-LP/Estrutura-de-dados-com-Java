/*Dado o número n, remova o n-ésimo elemento da fila, deixando a Fila com os 
elementos anteriores. Ex: n = 3, Fila Inicia= [10,20,30,40] => => 
Fila Final [10,20,40]
*/

package Questao_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_D 
{
    public static void main(String [] args)
    {
        Fila f = new Fila(42);
                
        int n, i, m;
        
        for(i = 1; i<=42; i++)
            f.inserir(i);
        
        JOptionPane.showMessageDialog(null,"Fila Inicial:\n"+f);
        
        n=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero"));
        
        n = (n*10);
        m =  n+9;
        int f1 = m+1;
        int f2 = f1+1;
        
        f.arrayFila[41] = f.remover();
        f.arrayFila[40] = f.remover();
        
        for(i = 0; i<m; i++)
            f.arrayFila[n] = f.remover();
        
        for(i = 0; i<n; i++)
            f.inserir(i);
        
        f.inserir(f1);
        f.inserir(f2);
        
        JOptionPane.showMessageDialog(null,"Fila Final:\n"+f);
    }        
}