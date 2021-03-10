package pilha;

import javax.swing.JOptionPane;

public class Pilha<T> 
{
    private int topo;
    private T[] pilha;
    
    public Pilha(int size) 
    {
        topo = -1;
        pilha=(T[]) new Object[size];
    }
    
    public boolean estaCheia()
    {
        if(topo == -1)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public void inserir(T elem)
    {
        if(estaCheia()== false)
        {
            topo++;
            pilha[topo]= elem;
        }
    }
    
    public T remover()
    {
        if(!estaVazia())
        {
           T elemento = pilha[topo];
           topo = -1;
           return elemento;
        }
        
        else
        { 
            return null;
        }
    }
    
    public boolean estaVazia()
    {
        return topo== -1;
    }
    
    public static void main(String[] args)
    {
        Pilha <String> p = new Pilha<String>(10);
        p.inserir("s");
        p.inserir("b");

        String str = null;

        
        do
        {
            str = (String) p.remover();
            System.out.println(str);
        }while(str != null);

    }
}