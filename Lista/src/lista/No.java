package lista;

/**
 *
 * @author Mauricio
 * @param <T>
 */

//Implementação de no da lista simplemeste encadeada.

public class No <T extends Comparable> 
{   
    private T valor;
    No proximo;
    
    public No(T valor)
    {
        this.valor = valor;
    }
    
    //Obtém o próximo nó
    public No<T> obterProximo()
    {
        return this.proximo;
    }

    //Inserir o próximo nó
    public void inserirProximo(No proximo)
    {
        this.proximo = proximo;
    }
    
    //Inserir o valor no nó
    public void inserirValor(T valor)
    {
        this.valor = valor;
    }
    
    //Obter o valor do nó
    public T obterValor()
    {
        return this.valor;
    }
    
    //Métod toString para exibir o nó
    @Override
    public String toString()
    {
        return this.valor.toString();
    }
    
    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
       
}