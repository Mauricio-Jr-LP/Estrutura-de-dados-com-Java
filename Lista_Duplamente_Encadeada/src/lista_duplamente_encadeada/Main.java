package lista_duplamente_encadeada;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Main 
{
    public static void main(String [] args)
    {
        LinkList lista = new LinkList();
        
        lista.inserirNaFrente(1);
        lista.inserirNaFrente(2);
                
        JOptionPane.showMessageDialog(null, lista);
        
    }
}
