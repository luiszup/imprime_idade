import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite o ano em que você nasceu: ");
        int anoNascimento = input.nextInt();

        input.close();

        int anoAtual = 2024;
        int idade = anoAtual - anoNascimento;

        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
    }
}