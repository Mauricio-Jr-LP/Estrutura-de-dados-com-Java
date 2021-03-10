/*3 - Implemente os seguintes códigos utilizando a estrutura de Pilha, criada 
na questão 1. Para cada item, supõem-se que a Pilha já tenha itens. */

package Questao_03;

public class No<T extends Comparable >                   
{
    private T dado;                      
    No proximo;                     

    public No(T dado) 
    {
        this.dado = dado;
    }
    
    public No<T> obterNext()
    {
        return this.proximo;
    }
    
    public void inserirProximo(No proximo)
    {
        this.proximo = proximo;
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
