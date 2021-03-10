/*b. Remova o segundo elemento da Pilha a partir do topo, deixando a Pilha com 
os elementos posteriores.*/

package Questao_03;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Letra_B <T extends Comparable >
{
    No<T> topo;

    public Letra_B() {}
    
    public Letra_B(No topo) 
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
        this.topo.proximo.inserirDado("");
        return temp;                                
    }
    
    
    public void inserir(T dado)
    {
        No novo = new No(dado);
        novo.proximo = this.topo;
        this.topo = novo;	
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
            
            atual = atual.getProximo();
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
    
    public static void main(String [] args)
    {
        Letra_B pilha = new Letra_B();
        
        int t = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite "
            + "o tamanho da pilha"));
        t+=1;
        
        for(int i = 1; i<t; i++)
            pilha.inserir(i);
        JOptionPane.showMessageDialog(null, "Pilha:\n" +pilha);
        
        //Removendo do topo pilha
        pilha.removerTopo(0);
        JOptionPane.showMessageDialog(null, "Segundo apos o topo e posteriores "
            + "removidos");
        JOptionPane.showMessageDialog(null, "Pilha:\n" +pilha);
    }
}
