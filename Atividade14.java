import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.print("Digite uma nota: ");
        nota = sc.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.print("Nota invalida. Digite novamente: ");
            nota = sc.nextDouble();
        }
        System.out.println("Nota valida digitada: " + nota);
        sc.close();
    }
}
