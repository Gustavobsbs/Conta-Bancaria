import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por Favor, Digite o numero da agencia:");
        int numeroAgencia = sc.nextInt();
        System.out.println("Digite o Numero da Conta:");
        int numeroContaCliente = sc.nextInt();
        System.out.println("Digite seu Nome:");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite seu saldo:");
        float saldoCliente = sc.nextFloat();

    }

}
