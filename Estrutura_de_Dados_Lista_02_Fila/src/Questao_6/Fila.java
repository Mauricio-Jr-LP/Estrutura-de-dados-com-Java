package Questao_6;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Fila <T>
{
    private T[] arrayFila; 
    private int inicio; 
    private int fim;

    public Fila(int size) 
    {
        inicio = fim = 0;
        arrayFila =(T[]) new Object[size];
    }
    
   @Override
    public String toString()
    {
        String s = "[";
        int i = inicio;
        
        while(i != fim)
        {
            if( i == arrayFila.length)
            {
                i = 0;
            }
            
            if(s == "[")
                s += arrayFila[i];
            else 
                s += ","+arrayFila[i];
            
            
            i++;
             
        }
        
        return s+"]";
    
        
    }
        
    public boolean estaCheia()
    {
	return ((fim == arrayFila.length-1) && (inicio == 0) )|| 
            (fim == inicio-1);
    }
    
    public boolean estaVazia()
    {
        return inicio == fim;
    }
    
    public boolean inserir(T elemento) 
    { 
        if(fim == arrayFila.length)
        {
            fim = 0;
        }
            if(!estaCheia())
            {
                arrayFila [fim++] = elemento; 
//                JOptionPane.showMessageDialog(null,"inserindo  " + fim);
                return true;
            }
        
            return false;
        
    }
    
    public T remover() 
    {
        if(!estaVazia())
        {
            T elemento = arrayFila[inicio];
            inicio++;
            return elemento; 
        } 
        
        return null;
        
    }
    
}