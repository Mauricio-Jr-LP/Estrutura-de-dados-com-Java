/*3 -  Escreva um algoritmo para determinar se uma string de caracteres de
entrada é da forma:

xCy

onde x é uma string consistindo nas letras 'A' e 'B', e y é o inverso de
x (isto é, se x = "ABABBA", y deve equivaler a "ABBABA"). Em cada
ponto, você só poderá ler o próximo caractere da string.
*/

package Questao_03;

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
        
        
        for(int i =0; i<xy.length(); i++)
        {
            if(xy.charAt(i) == 'C')
            {
                x=1;
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
            JOptionPane.showMessageDialog(null, "String "+xy+" esta correta");
        }
        
        else
            JOptionPane.showMessageDialog(null, "String "+xy+" esta errada");
    }
}