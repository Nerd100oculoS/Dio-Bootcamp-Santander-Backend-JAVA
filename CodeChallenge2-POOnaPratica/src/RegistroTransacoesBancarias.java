import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        ArrayList<String> transacoes = new ArrayList<String>();

        for(int i = 0; i < quantidadeTransacoes; i++){

            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

            if (tipoTransacao.equals("D") || tipoTransacao.equals("d")) {
                saldo += valorTransacao;
                transacoes.add(i+1+ ". Deposito de " + valorTransacao);
            } else if (tipoTransacao.equals("S") || tipoTransacao.equals("s")) {
                saldo -= valorTransacao;
                transacoes.add(i+1+ ". Saque de " + valorTransacao);
            } else {

                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }


        System.out.println("\nSaldo: " + saldo);
        System.out.println("Transacoes:");

        for(String trans: transacoes){
            System.out.println(trans);
        }
    }
}

