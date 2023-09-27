import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por Favor, Digite o numero da agencia:");
        int numeroAgencia = sc.nextInt();
        System.out.println("Digite o Numero da Conta:");
        int numeroContaCliente = sc.nextInt();
        System.out.println("Digite seu Nome:");
        String nomeCliente = sc.next();
        System.out.println("Digite seu saldo:");
        float saldoCliente = sc.nextFloat();

        System.out.println("");

        System.out.printf("Olá " + nomeCliente);
        System.out.printf(", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia);
        System.out.printf(", conta " + numeroContaCliente);
        System.out.printf(" e seu saldo " + saldoCliente);
        System.out.println(" já está disponível para saque.");

    }

}
