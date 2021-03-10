package Dicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Invertendo 
{
    public static void main(String[] args) 
    {
        //Criando as pilhas
        Pilha<Integer> p = new Pilha(10);
        Pilha<Integer> p2 = new Pilha(10);

        Integer numero = 0;
        
        while(p.inserir(numero))
        {
            System.out.println("Inserido "+ numero +"\n");		
            numero++;
        }

        System.out.println("-------------------------");

        //Invertendo uma Pilha
        numero = p.remover();

        while(numero != null)
        {
            p2.inserir(numero);

            System.out.println("Removendo de p1/Inserido em p2 "+ numero +"\n");		

            numero = p.remover();
        }

        System.out.println("-------------------------");
    }
    
}