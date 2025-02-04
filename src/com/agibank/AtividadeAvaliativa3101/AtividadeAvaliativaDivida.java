package com.agibank.AtividadeAvaliativa3101;

import java.util.Scanner;

public class AtividadeAvaliativaDivida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$ ");
        double divida = scanner.nextDouble();

        int mes = 1;  // contador dos meses

        // enquanto a divida for maior que ZERO esse trecho vai rodar
        while (divida > 0) {
            System.out.printf("Digite o valor do pagamento referente ao mês %d: R$ ", mes);
            double pagamento = scanner.nextDouble();

            // Calcula o valor excedente, se o pagamento for maior que a divida ele quita o que deve e devolve o que passou.
            if (pagamento > divida) {
                double excesso = pagamento - divida;
                System.out.printf("O valor pago no mês %d é maior que a dívida restante. Valor excedente: R$ %.2f. O valor excedente será devolvido.%n", mes, excesso);
                pagamento = divida; // Ajusta o pagamento para o valor da dívida, para que não fique negativa.
            }

            divida -= pagamento; // Atualiza a dívida após o pagamento

            if (divida > 0) {
                System.out.printf("Mês %d: Saldo restante: R$ %.2f%n", mes, divida);
            } else {
                System.out.printf("Mês %d: Dívida quitada!%n", mes);
            }

            mes++; //Atualiza o mês.
        }

        scanner.close();
    }
}

