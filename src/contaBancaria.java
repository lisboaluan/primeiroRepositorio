import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {

        String nome = "Luan Lisboa";
        String tipoConta = "Corrente";
        double saldo = 3000.00;

        System.out.println("*********");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: R$ " + saldo);
        System.out.println("\n*********\n");

        String menu = """ 
                      Digite sua opção:
                      1 - Consultar Saldo
                      2 - Transferir Valor
                      3 - Depositar Valor
                      4 - Sair
                      """;

        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O seu saldo atual é: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor: R$ ");
                double transferencia = leitura.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência.");
                } else {
                    saldo -= transferencia;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor a ser depositado: R$ ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida!");
            }
        }
    }
}