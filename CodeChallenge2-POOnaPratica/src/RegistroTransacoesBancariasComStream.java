import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class RegistroTransacoesBancariasComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        ArrayList<Transacao> transacoes = new ArrayList<Transacao>();

        for(int i = 0; i < quantidadeTransacoes; i++){

            String tipoTransacao = scanner.next();
            double valorTransacao = scanner.nextDouble();

            Transacao transacao = null;

            if (tipoTransacao.equals("D") || tipoTransacao.equals("d")) {
                saldo += valorTransacao;
                transacao = new Transacao("d", valorTransacao);
            } else if (tipoTransacao.equals("S") || tipoTransacao.equals("s")) {
                saldo -= valorTransacao;
                transacao = new Transacao("s", valorTransacao);
            }

            transacoes.add(transacao);
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("Transacoes:");

        // Forma mais explicita (conforme o enunciado deseja)
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .toList()
                .forEach(System.out::println);

        // Forma mais direta com Consumer Interface
//        transacoes.forEach(transacao -> {
//            System.out.println(transacao.getTipo() + " de " + transacao.getValor()));
//        });
    }
}

class Transacao {
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
