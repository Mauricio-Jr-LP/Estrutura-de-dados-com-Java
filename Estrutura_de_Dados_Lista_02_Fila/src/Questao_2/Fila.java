/*2 - [Simples] Implemente uma função de inserção na Fila que só aceite letras 
em ordem crescente. Para cada letra Li candidata a entrar na Fila, deve-se 
verificar se a última letra Li-1 na fila é menor que a letra.   
Dica: Use o método getNumericValue da Classe Character. 
Veja: www.tutorialspoint.com/java/lang/character_getnumericvalue .htm */

package Questao_2;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Fila <T>
{
    T[] arrayFila; 
    private int inicio; 
    private int fim;

    public Fila(int size) 
    {
        inicio = fim = 0;
        arrayFila =(T[]) new Object[size];
    }
    
    @Override
    public String toString()
    {
        String s = "[";
        int i = inicio;
        
        while(i != fim)
        {
            if( i == arrayFila.length)
            {
                i = 0;
            }
            
            if(s == "[")
                s += arrayFila[i];
            else 
                s += ","+arrayFila[i];
            
            
            i++;
             
        }
        
        return s+"]";
    
        
    }
        
    
    public void inserir(T elemento) 
    { 
        if(fim == arrayFila.length)
        {
            fim = 0;
        }
        
        if(!estaCheia())
        {
            arrayFila [fim] = elemento; 
            fim++;
        }   
    }
    
    public boolean estaCheia() 
    {
        if( ( (fim == arrayFila.length-1) && (inicio == 0) ) || (fim == inicio-1))
            return true;
        
        else
            return false;
    }

    public T remover() 
    {
        if(fim == arrayFila.length)
        {
            inicio = 0;
        }
        
        else if(!estaVazia())
        {
            T e = arrayFila[inicio];
            inicio++;
            return e; 
        } 
        return null;
        
        
    }

    public boolean estaVazia() 
    {
        return inicio == fim; 
    }
    
    //Não cancela a fila mais nao permite adicionar valores menores a o anterior
    
    public static void main(String [] args)
    {

        System.out.println("Digite a quantidade de letras:");
        Scanner n = new Scanner(System.in);
        int num = 1+  n.nextInt();
        
        
        Fila f = new Fila(num);
        Fila ff = new Fila(num);
        
        int resultado = 0, resultado2 = 0;
        
        for(int i = -1; i<=num; i++)
        {
           while(!f.estaCheia())
           { 
                System.out.println("Digite a letra:");
                Scanner s = new Scanner(System.in);
                char[] valor = s.nextLine().toCharArray();

                for (char ch : valor) 
                {
                    resultado = Character.getNumericValue(ch);
                    System.out.println("Letra: "+ch+" \nO valor do numero é: " 
                        + resultado);
                    
                    f.inserir(resultado);
                    ff.inserir(ch);
                    
                    System.out.println("Digite a letra:");
                    Scanner sc = new Scanner(System.in);
                    char[] valor2 = sc.nextLine().toCharArray();

                    for (char ch2 : valor2) 
                    {
                        resultado2 = Character.getNumericValue(ch2);
                        System.out.println("Letra: "+ch2+"\nO valor do numero"
                            + " é: " + resultado2);

                        if(resultado < resultado2)
                        {
                            f.inserir(resultado2);
                            ff.inserir(ch2);
                            i++;
                        } 
                    }
                    
                    while(resultado > resultado2)
                        System.out.println("Erro, valor invalido"
                            + "\n Encerre o sistema"); break;
                
                }
            }
        }
        
        System.out.println("Letras:"+ff);
        System.out.println("Valores:"+f);
    }
}