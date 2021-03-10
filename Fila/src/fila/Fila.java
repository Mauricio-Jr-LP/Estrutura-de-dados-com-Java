package fila;

/**
 *
 * @author Mauricio
 */

public class Fila <T>
{
    private T[] arrayFila;
    private int inicio;
    private int fim;
    
    public Fila(int size)
    {
        arrayFila = (T[]) new Object[size];
        inicio = fim = 0;
    }
    
    public boolean estaCheia()
    {
        if((fim == arrayFila.length-1) && (inicio == 0) || (fim == inicio -1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void inserir(T elemento)
    {
        if(!estaCheia())
        {
            arrayFila[fim] = elemento;
            fim++;
        }
    }
    
    public boolean estaVazia()
    {
        return inicio == fim;
    }
    
    public T remover(T elemento)
    {
        T e = arrayFila[inicio];
        inicio++;
        return e;
    }
    
   
    @Override
    public String toString()
    {
        String s = "["; 
        int i = inicio; 
        
        while(i != fim)
        {
            if(i == arrayFila.length)
            {
                i = 0;
            } 
            if(i == fim-1)
            {
                s+=arrayFila[i];
            } 
            else
            {
                s+=arrayFila[i] + " , ";
                i++; 
            } 
        }
        return s + "]"; 
    }
    
    public static void main(String[] args) 
    {
        Fila f = new Fila(5);
        f.inserir(1); 
        f.inserir(2); 
        f.inserir(3); 
        f.inserir(4); 
        f.inserir(100);
        
        System.out.print(f);
    }
    
}
