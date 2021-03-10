package lista_duplamente_encadeada;

public class Link<T extends Comparable>         //Classe No
{
    private T dado;                            //Dado
    Link next;                                 //Conector com o proximo dado 

    public Link(T dado) {
        this.dado = dado;
    }
    
    public Link<T> obterNext()
    {
        return this.next;
    }
    
    public void inserirNext(Link next)
    {
        this.next = next;
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
    
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

}
