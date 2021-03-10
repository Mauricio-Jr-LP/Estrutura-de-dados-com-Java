//Montando Pilha

package Dicas;

/**
 *
 * @author Mauricio
 */
public class Pilha<T> 
{
   
    int topo;               //Atributo para armazenar o indice do topo da pilha
    private T[] arrayPilha; //Array da pilha
    
    public Pilha(int max)  //Construtor da pilha     //Max = tamanho da pilha
    {
        arrayPilha =(T[]) new Object[max];
        //instanciando um vetor genérico (cria um vetor do tipo Objetc e faz o 
        //cast (conversão) para o tipo T
        
        topo = -1;
    }
    
    public boolean inserir(T elemento) //Insere um elemento
    {		
        if(!this.estaCheia())  //Insere um elemento se a pilha não estiver cheia
        {
            topo++;
            arrayPilha[topo] = elemento; //Elemento a ser inserido na pilha
            return true;    //return true retorna se a operação foi bem sucedida
        }

	return false;
    }
    
    public T remover()
    {
        if(!estaVazia()) //Remove um elemento da pilha, se ela não esiver vazia
        {
           T elemento = arrayPilha[topo];
           topo = -1;
           return elemento; //Retorna o elemento se a operação foi bem sucedida
        }
        
        return null;   
    }
    
    public boolean estaVazia() //Verifica se a pilha está vazia
    {
        if(topo == -1)
            return true; //return retorna true se a pilha estiver vazia
        
        return false;
    }
    
    public boolean estaCheia() //Verifica se a pilha está cheia
    {
        if(topo == arrayPilha.length - 1)
            return true;
        
        return false;
    }
    
    
}
