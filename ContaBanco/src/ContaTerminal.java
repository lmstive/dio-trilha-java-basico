import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.print("Digite o número da Conta: ");
        int numeroConta = sc.nextInt();

        // Limpa o buffer do scanner
        sc.nextLine();

        // Solicita e lê o número da agência
        System.out.print("Digite o número da Agência: ");
        String agencia = sc.nextLine();

        // Solicita e lê o nome do cliente
        System.out.print("Digite o seu Nome: ");
        String nomeCliente = sc.nextLine();

        // Solicita e lê o saldo da conta
        System.out.print("Digite o seu Saldo: ");
        double saldo = sc.nextDouble();


        String saldoFormatado = String.format("%.2f", saldo);


        // Exibe a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoFormatado + " já está disponível para saque.");

        // Fecha o scanner
        sc.close();
    }
}