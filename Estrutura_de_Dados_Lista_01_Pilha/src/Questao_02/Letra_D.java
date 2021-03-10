/*/*((H) * {([J + K])})*/

package Questao_02;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Letra_D 
{
    public static void main(String[] args)
    {
       Pilha<Character> p = new Pilha<Character>(10);
       String s = "((H)*{([J + K])})";
      
       boolean flag_erro = false;
       
       for(int i = 0; i < s.length(); i++)
       {
           char c = s.charAt(i);
           
           if((c == '(') || (c == '[') || (c == '{'))
                p.inserir(c);
           
           else if ((c == ')') || (c == ']') || (c == '}'))
            {
               char r = p.remover();
               
                if(((c == ')') && (r != '(')) || ((c == ')') && (r != '('))
                    || ((c == '}') && (r != '{')) || ((c == ')') && (r != '('))
                    || ((c == ']') && (r != '[')))
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
