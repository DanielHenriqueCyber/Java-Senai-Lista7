import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        int divisoes = 0;
        System.out.print("Digite um numero maior que 1: ");
        numero = sc.nextDouble();
        while (numero > 1) {
            numero = numero / 2;
            if (numero > 1) {
                divisoes++;
            }
        }
        System.out.println("Divisoes realizadas: " + divisoes);
        sc.close();
    }
}
