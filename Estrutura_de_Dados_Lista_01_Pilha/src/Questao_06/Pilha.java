/*6 – [Médio] Elabore um método para manter duas pilhas dentro de um único vetor
linear de modo que nenhuma das pilhas incorra em estouro até que toda a memória 
seja usada, e uma pilha inteira nunca seja deslocada para outro local dentro do 
vetor. Escreva os */

package Questao_06;

/**
 *
 * @author Mauricio
 */
public class Pilha<T> 
{
    int topo1, topo2;
    T[] pilha;
    
    public Pilha(int size) 
    {
        topo1 = -1;
        pilha=(T[]) new Object[size];
        topo2 = pilha.length;
    }
    
    
      
    public void inserir1(T elemento)
    {
        
            if(estaCheia()== false)   
        {
            topo1++;
            pilha[--topo2]= elemento;    
        } 
        
    }
    
    public void inserir2(T elemento) 
    {
        if(estaCheia()== false)   
        {
            pilha[--topo2]= elemento;    
        }
    }
    
    public boolean estaCheia()
    {
       return topo2 - topo1 == 1;
    }
    
    
    
    public T remover2()
    {
        if(!estaVazia2())
        {
            
            return pilha[topo2++];
        }
        
        else
            return null;
    }
    
    public boolean estaVazia1()
    {
        return topo1 == -1;

    }
    
    public boolean estaVazia2()
    {
        return topo2 == pilha.length;

    }
    

    public static void main(String [] args)
    {
        Pilha <Character> p = new Pilha(6);
        char[] vetor = new char[6];
        int numero1 = 0;
        int numero2 = 0;
        boolean  flag_erro = false;
                
        for(int i = 0; i<5;i++)
        {
            if(p.estaCheia() != true)
            {
                p.inserir1(Character.MIN_VALUE);
                numero1++;
                flag_erro = true;
                continue;
            }
                else
                    break;
        }
                
        for(int j = 0; j<5;j++)
        {
            if(p.estaCheia() != true)
            {
                p.inserir2(Character.MIN_VALUE);
                numero2++;
                flag_erro = true;
                continue;
            }
            else
                break;
        }


        if(flag_erro != false)
        {
            System.out.println(p.topo1 );
            System.out.println(p.topo2 );
        }

        else
        {
            System.out.println("removendo  \n" );
        }
    }   
}            