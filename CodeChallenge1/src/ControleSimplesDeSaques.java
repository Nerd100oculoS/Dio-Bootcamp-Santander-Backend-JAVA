import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for(int i = 0; i <= limiteDiario; i++){

            double valorSaque = scanner.nextDouble();

            if(valorSaque == 0) break;

            if(valorSaque <= limiteDiario){
                limiteDiario = limiteDiario - valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }else{
                System.out.print("Limite diario de saque atingido. ");
                break;
            }
        }
        System.out.print("Transacoes encerradas.");

        scanner.close();
    }
}