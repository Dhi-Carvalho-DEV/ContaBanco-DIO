import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int accountNumber;
        String bankAgency;
        String clientName;
        double balance = 237.48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta: ");
        accountNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Por favor, digite o número da agência: ");
        bankAgency = sc.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        clientName = sc.nextLine();

        System.out.println("Olá " + clientName + " obrigado por criar uma conta em nosso banco, sua agência é " + bankAgency +
                ", conta " + accountNumber + " e seu saldo de R$ " + balance + " já está disponível para saque.");

    }
}
