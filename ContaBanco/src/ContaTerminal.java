import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int agencia;
        String conta;
        String nomeCliente;
        float saldo;

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Por favor, insira o número da agência: [Ex: 1234]");
            agencia = scan.nextInt();

            System.out.println("Insira o número da conta: [Ex: 12345678-9]");
            conta = scan.next();

            System.out.println("Infome o seu nome: ");
            nomeCliente = scan.next();

            System.out.println("Informe o saldo que deseja inserir: [Ex: 123.45]");
            saldo = scan.nextFloat();

            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                    agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Formato não permitido, insira os dados novamente.");
        }
    }
}
