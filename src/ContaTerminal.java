import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o Código da Agência: ");
        agencia = sc.next();
        System.out.print("Por favor, digite o Número da Conta: ");
        numero = sc.nextInt();
        System.out.print("Por favor, digite o Nome do Cliente: ");
        nomeCliente = sc.next().toUpperCase();
        sc.nextLine();
        System.out.print("Por favor, digite um Saldo inicial: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}