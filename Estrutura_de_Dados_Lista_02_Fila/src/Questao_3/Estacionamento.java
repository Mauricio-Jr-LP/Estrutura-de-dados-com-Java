package Questao_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Estacionamento 
{
    public static void main(String [] args)
    {
        Fila<Carro> alameda = new Fila(11);
        
        Fila<Carro> espera = new Fila(11);
        
        while(true)
        {
            Character linha = null;
            
            linha = JOptionPane.showInputDialog("Digite:\nc - para chegada de "
                + "um carro\np - para partida\ns - no caso se deseja sair")
                .charAt(0);
            
            
            if(linha == 's')
            {
                break;
            }
            
            else if(linha == 'c')
            {
                String placa = JOptionPane.showInputDialog("Digite o numero da"
                    + " placa, Por favor:");  
                
                Carro carro = new Carro(placa);
                
                if(alameda.inserir(carro))
                {
                    JOptionPane.showMessageDialog(null,"O Carro da placa "
                        + placa + " foi inserido");
                }
                
                else if(espera.inserir(carro))
                {
                    JOptionPane.showMessageDialog(null,
                            "O Carro da placa "+ placa + " esta aguardando");
                }
                
                else
                {
                     JOptionPane.showMessageDialog(null, "Estamos lotado");
                }
            }
            
            else if(linha == 'p')
            {
                String placa = JOptionPane.showInputDialog("Digite o "
                        + "numero da Placa, Por favor:");
                
                Fila<Carro> auxiliar = new Fila(11); 
                
                Carro carro = procurar(alameda, placa);
                
                if(carro != null)
                {
                    JOptionPane.showMessageDialog(null, "Encontrado, ele foi "
                        + "deslocado "+ carro.getNumero_de_contornos());
                    
                    if(!espera.estaVazia())
                    {
                        Carro carro2 = espera.remover();
                        alameda.inserir(carro2);
                        JOptionPane.showMessageDialog(null,"O Carro da placa " 
                            +carro2.getPlaca()+ " foi inserido");
                    }
		}
                
                else
                {
                    Carro carro2 = procurar(espera, placa);
                    
                    if(carro2 != null)
                    {
                        JOptionPane.showMessageDialog(null,"Ainda estamos "
                            + "cheios! Ele foi "
                            + "deslocado "+carro.getNumero_de_contornos());	
                    }
                }
            }
        }
    }
    public static Carro procurar( Fila<Carro> fila, String placa) 
    {
        Fila<Carro> auxiliar = new Fila(11);
        Carro carro = null;
        Boolean achou = false;

        while(!fila.estaVazia()) 
        {
            carro = fila.remover();
            if(carro.getPlaca().equals(placa))
            {
                achou = true;
                break;
            }

            else 
            {
                auxiliar.inserir(carro);
            }
        }

        while(!auxiliar.estaVazia()) 
        {
            Carro carro1 = auxiliar.remover();
            carro1.addNumero_de_contornos();
            fila.inserir(carro1);
        }

        if(achou)
        {
            return carro;
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Carro nao encontrado");
        }
        
        return null;
		
    } 
}