import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0, contador = 0;
        while (contador < 8) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            if (numero > 50) {
                soma += numero;
            }
            contador++;
        }
        System.out.println("Soma dos maiores que 50: " + soma);
        sc.close();
    }
}
