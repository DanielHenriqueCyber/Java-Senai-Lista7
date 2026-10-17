import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();
        while (senha != 1234) {
            System.out.print("Senha incorreta. Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido.");
        sc.close();
    }
}
