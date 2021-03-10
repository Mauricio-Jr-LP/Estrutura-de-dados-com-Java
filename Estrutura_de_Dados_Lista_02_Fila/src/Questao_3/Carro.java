package Questao_3;

/**
 *
 * @author Mauricio
 */

public class Carro 
{
    private String placa;
    private int numero_de_contornos;

    Carro(String placa) 
    {
        this.placa = placa;
        numero_de_contornos = 0;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public int getNumero_de_contornos() 
    {
        return numero_de_contornos;
    }

    public void setNumero_de_contornos(int numero_de_contornos) 
    {
        this.numero_de_contornos = numero_de_contornos;
    }
    
    public void addNumero_de_contornos() 
    {
        this.numero_de_contornos++;
    }
}
