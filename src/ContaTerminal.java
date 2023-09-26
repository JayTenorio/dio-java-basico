import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o Número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, digite a Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
    }
}
