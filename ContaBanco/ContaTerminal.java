package ContaBanco;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("#### Seja bem vindo a criação de sua conta ####");

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu nome: ");
        String nome = scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        String nomeCompleto = String.join(" ", nome, sobrenome);

        System.out.println("Por favor, informe o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o número de conta de sua preferência:");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o saldo que será depositado:");
        String saldo = NumberFormat.getCurrencyInstance().format(scanner.nextDouble());

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é R$ " + saldo + ", já está disponível para saque.");

    }
}
