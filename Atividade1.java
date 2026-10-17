
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma, limite;
        System.out.print("Digite um numero limite: ");
        limite = sc.nextInt();
        soma = 0;
        while (soma < limite) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
