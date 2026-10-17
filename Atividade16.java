import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero >= 10 && numero <= 50) {
                contador++;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Valores entre 10 e 50: " + contador);
        sc.close();
    }
}
