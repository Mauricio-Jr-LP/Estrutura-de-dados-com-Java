package Questao_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Pilha <T>
{
    private int topo;
    private T[] arrayPilha;
    
    public Pilha(int size) 
    {
        topo = -1;
        arrayPilha=(T[]) new Object[size];
    }
    
    public int topo()
    {
        return topo;
    }
      
    public void inserir(T elemento) 
    {
        if(estaCheia()== false)   
        {
            topo++;               
            arrayPilha[topo]= elemento;    
        }
    }
    
    public boolean estaCheia()
    {
       return topo == arrayPilha.length-1;
    }
    
    public T remover()
    {
        if(!estaVazia())
        {
            T elemento = arrayPilha[topo];
            topo--;
            return elemento;
        }
        
        else
            return null;
    }
    
    public boolean estaVazia()
    {
        return topo == -1;

    }

    @Override
    public String toString()
    {
        String s = "[";
        int i = topo; 
        while(i != topo)
        {
            JOptionPane.showMessageDialog(null,s);
        
            if(i == arrayPilha.length)
            {
                i = 0;
            }
            
            if(i == topo-1)
            {
                s+=arrayPilha[i];
            }
            
            else 
            {
                s+=arrayPilha[i] + " , ";
            }
        
            i++;
    		
        }
        
        return s + "]";  
        
    }
    
    
}
