import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome e sobrenome:");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu número de conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }    
}
