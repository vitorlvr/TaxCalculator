import java.util.Scanner;

public class TestaTributavel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta conta1 = new Conta(0);

        while (true) {

            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Obter saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valor = scanner.nextDouble();
                    conta1.sacar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    conta1.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Saldo: " + conta1.obterSaldo()+"\n");
                    break;
                case 4:
                    System.out.println("Até mais! \n");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
