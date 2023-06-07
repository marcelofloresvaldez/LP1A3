/*
 *  O código identificador de funcionários de uma empresa 
 * contém 7 caracteres, inicia com a sequência de caracteres BR, 
 * em seguida apresenta um número inteiro entre 0001 e 9999 e finaliza com o caractere X. 

Exemplos válidos:

BR0001X
BR1236X
BR9999X
Exemplos inválidos:

br0001X
BR126X
BR99999X
BR9999Y
Avalie os métodos da classe String e Integer e identifique quais poderiam ser utilizados para validar todos os critérios do código identificador (Não utilizar expressões regulares) (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html  https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html)
 Crie um programa em Java que solicita ao usuário um identificador e apresenta se o que foi informado é um valor válido ou inválido. 
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cod;
        System.out.println("Digite o seu codigo:");
        cod =entrada.nextLine();
        
        if (cod.length() !=7){
            System.out.println("codigo invalido");
        }else if(!cod.startsWith("BR") || !cod.endsWith("X")){
            System.out.println("codigo invalido");

        }else{
            int num = Integer.parseInt(cod,2,6,10);
            if (num <1 || num >9999){
                System.out.println("codigo invalido");
                }/* else if(cod.charAt(2)== '0' && cod.charAt(3)=='0'&& cod.charAt(4)=="0" && cod.charAt(5)=='0'){

                System.out.println("codigo invalido");

            }*/
            else{
                System.out.println("codigo valido");
            }
        }
    }
}
