import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maior, menor;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        if (numero == 0) {
            sc.close();
            return;
        }
        maior = numero;
        menor = numero;
        while (numero != 0) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
