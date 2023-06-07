
/*
 * Crie um programa em Java que recebe como entrada o valor de uma compra e 
 * apresenta como saída o valor final com desconto e o desconto aplicado com base nas seguintes regras:

Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
Compras iguais ou superiores a R$ 500,00 - 15% de desconto
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double compra,saida;
        float desconto;
        System.out.println("entrada compra:");
        compra = entrada.nextDouble();

    if(compra >= 500.00){
        System.out.println("desconto de 15%:");
        desconto = (float)(compra/100)*15;
        saida = compra - desconto ;
    
        System.out.printf("o valor final: "+saida+ "  R$");
    }else if(compra >= 100.00 && compra <= 499.99 )
    {
        System.out.println("desconto de 10%:");
        desconto = (float)(compra/100)*10;
        saida = compra - desconto ;
    
        System.out.printf("o valor final: "+saida+ "  R$");
    }else if(compra >= 10.00 && compra <= 99.99){
        System.out.println("desconto de 5%:");
        desconto = (float)(compra/100)*5;
        saida = compra - desconto ;
    
        System.out.printf("o valor final: "+saida+ "  R$");
    }else {
        System.out.println("sem desconto");
        saida = compra;
        System.out.printf("o valor final: "+saida+ "  R$");
    }
    }
}
