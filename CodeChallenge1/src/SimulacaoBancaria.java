import java.util.Scanner;

public class SimulacaoBancaria {

    private static double saldo = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    realizarDeposito(valorDeposito);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    boolean aux = realizarSaque(valorSaque);
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f \n", saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void realizarDeposito(double valor){
        saldo += valor;
        System.out.printf("Saldo atual: %.1f\n", saldo);
    }

    private static boolean realizarSaque(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.printf("Saldo atual: %.1f\n", saldo);
        return true;
    }
}

