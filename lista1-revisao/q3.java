import java.util.*;

public class q3 {
    
    public static void main (String[] args){
        //Escreva um programa que receba do usuário um array de números e devolva a posição
        //onde se encontra o maior valor do array.

        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        
        int posicao = 0;
        int maior = Integer.MIN_VALUE;
        

        for (int i = 0; i < array.length; i++){
            System.out.println("Digite um numero");
            array[i] = input.nextInt();

            if (array[i] > maior){
                maior = array[i];
                posicao = i;
            }

        }


        System.out.printf("O maior número do array é o %d, no índice %d", maior, posicao);

    }
}
