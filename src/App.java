import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(" / / / / Conta Corrente no Banco Brasil BR / / / /");
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Escolha uma opção [1] Saldo  [2] Saque  [3] Depósito  [4] Encerrar");
        
        Integer opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                
                break;
            case 2:
                
                break;    
            case 3:
                
                break;
            case 4:
                System.out.println("Sessão encerrada.");
                break;    
            default:
                System.out.println("Opção inválida, tente novamente!");
                break;
        }
        scanner.close();
    }
}
