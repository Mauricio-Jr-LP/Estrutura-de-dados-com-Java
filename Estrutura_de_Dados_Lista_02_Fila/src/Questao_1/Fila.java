/*1 – Implemente os seguintes códigos utilizado a estrutura de Fila, criada em 
sala. Para cada item, supõem-se que a Fila já tenha itens.*/

package Questao_1;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Fila<T>
{
    T[] arrayFila; 
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
        
    
    public void inserir(T elemento) 
            
    { 
        if(fim == arrayFila.length)
        {
            fim = 0;
        }
        
        if(!estaCheia())
        {
            arrayFila [fim] = elemento; 
            fim++;
        }   
    }
    
    public boolean estaCheia() 
    {
        if( ( (fim == arrayFila.length-1) && (inicio == 0) ) || (fim == inicio-1))
            return true;
        
        else
            return false;
    }

    public T remover() 
    {
        if(fim == arrayFila.length)
        {
            inicio = 0;
        }
        
        else if(!estaVazia())
        {
            T e = arrayFila[inicio];
            inicio++;
            return e; 
        } 
        return null;
        
        
    }

    public boolean estaVazia() 
    {
        return inicio == fim; 
    }

    /*public static void main(String [] args)
    {
    Fila p = new Fila<String>(10);
    String str = null;
    do
    {
    str = (String) p.remover();
    System.out.println(str);
    }while(str != null);
    }*/
}

