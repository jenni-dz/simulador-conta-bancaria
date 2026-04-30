package br.com.acoesconta;
import java.util.Scanner;

public class Deposito {
    private Scanner scanner = new Scanner(System.in);

    public void realizarDeposito(Saldo conta) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("/ / / DEPÓSITO / / /");
            System.out.println("[ 1 ] Realizar depósito");
            System.out.println("[ 0 ] Voltar ao menu");
            System.out.println("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o valor para depositar: R$ ");
                    double valor = scanner.nextDouble();

                    if (valor <= 0) {
                        System.out.println("( X ) Valor inválido.");
                    } else {
                        conta.setSaldo(conta.getSaldo() + valor);
                        System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
                        conta.exibirSaldo();
                    }
                }
                case 0 -> System.out.println("( <- ) Voltando ao menu...");
                default -> System.out.println("( X ) Opção inválida.");
            }
        }
    }
}
