import java.util.*;

public class q5 {
    
    public static void main (String[] args){
        /*
        5) Faça um programa que compara dois vetores (A e B) e exibe na tela um terceiro vetor
        (C) contendo a interseção dos valores de A e B. Declare e inicialize os vetores A e B
        com 5 números inteiros cada. Use modularização.
        */ 

        int[] a = {1,2,7,4,5};
        int[] b = {1,2,3,6,7};
        int[] numeros = intersecao(a,b);

        for(int i = 0; i<numeros.length; i++)
        System.out.println(numeros[i]);

    }

    public static int[] intersecao(int[] a, int[] b){
        
        int[] c = new int[5];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if (a[i] == b[j]){
                    c[i] = b[j];
                    
                }
            }
        }

        return c;
    }


}
