/*1 – Implemente uma Pilha utilizando Lista Encadeada.*/

package Questao_01;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Pilha_Encadeada <T extends Comparable >
{
    No<T> topo;

    public Pilha_Encadeada() {}
    
    public Pilha_Encadeada(No topo) 
    {
        this.topo = topo;
    }
    
    public boolean estaVazia()            
    {
        return this.topo == null; 
    }
    
    public No removerTopo(T dado)  
    {
        No temp = this.topo;                  
        this.topo = this.topo.getProximo();    
        return temp;                                
    }
    
    public No removerAtras(T alvo)  
    {
        No atual = this.topo;
        
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
        novoNo.setProximo(this.topo);    
        this.topo = novoNo;
    }
    
    public No buscarNaPilha(T alvo)  
    {
        No atual = this.topo;
        
        while(atual != null)            
        {
            if(atual.getDado() == alvo) 
            {
                return atual;           
            }
            
            atual = atual.obterProximo();
        }
        return null;
    }
    
    @Override
    public String toString()
    {
        String string = "_\n"; 
        
        No<T> auxiliar = topo;
        
        while(auxiliar != null)
        {
            string += auxiliar.getDado().toString() + "\n";
        
            auxiliar = auxiliar.getProximo();
       }
        
        
        return string +"_";
    }
}
