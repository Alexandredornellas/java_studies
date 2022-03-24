import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    
    public static void main (String[] args){
        /*
        Escrever um programa que lê 10 números inteiros e armazene esses valores em um
        array. O programa deve calcular a média aritmética dos valores do vetor e imprimir na
        tela todos os valores menores do que a média calculada. Use modularização.
        */

        Scanner input = new Scanner(System.in);
        int[] inteiros = new int[10];

        //media = soma dos termos / total termos.
        int tamanho = inteiros.length;
        int soma = 0;
        double media = 0;

        for (int i = 0; i < inteiros.length; i++){
            System.out.println("Digite um numero");
            inteiros[i] = input.nextInt();
            soma += inteiros[i];
        }

        media = soma/tamanho;
        System.out.printf("Seu array e %s e a media e %.1f", Arrays.toString(inteiros), media);
    }
}
