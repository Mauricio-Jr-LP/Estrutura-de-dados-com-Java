/*3 – [Médio] O Estacionamento de Scratchemup contém uma única alameda que 
guarda até dez carros. Os carros entram pela extremidade sul do estacionamento e 
saem pela extremidade norte. Se chegar um cliente para retirar um carro que não 
esteja estacionado na posição do extremo-norte, todos os carros ao norte do 
carro serão deslocados para fora, o carro sairá do estacionamento e os outros 
carros voltarão à mesma ordem em que se encontravam inicialmente. Sempre que 
um carro deixa o estacionamento, todos os carros ao sul são deslocados para 
frente, de modo que, o tempo inteiro, todos os espaços vazios estão na parte 
sul do estacionamento. 
Escreva um programa que leia um grupo de linhas de entrada: 
• Cada linha contém um 'C', de chegada, ou um 'P', de partida, além de um número
de placa de licenciamento. 
• Presume-se que os carros chegarão e partirão na 
ordem especificada pela entrada do usuário.  
• O programa deve imprimir uma 
mensagem cada vez que um carro chegar ou partir.  
• Quando um carro chegar, a mensagem deverá especificar se existe ou não vaga 
para o carro dentro do estacionamento.  
• Se não existir vaga, o carro esperará pela vaga ou até que uma linha de 
partida seja lida para o carro. Quando houver espaço disponível, outra mensagem 
deverá ser impressa. 
• Quando um carro partir, a mensagem deverá incluir o número de vezes que o 
carro foi deslocado dentro do estacionamento, incluindo a própria partida, mas 
não a chegada.  
• Esse número será 0 se o carro for embora a partir da linha de espera.

frente, de modo que, o tempo inteiro, todos os espaços vazios estão na parte sul
do estacionamento. 
*/

package Questao_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 * @param <T>
 */

public class Fila <T>
{
    private T[] arrayFila; 
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
            System.out.println(s);
        
            if(i == arrayFila.length)
            {
                i = 0;
            }
            
            if(i == fim-1)
            {
                s+=arrayFila[i];
            }
            
            else 
            {
                s+=arrayFila[i] + " , ";
            }
        
            i++;
    		
        }
        
        return s + "]";  
        
    }
        
    public boolean estaCheia()
    {
	return ((fim == arrayFila.length-1) && (inicio == 0) )|| 
            (fim == inicio-1);
    }
    
    public boolean estaVazia()
    {
        return inicio == fim;
    }
    
    public boolean inserir(T elemento) 
    { 
        if(fim == arrayFila.length)
        {
            fim = 0;
        }
            if(!estaCheia())
            {
                arrayFila [fim++] = elemento; 
//                JOptionPane.showMessageDialog(null,"inserindo  " + fim);
                return true;
            }
        
            return false;
        
    }
    
    public T remover() 
    {
        if(!estaVazia())
        {
            T elemento = arrayFila[inicio];
            inicio++;
            return elemento; 
        } 
        
        return null;
        
    }
    
}
