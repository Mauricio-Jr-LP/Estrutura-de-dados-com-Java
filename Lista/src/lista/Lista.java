package lista;

/**
 *
 * @author Mauricio
 */

//Implementação de uma lista simplemeste encadeada.

public class Lista <T extends Comparable > 
{
    /*O atributo primeiro guarda a referência do primeiro nó. Através dele 
    podemos chegar a todos os nós, sempre pulando para o próximo. */
    private No<T> primeiro;
    
    public Lista()
    {
        this.primeiro = null;
    }
    
    /*Inserindo um nó, passando o valor*/
    public void inserir(T valor)
    {
        //Cria um novo nó com o valor passado
        No novoNo = new No(valor);
        
        /*Precisamos de dois nós auxiliares, um para que possamos ligar o novo 
        nó ao seu proximo (vou chamar ele de P)e outro para conectar o nó 
        anterior à Proximo ao novo nó*/
        No auxiliar = this.primeiro;
        No auxiliar2 = null;
       
        /*Até que você encontre o local correto para nó ser inserido em 
        ordem crescentevá para o próximo nó. Devemos verificar aqui se já 
        chegou ao final da lista:
        auxilia != null
        */
        while((auxiliar!= null) && (auxiliar.obterValor().compareTo
        (novoNo.obterValor()) == -1 ))
        {
            /*auxiliar2 guarda o valor de auxiliar, 
            antes dele pular para o próximo*/
            auxiliar2 = auxiliar;

            //pula para o próximo
            auxiliar = auxiliar.getProximo();
        }

        //É o primeiro nó
        if(this.primeiro == null)
        {
            this.primeiro = novoNo;
        }
        
        //O nó deve ficar antes do primeiro (é menor que ele)*/
        else if(auxiliar == this.primeiro)
        {
            novoNo.inserirProximo(this.primeiro);
            this.primeiro = novoNo;
        }
        
        //O nó deve ficar após o primeiro
        else
        {
            //Liga o novo no ao Proximo
            novoNo.inserirProximo(auxiliar);
            
            //Liga o nó anteror à Proximo ao novo nó
            auxiliar2.inserirProximo(novoNo);
        }
        
    }
    
    public No<T> remover(T valor)
    {
        /*Precisamos de dois nós auxiliares, um para que possamos ligar o novo 
        nó ao seu proximo(vou chamar ele de P)e outro para conectar o nó 
        anterior à P ao novo nó*/
        
        No<T> auxiliar = primeiro;
        No<T> auxiliar2 = null;
        
        /*Até que você encontre o local correto para nó ser removido vá para o 
        próximo nó. Devemos verificar aqui se já chegou ao final da lista: 
        auxiliar != null */
        
        while((auxiliar == null) && (auxiliar.obterValor().compareTo(valor))!=0)
        {
            /*auxiliar2 guarda o valor de auxiliar, antes dele pular para o 
            próximo*/
            auxiliar2 = auxiliar;
            
            //pula para o próximo
            auxiliar2 = auxiliar.obterProximo();
        }
        
        //se o nó a ser removido for o primeiro
        if(auxiliar == this.primeiro)
        {
            No retorno = this.primeiro;
            this.primeiro = this.primeiro.obterProximo();
            return retorno;
        }
        
        //remove o nó da lista, ligando o nó anterior ao próximo do nó achado
        else if(auxiliar != null)
        {
            auxiliar2.inserirProximo(auxiliar.obterProximo());
        }
        
        //retorna o nó (null ou o nó achado)
        return auxiliar;
    }
    
    //Buscar um nó, passando o valor
    public No<T> buscar(T valor)
    {
        //Precisamos de apenas um nós auxiliar para chegar até o nó desejado
        No<T> auxiliar = primeiro;
        
        /*Até que você encontre o nó vá para o próximo nó. Devemos verificar 
        aqui se já chegou ao final da lista:
        auxilia != null */
        while((auxiliar != null) && (auxiliar.obterValor().compareTo(valor)!= 0))
        {
           //pula para o próximo
           auxiliar = auxiliar.obterProximo();
        }
        
        //retorna o nó (null ou o nó achado)
        return auxiliar;
    }
    
    //método toString para exibir a lista
    @Override
    public String toString()
    {
        String string = "";
        
        No<T> auxiliar = primeiro;
        
        while(auxiliar != null)
        {
            //incrementa o valor
            string += auxiliar.obterValor().toString() + " - ";
        
            //pula para o próximo
            auxiliar = auxiliar.obterProximo();
        }
        
        return string;
    }
}