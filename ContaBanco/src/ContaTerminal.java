import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(){

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Insira o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Insira o número da agência (XXX-X): ");
        agencia = scanner.next();

        System.out.println("Quanto deseja depositar: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta "+ numero + " e seu saldo " + saldo +  " já está disponível para saque.");

    }

}
