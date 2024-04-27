import java.util.Scanner;

public class Contador {

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm <= parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i++) System.out.printf("Imprimindo o número %d%n", i);

    }
    public static void main() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm,parametroDois);
        }catch(ParametrosInvalidosException ePIE){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}

class ParametrosInvalidosException extends Exception{}

