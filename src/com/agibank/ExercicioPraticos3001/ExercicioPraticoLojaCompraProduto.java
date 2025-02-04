package com.agibank.ExercicioPraticos3001;
import java.util.Scanner;

public class ExercicioPraticoLojaCompraProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarClientes = true;

        while (continuarClientes) {
            double totalCompra = 0.0;
            boolean continuarProdutos = true;

            System.out.println("\nNovo cliente:");
            while (continuarProdutos) {
                System.out.print("Digite o valor do produto (ou 0 para finalizar): ");
                double valorProduto = scanner.nextDouble();

                if (valorProduto == 0) {
                    continuarProdutos = false;
                } else {
                    totalCompra += valorProduto;
                }
            }

            System.out.println("\nFaixa de descontos:");
            double desconto = 0.0;

            if (totalCompra > 0) {
                System.out.printf("Até %.2f -> 0%%\n", totalCompra);
            }
            if (totalCompra > 300) {
                System.out.printf("Até %.2f -> 5%%\n", Math.min(500, totalCompra));
                desconto = 5.0;
            }
            if (totalCompra > 500) {
                System.out.printf("Até %.2f -> 10%%\n", Math.min(1000, totalCompra));
                desconto = 10.0;
            }
            if (totalCompra > 1000) {
                System.out.printf("Até %.2f -> 12%%\n", totalCompra);
                desconto = 12.0;
            }

            double valorDesconto = (totalCompra * desconto) / 100;
            double totalPagar = totalCompra - valorDesconto;

            System.out.printf("\nTotal da compra: R$ %.2f\n", totalCompra);
            System.out.printf("Desconto aplicado: %.0f%% (R$ %.2f)\n", desconto, valorDesconto);
            System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);

            System.out.print("\nDeseja atender outro cliente? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuarClientes = false;
            }
        }

        System.out.println("Encerrando o sistema...");
        scanner.close();
    }
}

