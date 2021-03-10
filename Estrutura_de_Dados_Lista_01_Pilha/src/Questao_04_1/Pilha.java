/*4 - Escreva um algoritmo para determinar se uma string de caracteres de
entrada é da forma:

a D b D c D...D z

onde cada string, a, 6, ..., z, é da forma da string definida no Exercício 3. 
(Por conseguinte, uma string estará no formato correto se consistir em qualquer 
número de strings desse tipo, separadas pelo caractere 'D'.) Em cada ponto, você
só poderá ler o próximo caractere da string.*/

package Questao_04_1;

import javax.swing.JOptionPane;

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
    
    public int topo()
    {
        return topo;
    }
      
    public void inserir(T elemento) 
    {
        if(estaCheia()== false)   
        {
            topo++;               
            pilha[topo]= elemento;    
        }
    }
    
    public boolean estaCheia()
    {
       return topo == pilha.length-1;
    }
    
    public T remover()
    {
        if(!estaVazia())
        {
            T elemento = pilha[topo];
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
    
    public static void main(String[] args)
    {
        Pilha<Character> p = new Pilha(10);
        int x = 0;
        boolean  flag_erro = false;
        
        String xy = "ABABBACABBABA";
        String s = "a D b D c D";
        String[] a = s.split("D");
        
        
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) != 'D')
            {
                x=1;
                p.inserir(s.charAt(i));
                continue;
            }
            
            if(x==0)
            {
                p.inserir(xy.charAt(i));
            }
            else 
            {
                char c = p.remover();
                
                    if(xy.charAt(i)!=c)
                {
                    flag_erro = true;
                    break;
                }   
            }
            
        }
        
        if(!p.estaVazia())
        {
            System.out.println(p.topo());
            flag_erro = true;
        }
        
        if(flag_erro == false)
        {
            JOptionPane.showMessageDialog(null,s);
        }
        
        else
            JOptionPane.showMessageDialog(null,s);
    }  
}
