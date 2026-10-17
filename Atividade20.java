import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, total = 0, valorFinal;
        System.out.print("Digite o valor do produto: ");
        valor = sc.nextDouble();
        while (valor != 0) {
            total += valor;
            System.out.print("Digite o valor do produto: ");
            valor = sc.nextDouble();
        }
        System.out.println("Total da compra: R$ " + total);
        valorFinal = total;
        if (total > 500) {
            valorFinal = total * 0.90;
        }
        System.out.println("Valor final: R$ " + valorFinal);
        sc.close();
    }
}
