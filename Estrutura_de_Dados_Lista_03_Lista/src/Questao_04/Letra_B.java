/*b.Remova o segundo elemento da fila a partir do final, deixando a Fila com os 
elementos posteriores. Ex: Fila = [1, 2, 3, 4] => [1,2,4]. */

package Questao_04;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_B <T extends Comparable >
{
    No<T> fim, inicio;

    public Letra_B() {}
    
    public Letra_B(No fim, No inicio) 
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
        No temp = this.fim;
        this.fim.proximo.inserirDado("");
        return temp;
                                     
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
        Letra_B fila = new Letra_B();
        
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
            + "o tamanho da fila"));
        t+=1;
        
        for(int i = 1; i<t; i++)
            fila.inserirNoFim(i);
        JOptionPane.showMessageDialog(null, "Fila: " +fila);
        
        //Removendo do fim pilha
        fila.removerFim(0);
        JOptionPane.showMessageDialog(null, "Segundo apos o fim e posteriores "
            + "removidos");
        JOptionPane.showMessageDialog(null, "Fila: " +fila);
    }
}
