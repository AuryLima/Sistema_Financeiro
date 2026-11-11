import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dados do cliente e saldo inicial
        String nomeCliente = "João da Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        
        // Exibição dos dados iniciais
        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo conta:      " + tipoConta);
        System.out.println("Saldo atual:     R$ " + String.format("%.2f", saldo));
        System.out.println("***************************************\n");

        int opcao = 0;

        // Menu de operações
        while (opcao != 4) {
            System.out.println("\nOperações disponíveis:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor (Depósito)");
            System.out.println("3. Transferir / Sacar valor");
            System.out.println("4. Sair");
            System.out.print("\nDigite a opção desejada: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("\nO seu saldo atual é: R$ %.2f\n", saldo);
                    break;
                
                case 2:
                    System.out.print("Informe o valor a receber: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.printf("Depósito realizado! Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;

                case 3:
                    System.out.print("Informe o valor que deseja sacar/transferir: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente para realizar esta operação!");
                    } else if (valorSaque > 0) {
                        saldo -= valorSaque;
                        System.out.printf("Saque realizado! Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema. Obrigado por usar nossos serviços!");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 4.");
                    break;
            }
        }
        
        scanner.close();
    }
}
