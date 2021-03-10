/*5 – Implemente os seguintes Métodos da Lista:
- InserirDepois(T dado) 
Dado um valor, o método deve procurar na lista o nó com o valor e inserir o novo 
nó após este. Caso o nó não exista, deve inserir no último. 

- InserirAntes(T dado) 
Dado um valor, o método deve procurar na lista o nó com o valor e inserir o novo 
nó antes deste. Caso o nó não exista, deve inserir no último. 

- InserirEm(T dado, int index) 
Dado um valor e um índice, o método deve percorrer a lista até o nó cuja a 
posição equivale ao índice e inserir o nó na posição. 
 
- Deletar(Int index) 
Dado um índice, o método deve percorrer a lista até o nó do índice e deletar o 
nó. O método retorna o Link deletado, caso o índice for maior do que a lista, 
deve retornar o null. 
*/

package Questao_05;

public class No<T>                     
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
