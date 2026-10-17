import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        int repeticoes = 0;
        System.out.print("Digite o valor inicial: ");
        valor = sc.nextDouble();
        while (valor <= 1000) {
            valor = valor * 1.05;
            repeticoes++;
        }
        System.out.println("Repeticoes necessarias: " + repeticoes);
        sc.close();
    }
}
