import java.util.Scanner;
public class q2 {
    
    public static void main (String[] args){
        //Construa um método capaz de calcular a exponenciação para qualquer base e expoentes
        //de um número inteiro positivo sem usar o método pow da classe Math do Java.
        Scanner input = new Scanner(System.in);
        int base = 0;
        int potencia = 0;
        int result = 1;

        System.out.println("Escreva o valor da base");
        base = input.nextInt();
        System.out.println("Escreva o valor da potência");
        potencia = input.nextInt();

        for (int i = 0; i < potencia; i++){
            result *= base;
        }
        System.out.println("A conta fica: " + base + "^" + potencia + " e seu resultado é:" + result);
    }
}
