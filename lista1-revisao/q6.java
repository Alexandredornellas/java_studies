 
        /*
        Faça um programa principal que defina um array de inteiros e chame três funções
        passando por parâmetro o array definido. No final, imprima o resultado das funções na
        tela.
        a. Uma função para calcular a média e retorná-la.
        b. Uma função para encontrar o maior valor e retorná-lo.
        c. Uma função para encontrar o menor valor e retorná-lo.
        */ 
        import java.util.Scanner;
        import java.util.Locale;

public class q6 {
    
    public static void main (String[] args){

        Locale us = new Locale("en", "us");
        Locale.setDefault(us);

        Scanner input = new Scanner(System.in);
        int[] array1 = new int[3];

        //Recebe os números do array que será operado.
        for(int i = 0; i<array1.length; i++){
            
            System.out.println("Informe o " + (i + 1) + "º valor");
            array1[i] = input.nextInt();
        }
        
        //recebe ação escolhida do usuário
        int escolha = escolheAcao();

        //Recebe valor que o usuário escolheu
        double resultado = acoesExistentes(escolha, array1);

        //Resposta do usuário
        System.out.printf("Voce escolheu a opcao " + escolha + " e o resultado e: %.2f ", resultado);
    }


    //Solicita ao usuário que escolha uma ação do switch case.
    public static int escolheAcao(){
        
        Scanner input = new Scanner(System.in);

        //solicita uma ação do usuário
        System.out.println("Escolha uma acao: \n 1: Media. \n 2: Maior valor. \n 3: Menor valor.");
        int acao = input.nextInt();
        return acao;
    }

    // Verifica qual dos casos foi escolhido pelo usuário
    public static double acoesExistentes(int escolha, int[] array1){

        double resultado = 0;

        switch(escolha){
            case 1:
            resultado = mediaArray(array1);

            break;
            case 2:

            resultado = maiorValor(array1);
            break;
            case 3:
            
            resultado = menorValor(array1);
            break;
            default:
            System.out.println("Você nao escolheu uma acao valida, flws.");
        }

        return resultado;
    }

    // Calcula a média dos valores passados no array.
    public static double mediaArray(int[] array1){
        double media = 0;

        for(int i = 0; i<array1.length; i++){
            media += array1[i];
        }

        media /= array1.length;

        return media;
    }

    // Retorna o maior valor do array
    public static double maiorValor(int[] array1){
        double maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i<array1.length; i++){
            if(maiorValor < array1[i]){
                maiorValor = array1[i];
            }
        }
        return maiorValor;
    }


    // Retorna o menor valor do array
    public static double menorValor(int[] array1){
        double menorValor = Integer.MAX_VALUE;

        for (int i = 0; i<array1.length; i++){
            if(menorValor > array1[i]){
                menorValor = array1[i];
            }
        }
        return menorValor;
    }

}

