package Questao_05;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Lista <T extends Comparable >
{
    No<T> fim, inicio;

    public Lista() {}
    
    public Lista(No fim, No inicio) 
    {
        this.fim = fim;
        this.inicio = inicio;
    }
    
    public No removerInicio(T dado)  
    {
        No temp = this.fim;
        this.fim = this.fim.getProximo().getProximo();
        return temp;                                
    }
    
    public No removerFim(T alvo)  
    {
        No atual = this.fim;
        this.fim = this.fim.proximo.proximo;
        return atual;
                                     
    }
    
    public void insereDepois(T dado)
    {
        this.buscarNaPilha(dado);
        No novo = new No(dado);
        
        novo.proximo = novo.getProximo();
        
        if(this.buscarNaPilha(dado) != null) 
        {
            No proximo = novo.proximo;
            novo.inserirDado(dado);
        }
        
        
    } 

    public void inserirNoFim(T dado)   
    {
        No novoNo = new No(dado);
        No aux = this.fim;
        No aux2 = null;
        
        while((aux != null))
        {
            aux2 = aux;

            aux = aux.getProximo();
        }
        
        if(this.fim == null)
        {
            this.fim = novoNo;
        }
        
        else if(aux == this.fim)
        {
            novoNo.inserirProximo(this.fim);
            this.fim = novoNo;
        }
        
        else
        {
            novoNo.inserirProximo(aux);
            aux2.inserirProximo(novoNo);
        }
    }
    
    public No buscarNaPilha(T alvo)  
    {
        No atual = this.fim;
        
        while(atual != null)            
        {
            if(atual.getDado() == alvo) 
            {
                return atual;           
            }
            
            atual = atual.getProximo();
        }
        return null;
    }
    
    @Override
    public String toString()
    {
        String string = "["; 
        
        No<T> auxiliar = fim;
        
        while(auxiliar != null)
        {
            string += auxiliar.getDado().toString() + ", ";
        
            auxiliar = auxiliar.getProximo();
       }
        
        
        return string +"]";
    }
    
    public static void main(String [] args)
    {
        Lista lista = new Lista();
        
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
            + "o tamanho da fila"));
        t+=1;
        
        for(int i = 1; i<t; i++)
            lista.inserirNoFim(i);
        JOptionPane.showMessageDialog(null, "Fila: " +lista);
        
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
            + "a referencia para adicionar o novo valor:"));
        
        lista.buscarNaPilha(b);
        if(b != 0)
        {
            lista.insereDepois(b);
        }
        
        JOptionPane.showMessageDialog(null, "Fila: " +lista);
    }
}
