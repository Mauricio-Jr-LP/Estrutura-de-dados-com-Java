/*6 – [Difícil] Elabore um algoritmo que simule um sistema operacional que seja 
capaz de armazenar as ações realizadas em um programa. O algoritmo deve ser 
capaz de armazenar as ações e desfazê-las (retirar da estrutura) da mais recente
para a mais antiga, com limite de 10 ações. As operações são armazenadas em uma 
estrutura de pilha, para cada programa. Esses programas são armazenados em 
estrutura de fila.  O programa deve ser capaz de: 
 
a) Inserir um programa na fila; 
b) Remover um programa da fila (ao remover, 
deve-se exibir todas as ações armazenadas); 
c) Inserir uma ação em um programa 
insert(String acao, int programa); 
d) Remover uma ação de um 
programa remove(string acao, int programa);  

Observação: os programas são identificados por inteiros: 0, 1, 2, 3 e seguintes.
Respeitando a ordem de inserção. As ações são strings, podem ser atribuídas 
diretamente (sem interação como o usuário). Ex: “adicionou a palavra 1”, “entre”
ou  “aplicou negrito no texto ‘olá mundo’”. */

package Questao_6;

/**
 *
 * @author Mauricio
 */

public class Programa 
{
    private String nome;
    private Pilha açao = new Pilha(11);

    public Programa(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pilha getAçao() {
        return açao;
    }

    public void setAçao(Pilha açao) {
        this.açao = açao;
    }

    void setAçao(String açao) 
    {
        this.açao = this.açao;
    }

    
    
    
    

}