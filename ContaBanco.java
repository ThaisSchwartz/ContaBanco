import java.util.Locale;
import java.util.Scanner;

public class ContaBanco{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = "MARIO ANDRADE";
        double saldo = 237.48;

        System.out.println("Digite o número da agência (com hífen): ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.");


    }
}