import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maiores50 = 0, menores20 = 0, contador = 0;
        while (contador < 10) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            if (numero > 50) {
                maiores50++;
            } else if (numero < 20) {
                menores20++;
            }
            contador++;
        }
        System.out.println("Maiores que 50: " + maiores50);
        System.out.println("Menores que 20: " + menores20);
        sc.close();
    }
}
