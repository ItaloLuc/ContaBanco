// 1 - Importando a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2 - Exibindo mensagem para o usuário
        System.out.println("Digite o número da conta:");
        // 3 - Obtendo valores digitados no Terminal pelo Scanner
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha deixada pelo nextInt()

        // 2 - Exibindo mensagem para o usuário
        System.out.println("Digite o número da agência:");
        // 3 - Obtendo valores digitados no Terminal pelo Scanner
        String agencia = scanner.nextLine();

        // 2 - Exibindo mensagem para o usuário
        System.out.println("Digite o nome do cliente:");
        // 3 - Obtendo valores digitados no Terminal pelo Scanner
        String nomeCliente = scanner.nextLine();

        // 2 - Exibindo mensagem para o usuário
        System.out.println("Digite o saldo da conta:");
        // 3 - Obtendo valores digitados no Terminal pelo Scanner
        String saldoString = scanner.nextLine();
        saldoString = saldoString.replace(',', '.'); // Substitui vírgula por ponto para entrada de saldo
        double saldo = Double.parseDouble(saldoString);

        // 4 - Exibindo mensagem final da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
