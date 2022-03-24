//Faça um programa que receba uma frase e uma palavra. Calcule e mostre a quantidade
//de vezes que a palavra digitada aparece na frase.

import java.util.Scanner;
public class q7 {
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = input.nextLine();
        String[] fraseArray = frase.split("\\s+");

        System.out.println("Qual palara voce quer contar na frase?");
        String palavra = input.nextLine();

        int repeticoes = 0;
        for(int i = 0; i < frase.length(); i++){

            if(frase.substring(i).startsWith(palavra)){
                repeticoes++;
                
            }
        }   

        System.out.println("A palavra repete " + repeticoes + " vezes");

    }
}
