package aula1.exemplos;

import java.util.Scanner;

public class introducao {
    public static void main(String[] args) {
        //comentario de uma linha
        /*
         * 
         * comentario de varias linhas
         */
        // tipos primitivos
        //inteiros 
        /* byte , short , int , long
           1 bit  2 bit  4 bit   8 bit
        -128 a 127
         *  ponto flutuante
         * float , double

         */ float  nota1 = 9.5f;
         double nota2 = 9.5;
         //char 
          char letra = 'a';
          boolean ligado = true;
          //string
          String frase = "hola mundo"; 
          System.out.println(frase);
          System.out.println(frase.toLowerCase());
          System.out.println(frase.toLowerCase());
        //Arrays
        // double[] numeros[] = new double[3]; 
        double[] numeros = {2.3, 5.3, 7.3};
        numeros[0] = 2.3;
        numeros[1] = 5.3;
        numeros[2] = 7.3;
       // numeros[8] = 8.5;
       char[] caracteres = "ola mundo".toCharArray();
       System.out.println(caracteres[0]);
        
        //variaveis constantes
        int idade = 20;
        int idade2;
        //idade2 = 22;
        //java 10 inferencia de tipo
        //constante
        final double TESTE = 10.2;
        final var SOBRENOME = "flores";
        // entrada e saida de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com seu nome");
        String nomeDigitado = sc.nextLine();



        
    }




 

    }
    

    

