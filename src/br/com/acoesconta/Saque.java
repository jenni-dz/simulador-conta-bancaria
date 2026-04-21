package br.com.acoesconta;
import java.util.Scanner;

public class Saque {
    private Scanner scanner = new Scanner(System.in);

    public void realizarSaque(Saldo conta) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("SAQUE");
            System.out.println("[1] Realizar Saque \n [2] Voltar ao Menu");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Informe o valor para sacar: R$ ");
                    double valor = scanner.nextDouble();

                    if (valor <0){
                        System.out.println("Valor inválido.");
                    } else if (valor > conta.getSaldo()) {
                        System.out.println("Saldo insuficiente.");
                        conta.exibirSaldo();
                    } else {
                        conta.setSaldo((conta.getSaldo() - valor));
                        System.out.printf("Saque de R$ %.2f realizado.%n", valor);
                        conta.exibirSaldo();
                    }
                }   
                case 2 -> System.out.println("Voltando ao menu...");    
                default -> System.out.println("Opção inválida.");
            }
  
        }
    }    
}
