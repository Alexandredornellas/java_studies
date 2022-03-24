/**Faça um programa que receba do usuário o seu celular, CPF e CEP. Deve ser digitado
somente números, por exemplo: 81988887777 (11 caracteres); 12345678900 (11
caracteres); 50123456 (8 caracteres).
Se o usuário digitar qualquer informação com a quantidade de caracteres errada, o
programa deve exibir uma mensagem de erro e pedir para informar novamente.

Se os dados estiverem corretos, o programa deve aplicar a formatação e imprimir na tela
os dados formatados. Por exemplo: (81) 9 8888-7777 (celular); 123.456.789-00 (CPF);
50123-456 (CEP). Crie uma função para aplicar cada formatação, individualmente.
Consulte os métodos da API de String para descobrir como fazer a formação. */

import java.util.Scanner;

public class q8 {
    public static void main (String[] args){

        String cel = receiveCel();
        String cpf = receiveCPF();
        String cep = receiveCEP();

        String celF = addCelMask(cel);
        String cpfF = addCpfMask(cpf);
        String cepF = addCepMask(cep);


        System.out.printf("\n================== \nCelular: %s \nCPF: %s \nCEP: %s\n==================\n", celF, cpfF, cepF);


    }

    // Receive celphone value and check if it received the amout of characteres requested
    public static String receiveCel(){
        Scanner input = new Scanner(System.in);
        String cel;
        boolean valid = false;

        do{
            System.out.println("Digite o número de telefone com 11 digitos");
            cel = input.nextLine();
            boolean matched = cel.length() == 11;

            if(!matched){
                System.out.println("Insira um número com 11 digitos!");
                cel = input.nextLine();
                continue;
            }
            valid = true;

            } while (!valid);

        return cel;

    }

  
    // Receive CPF value and check if it received the amout of characteres requested
    public static String receiveCPF(){
        Scanner input = new Scanner(System.in);
        String cpf;
        boolean valid = false;

        do{
            System.out.println("Digite o seu CPF com 11 digitos");
            cpf = input.nextLine();
            boolean matched = cpf.length() == 11;

            if(!matched){
                System.out.println("Insira um número com 11 digitos!");
                continue;
            }
            valid = true;

            } while (!valid);

        return cpf;

    }

    // Receive CEP value and check if it received the amout of characteres requested
    public static String receiveCEP(){
        Scanner input = new Scanner(System.in);
        String cep;
        boolean valid = false;

        do{
            System.out.println("Digite o seu CEP com 8 digitos");
            cep = input.nextLine();
            boolean matched = cep.length() == 8;

            if(!matched){
                System.out.println("Insira um número com 8 digitos!");
                continue;
            }
            valid = true;

            } while (!valid);

        return cep;

    }


    // ADDS cellphone number mask (11) 98765-4321
    public static String addCelMask(String cel){
        String celF1 =cel.substring(0,2);
        String celF2 =cel.substring(2,3);
        String celF3 =cel.substring(3,7);
        String celF4 =cel.substring(7);

        String celF = "(" + celF1 + ") " + celF2 + " " + celF3 + "-" + celF4;

        return celF;
    }


    // adds CPF number mask 111.222.333-44
    public static String addCpfMask(String cpf){
        String cpfF1 = cpf.substring(0,2);
        String cpfF2 = cpf.substring(2,3);
        String cpfF3 = cpf.substring(3,7);
        String cpfF4 = cpf.substring(7);

        String cpfF = cpfF1 + "." + cpfF2 + "." + cpfF3 + "-" + cpfF4;  //111.222.333-44

        return cpfF;
    }

    // adds CEP number mask 11.222-333
    public static String addCepMask(String cep){
        String cepF1 = cep.substring(0,2);
        String cepF2 = cep.substring(2,4);
        String cepF3 = cep.substring(4);

        String cepF = cepF1 + "." + cepF2 + "-" + cepF3; //54.400-180
        return cepF;
    }

}