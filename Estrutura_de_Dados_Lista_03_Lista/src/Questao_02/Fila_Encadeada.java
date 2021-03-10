//2 – Implemente uma Fila utilizando Lista Encadeada.

package Questao_02;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Fila_Encadeada <T extends Comparable >
{
    No<T> fim;

    Fila_Encadeada() {}
    
    public Fila_Encadeada(No fim) 
    {
        this.fim = fim;
    }
    
    public boolean estaVazia()            
    {
        return this.fim == null; 
    }
    
    public No removerTopo(T dado)  
    {
        No temp = this.fim;                  
        this.fim = this.fim.getProximo();    
        return temp;                                
    }
    
    public No removerAtras(T alvo)  
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
    
    public void inserir(T dado)
    {
        No novoNo = new No(dado);
        novoNo.setProximo(this.fim);    
        this.fim = novoNo;
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
        String string = "_\n"; 
        
        No<T> auxiliar = fim;
        
        while(auxiliar != null)
        {
            string += auxiliar.getDado().toString() + "\n";
        
            auxiliar = auxiliar.getProximo();
       }
        
        
        return string +"_";
    }
}