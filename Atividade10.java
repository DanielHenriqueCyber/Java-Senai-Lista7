import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, somaPares = 0, somaImpares = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                somaPares += numero;
            } else {
                somaImpares += numero;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaImpares);
        sc.close();
    }
}
