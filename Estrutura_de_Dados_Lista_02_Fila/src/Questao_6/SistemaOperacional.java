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

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

//OBS: não remove progs com ações e não remove ações

public class SistemaOperacional 
{
    public static void main(String [] args)
    {
        Fila programa = new Fila(11);
        
        int menu;
        String nome, açao = null;
        
        while(true)
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "O que deseja fazer:\n"
                + "1 - Inserir um programa na fila\n" 
                + "2 - Remover um programa da fila\n"
                + "3 - Inserir uma ação em um programa\n" 
                + "4 - Remover uma ação de um programa\n"
                + "\n----Qualquer outro numero para finalizar o sistema-----"));
            
            if(menu == 1)
            {
               nome = JOptionPane.showInputDialog(null, "Dê nome ao programa:");
               Programa prog = new Programa(nome); 
               
               if(programa.inserir(prog))
                {
                    JOptionPane.showMessageDialog(null,"O programa " +nome+ 
                        " foi inserido com sucesso");
                } 
               
               else
                {
                    JOptionPane.showMessageDialog(null,"Erro ao inserir");
                } 
            }
            
            else if(menu == 2)
            {
                nome = JOptionPane.showInputDialog("Digite o nome do "
                    + " programa:");
                açao = null;
                
                Programa prog = procurar(programa, nome, açao);
                
                if(prog != null)
                {
                    if(açao == null)
                        JOptionPane.showMessageDialog(null,"Não foi realizada "
                            + "ações!");
                        
                    else if(açao != null)
                        JOptionPane.showMessageDialog(null,"Foi realizada as ações:"
                            +"\n"+ açao+"\n");
                    
                    JOptionPane.showMessageDialog(null,"Programa " +nome+ 
                        " removido");
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Programa "+nome+
                         " não foi removido");
                }
            }
            
            else if(menu == 3)
            {
                nome = JOptionPane.showInputDialog("Digite o nome do "
                    + " programa:");
                
                Programa prog = procurar(programa, nome, açao);
                
                if(prog != null)
                {
                    açao = JOptionPane.showInputDialog(null, 
                        "Digite a ação a realizar:\n" );
                    prog.setNome(nome);
                    prog.setAçao(açao);
                    
                    if(programa.inserir(açao))
                    { 
                        JOptionPane.showMessageDialog(null,"A ação: " +açao+
                        " \nfoi inserida");
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Erro ao inserir");
                    }
                    
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null,"Não encontrado");
                }
                
            }
            
            else if (menu == 4)
            {
                nome = JOptionPane.showInputDialog("Digite o  nome do "
                    + "programa:");
                
                Programa prog = procurar(programa, nome, açao);
                
                if(prog != null)
                {
                    JOptionPane.showMessageDialog(null, prog.getAçao() +
                        "Açaoes a serem removidas");
                    prog.getAçao().remover();
                }
                    
            }
            
            else
                break;
        }
    }
    
    public static Programa procurar( Fila<Programa> fila, String nome, String açao) 
    {
        Fila<Programa> auxiliar = new Fila(11);
        Programa programa = null;
        Boolean achou = false;

        while(!fila.estaVazia()) 
        {
            programa = fila.remover();
            if(programa.getNome().equals(nome))
            {
                achou = true;
                break;
            }
            
            else if(programa.getNome().equals(nome) && programa.getAçao().equals(açao))
            {
                achou = true;
                break;
            }

            else 
            {
                auxiliar.inserir(programa);
            }
        }

        while(!auxiliar.estaVazia()) 
        {
            Programa carro1 = auxiliar.remover();
            carro1.toString();
            fila.inserir(carro1);
        }

        if(achou)
        {
            return programa;
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Programa nao encontrado");
        }
        
        return null;
		
    } 
    
}