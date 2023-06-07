import java.util.Scanner;
/*
 *  Escreva um programa em Java que solicita 
 * ao usuário um número inteiro e apresenta seu antecessor e sucessor
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("digite um numero inteiro:");
        numero = entrada.nextInt();

       System.out.printf("\n->O numero digitado foi: %d ", numero);

       int sucessor = numero + 1;
        System.out.printf("\n->O numero sucessor de %d e : %d", numero,sucessor);
       
       int antecessor = numero - 1;
        System.out.printf("\n->O numero antecessor de %d e :  %d",numero,antecessor);

    }
}