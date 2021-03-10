package lista;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Main 
{
    public static void main(String [] args)
    {
        Lista lista = new Lista();
        
        for(int i = 1; i<10; i++)
        {
            if(i != 5)
                lista.inserir(i);
        }
        
        //exibindo a lista completa
        JOptionPane.showMessageDialog(null, lista);
        
        //exibindo a lista com o número 5
        lista.inserir(5);
        //1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 
        JOptionPane.showMessageDialog(null, lista);
        
        //exibindo a lista com o número 0
        lista.inserir(0);
        //0 - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 
        JOptionPane.showMessageDialog(null, lista);
        
        
        //exibindo a lista sem o número 1
        lista.remover(1);
        //0 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 -
        JOptionPane.showMessageDialog(null, lista);
        
        //exibindo a lista sem o número 9
        lista.remover(9);
        //0 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 
        JOptionPane.showMessageDialog(null, lista);
        
        //exibindo a lista sem o número 0
        lista.remover(0);
        //2 - 3 - 4 - 5 - 6 - 7 - 8 -
        JOptionPane.showMessageDialog(null, lista);

        //buscando na lista
        No achado = lista.buscar(5);
        JOptionPane.showMessageDialog(null, achado);
        
        /*//um valor que não existe na listabuscando
        achado = lista.buscar(1);
        JOptionPane.showMessageDialog(null, achado);*/

    }
}
