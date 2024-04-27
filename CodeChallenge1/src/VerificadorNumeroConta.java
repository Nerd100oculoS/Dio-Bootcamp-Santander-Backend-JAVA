import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido.\nDigite exatamente 8 digitos.");
        }else{
            System.out.println("Numero de conta valido.");
        }
    }
}


