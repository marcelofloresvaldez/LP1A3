import java.util.Scanner;
// Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);

        int num1,num2,num3;
        System.out.println("Media de 3 numeros: \nDigite os numeros:  ");
        num1 = entrada1.nextInt();
        num2 = entrada1.nextInt();
        num3 = entrada1.nextInt();

        int media;
        media =(num1+num2+num3)/3;
        System.out.printf("a media e: %d ", media);

    }
}
       
