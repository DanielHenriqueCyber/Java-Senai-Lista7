import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            System.out.println("Dobro: " + (numero * 2));
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
    }
}
