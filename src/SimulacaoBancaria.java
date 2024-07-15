import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar Saldo");
            System.out.println("4.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Digite o valor para deposito: ");    
                double deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                String valorFormatado = String.format("%.1f", saldo);
                System.out.println("Saldo atual: " + valorFormatado);
                    break;
                case 2:
                // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                System.out.println("Insira o valor para saque: ");
                double saque = scanner.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente");
                }else{
                    saldo = saldo - saque;
                    String valorFormatado1 = String.format("%.1f", saldo);
                    System.out.println("Saldo atual: " + valorFormatado1);
                }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    String valorFormatado2 = String.format("%.1f", saldo);
                    System.out.println("Saldo atual: " + valorFormatado2);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}