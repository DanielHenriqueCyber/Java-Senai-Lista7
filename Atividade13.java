import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0, soma = 0;
        System.out.print("Digite um numero: ");
        numero = sc.nextInt();
        while (numero != 0) {
            soma += numero;
            contador++;
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Quantidade de numeros: " + contador);
        System.out.println("Soma total: " + soma);
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media: " + media);
        } else {
            System.out.println("Media: 0");
        }
        sc.close();
    }
}
