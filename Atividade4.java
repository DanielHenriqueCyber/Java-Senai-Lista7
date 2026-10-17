import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0, contador = 0;
        System.out.print("Digite un numero: ");
        numero = sc.nextInt();
        while (numero >= 0) {
            soma += numero;
            contador++;
            System.out.print("Digite un numero: ");
            numero = sc.nextInt();
        }
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("Media dos positivos: " + media);
        } else {
            System.out.println("Nenhum numero positivo foi digitado.");
        }
        sc.close();
    }
}
