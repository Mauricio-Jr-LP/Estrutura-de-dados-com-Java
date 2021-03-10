/*Remova o segundo elemento da fila, deixando a Fila com os elementos 
anteriores. Ex: Fila Inicial = [1, 2, 3, 4] =>  Fila Final [1,3,4]*/

package Questao_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_B 
{
    public static void main(String [] args)
    {
        int tam, i;
        
        tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "
                + "tamanho da fila:"));
        
        Fila  f = new Fila(tam+1);
        
        tam = tam +1;
        
        for(i = 1; i < tam; i++)
            f.inserir(i);
            
        JOptionPane.showMessageDialog(null,"Fila Inicial:\n"+f);
        
        f.arrayFila[1] = f.remover();
       
        JOptionPane.showMessageDialog(null,"Fila Final:\n"+f);
        
    }
    
}
