package pilhav;

public class PilhaV<T> 
{
    private T[] arrayPilha;  //Array da Pilha
    private int topo;        //Atributo para armazenar o indice do topo da pilha

                             
    public PilhaV(int max)   //Contrutor da Pilha
    {
        //instanciando um vetor genérico 
        //cria um vetor do tipo Objetc e faz o cast (conversão) para o tipo T
        arrayPilha = (T[]) new Object[max];
        //@param max Tamanho da pilha
        topo = -1;
    }

    public boolean inserir(T elemento) //Insere um elemento
    {		
        if(!this.estaCheia()) //se a pilha não estiver cheia
        {
            topo++;
            arrayPilha[topo] = elemento; 
            //@param elemento Elemento a ser inserido na pilha
            return true; //@return retora true se a operação foi bem sucedida
        }

        return false;
    }

    public T remover()       //Remove um elemento da pilha
    {		
        if(!this.estaVazia()) //se ela não esiver vazia 
        {			
            return arrayPilha[topo--]; 
            //@return retorna o elemento se a operação foi bem sucedida
        }

        return null;
    }

    public boolean estaVazia()//Verifica se a pilha está vazia
    {		
        return topo == -1; //@return retorna true se a pilha estiver vazia
    }

    public boolean estaCheia()//Verifica se a pilha está cheia
    {		
        return topo == arrayPilha.length-1; 
        //@return retorna true se a pilha estiver cheia
    }

    @Override
    public String toString() {
        return "PilhaV{" + "arrayPilha=" + arrayPilha + ", topo=" + topo + '}';
    }
    
    
    
    public static void main(String [] args)
    {
        PilhaV p = new PilhaV(10);
        
        System.out.println(p.arrayPilha);
        p.inserir(1);
        System.out.println(p.toString());
    }

    
}