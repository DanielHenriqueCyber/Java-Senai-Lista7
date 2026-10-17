import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero >= 20 && numero <= 80) {
                contador++;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Valores entre 20 e 80: " + contador);
        sc.close();
    }
}
