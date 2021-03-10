/*2 - [Simples] Simule a ação do algoritmo apresentado nesta seção para cada uma 
das seguintes strings, apresentando o conteúdo da pilha em cada ponto.*/
package Questao_02;

/**
 *
 * @author Mauricio
 */
public class Pilha<T> 
{
    private int topo;
    private T[] pilha;
    
    public Pilha(int size) 
    {
        topo = -1;
        pilha=(T[]) new Object[size];
    }
        
    public boolean estaVazia()
    {
        if(topo ==  -1)
            return true;
        else
            return false;
    }
    
    public boolean estaCheia()
    {
       if(topo == pilha.length-1)
           return true;
       else
           return false;
    }
    
    public void inserir(T elem) 
    {
        if(estaCheia()== false)  
        {
            topo++;               
            pilha[topo]= elem;    
        }
    }
    
    public T remover()
    {
        if(estaVazia()== false)
        {
            T tramp = pilha[topo];
            topo=-1;
            return tramp;
        }
        
        else
            return null;
    }
}