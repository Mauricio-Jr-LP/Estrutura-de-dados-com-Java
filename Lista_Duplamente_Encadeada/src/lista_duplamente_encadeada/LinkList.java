package lista_duplamente_encadeada;

public class LinkList<T extends Comparable >                    //Classe Lista
{
    private Link<T> primeiro, ultimo;

    public LinkList() {}
    
    public LinkList(Link primeiro, Link ultimo) 
    {
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }
    
    public boolean estaVazia()             //Verifica se esta vazia
    {
        return this.primeiro == null; //O ultimo elemento sempre sera = a null
    }
    
    public void inserirAtras(T dado)   //Inseri na frente ou seja no primeiro
    {
        Link novoNo = new Link(dado);
        novoNo.setNext(this.primeiro);    //Inseri na frente ou seja no primeiro
        this.primeiro = novoNo;
    }
    
    public void inserirNaFrente(T dado)   
    {
        Link novoNo = new Link(dado);
        Link aux = this.primeiro;
        Link aux2 = null;
        
        while((aux != null) && (aux.obterValor().compareTo(novoNo.obterValor())
            == -1))
        {
            aux2 = aux;

            aux = aux.getNext();
        }
        
        if(this.primeiro == null)
        {
            this.primeiro = novoNo;
        }
        
        else if(aux == this.primeiro)
        {
            novoNo.inserirNext(this.primeiro);
            this.primeiro = novoNo;
        }
        
        else
        {
            novoNo.inserirNext(aux);
            aux2.inserirNext(novoNo);
        }
    }
    
    public Link removerDaFrente(T dado)  //Remove na frente ou seja no primeiro
    {
        Link temp = this.primeiro;                  //Copia
        this.primeiro = this.primeiro.getNext();    //Passa para a frente
        return temp;                                //Retorna a copia
    }
    
    public Link removerAtras(T alvo)  
    {
        Link atual = this.primeiro;
        
        while(atual != null)            
        {
            if(atual.getDado() == alvo) 
            {
                this.ultimo = this.ultimo.getNext();
                return atual;          
            }
            
            atual = atual.getNext();
        }
        return null;
    }
    
    public Link<T> remover(T valor)
    {
        Link<T> auxiliar = primeiro;
        Link<T> auxiliar2 = null;
        
        Link atual = buscarNaLista(valor);
        
        while((auxiliar == null) && (auxiliar.obterValor().compareTo(valor))!=0)
        {
            /*auxiliar2 guarda o valor de auxiliar, antes dele pular para o 
            próximo*/
            auxiliar2 = auxiliar;
            
            //pula para o próximo
            auxiliar2 = auxiliar.obterNext();
        }
        
        //se o nó a ser removido for o primeiro
        if(auxiliar == this.primeiro)
        {
            Link retorno = this.primeiro;
            this.primeiro = this.primeiro.obterNext();
            return retorno;
        }
        
        //remove o nó da lista, ligando o nó anterior ao próximo do nó achado
        else if(auxiliar != null)
        {
            auxiliar2.inserirNext(auxiliar.getNext());
        }
        
        //retorna o nó (null ou o nó achado)
        return auxiliar;
    }
    
    public Link exibirLista()           //Exibir do primeiro ate o ultimo
    {
        Link atual = this.primeiro;  
        
        while(atual != null)           //Enquanto nao chega no ultimo exibe eles
        {
            atual.toString();
            atual = atual.getNext();
        }
        return null;
    }
    
    public Link buscarNaLista(T alvo)  //Busca na lista 
    {
        Link atual = this.primeiro;
        
        while(atual != null)            //Equanto nao for nulo busca
        {
            if(atual.getDado() == alvo) //Se dado for igual ao dado inserido
            {
                return atual;           //Retorna o dado
            }
            
            atual = atual.getNext();
        }
        return null;
    }
    
    @Override
    public String toString()
    {
        String string = "["; 
        
        Link<T> auxiliar = primeiro;
        
        while(auxiliar != null)
        {
            //incrementa o valor
            string += auxiliar.getDado().toString() + " - ";
        
            //pula para o próximo
            auxiliar = auxiliar.getNext();
       }
        
        
        return string +"]";
    }
    
}
