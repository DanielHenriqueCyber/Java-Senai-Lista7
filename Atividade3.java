import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero % 3 == 0) {
                soma += numero;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Soma dos multiplos de 3: " + soma);
    }
}
