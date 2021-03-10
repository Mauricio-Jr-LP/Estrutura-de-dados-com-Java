package Questao_01;

public class No<T>                     
{
    private T dado;                      
    No proximo;                     

    public No(T dado) 
    {
        this.dado = dado;
    }
    
    public No<T> obterProximo()
    {
        return this.proximo;
    }
    
    public void inserirProximo(No next)
    {
        this.proximo = next;
    }

    public void inserirDado(T dado)
    {
        this.dado = dado;
    }
    
    public T obterValor()
    {
        return this.dado;
    }
    
    @Override
    public String toString()
    {
        return this.dado.toString();
    }

    public T getDado() 
    {
        return this.dado;
    }
    
    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

}
