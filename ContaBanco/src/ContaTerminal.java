import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");

        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta: ");

        String conta = scanner.next();

        System.out.println("Por favor, digite seu Nome: ");

        String cliente = scanner.next();

        System.out.println("Por favor, informe o valor em reais que estará sendo depositado: ");

        Double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.",
                cliente, agencia, conta, saldo);

    }

}
