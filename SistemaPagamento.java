package sistemaBancario;
import java.util.Scanner;


public class SistemaPagamento {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double saldo = 1000.00;
        int x;
        double temp;

        do {
            System.out.println("1 - Ver Saldo.");
            System.out.println("2 - Fazer Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair do Sistema");
            x = input.nextInt();
            
            switch (x) {
            case 1:
                System.out.println("Saldo: "+saldo);
                break;
            case 2:
                System.out.println("Realizar Depósito");
                System.out.println("Digite o valor a ser depositado: ");
                temp = input.nextDouble();
                
                saldo += temp;
                temp = 0;
                
                break;
            case 3:
                System.out.println("Realizar Saque");
                System.out.println("Digite o valor a ser Sacado: ");
                temp = input.nextDouble();
                
                saldo -= temp;
                temp = 0;
                
                break;
            case 4:
                System.out.println("Finalizando Sistema...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida");
            }
        }while(true);
    }

}