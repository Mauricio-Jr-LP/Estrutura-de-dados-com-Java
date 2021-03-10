/*1 – [Simples] Use as operações push, pop, stacktop e empty para construir 
operações que façam o seguinte:*/

package Questao_01;

/**
 *
 * @author Mauricio
 */

public class Pilha <T>
{
    int topo;
    private T[] pilha;
    
    public Pilha(int size)
    {
        topo = -1;
        pilha =(T[]) new Object[size];
    }
    
    public void inserir(T elemento)
    {
        if(!estaCheia())
        {
            topo++;
            pilha[topo] = elemento;
        }
    }
    
    public T remover()
    {
        if(!estaVazia())
        {
           T elemento = pilha[topo];
           topo = -1;
           return elemento;
        }
        
        else
        { 
            return null;
        }
    }
    
    public boolean estaVazia()
    {
        if(topo == -1)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public boolean estaCheia()
    {
        if(topo == pilha.length - 1)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
}
