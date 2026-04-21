import java.util.Scanner;
import br.com.acoesconta.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Saldo conta = new Saldo(0.0);
        Deposito depos = new Deposito();
        Saque saque = new Saque();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println(" / / / / Conta Corrente no Banco Brasil BR / / / /");
            System.out.println("Escolha uma opção \n[1] Saldo  \n[2] Saque  \n[3] Depósito  \n[4] Encerrar");

            opcao = scanner.nextInt();

            switch (opcao) {
            //case 1 ->
            //case 2 -> 
            case 4 -> System.out.println("Sessão encerrada.");    
            default -> System.out.println("Opção inválida, tente novamente!");
            }
        }
        scanner.close();
    }
}
