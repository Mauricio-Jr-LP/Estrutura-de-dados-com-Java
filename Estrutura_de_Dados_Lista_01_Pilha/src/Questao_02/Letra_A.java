/*a. (A + B} )*/

package Questao_02;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_A 
{
    public static void main(String[] args)
    {
       Pilha <Character> p = new Pilha(10);
       
       String s = "(A + B})";
      
       boolean flag_erro = false;
       
       for(int i = 0; i< s.length(); i++)
       {
           char c = s.charAt(i);
           
           if(c == '(')
               p.inserir(c);
           
           else if ((c == ')') || (c == '}'))
           {
               char r = p.remover();
               
               if (((c == ')') && (r != '(')) || ((c == '}')))
               {
                   flag_erro = true;
                   break;
               }
           }
       } 
       
       if(p.estaVazia() == false)
           flag_erro = true;
       
       //exigindo resultados
       
       if(flag_erro)
           JOptionPane.showMessageDialog(null,"A string: " +s+ " possui erro");
       
       else
           JOptionPane.showMessageDialog(null,"A string: " +s+ " esta correto");
    }
}