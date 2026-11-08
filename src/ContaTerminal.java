import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero = lerInteiro(scanner, "Por favor, digite o número da Conta!");
        String agencia = lerTexto(scanner, "Por favor, digite o número da Agência!");
        String nomeCliente = lerTexto(scanner, "Por favor, digite o nome do Cliente!");
        double saldo = lerDecimal(scanner, "Por favor, digite o Saldo!");

        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

        scanner.close();
    }

    private static String lerTexto(Scanner scanner, String mensagem) {
        String valor;
        do {
            System.out.println(mensagem);
            valor = scanner.nextLine().trim();
            if (valor.isEmpty()) {
                System.out.println("O campo não pode ficar vazio.");
            }
        } while (valor.isEmpty());
        return valor;
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            String entrada = lerTexto(scanner, mensagem);
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite apenas números inteiros.");
            }
        }
    }

    private static double lerDecimal(Scanner scanner, String mensagem) {
        while (true) {
            String entrada = lerTexto(scanner, mensagem).replace(",", ".");
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Use o formato 1500.50 ou 1500,50.");
            }
        }
    }
}
