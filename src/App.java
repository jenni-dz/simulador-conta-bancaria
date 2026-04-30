import java.util.Scanner;

import br.com.acoesconta.Deposito;
import br.com.acoesconta.Saldo;
import br.com.acoesconta.Saque;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Saldo conta = new Saldo(0.0);
        Deposito depos = new Deposito();
        Saque saque = new Saque();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println(" / / / / Conta Corrente no Banco Brasil BR / / / /");
            System.out.println("[ 1 ] Saldo\n[ 2 ] Saque\n[ 3 ] Depósito\n[ 0 ] Encerrar");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> conta.exibirSaldo();
                case 2 -> saque.realizarSaque(conta);
                case 3 -> depos.realizarDeposito(conta);
                case 0 -> System.out.println("Sessão encerrada.");  
                default -> System.out.println("Opção inválida, tente novamente!");
            }
        }
        scanner.close();
    }
}
