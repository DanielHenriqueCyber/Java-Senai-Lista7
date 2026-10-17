import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0, contador = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            if (numero > 100) {
                soma += numero;
                contador++;
            }
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media dos maiores que 100: " + media);
        } else {
            System.out.println("Nenhum numero maior que 100 foi digitado.");
        }
        sc.close();
    }
}
