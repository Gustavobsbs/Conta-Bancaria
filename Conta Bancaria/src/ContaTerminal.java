import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por Favor, Digite seu nome:");
       

        Scanner sc = new Scanner(System.in);
          String nomeCliente = sc.nextLine();
        System.out.println("seu nome é:" + nomeCliente);

    }
}
