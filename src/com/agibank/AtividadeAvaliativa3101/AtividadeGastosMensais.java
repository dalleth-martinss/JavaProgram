package com.agibank.AtividadeAvaliativa3101;

import java.util.Scanner;

public class AtividadeGastosMensais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalGastos = 0;

        //enquanto for verdade, ele vai ficar executando esse looping
        while (true) {
            System.out.print("Digite um gasto: R$ ");
            double gastoMensal = scanner.nextDouble();
            // quando for digitado um numero < 0 ele vai imprimir o total de gatos
            if (gastoMensal < 0) {
                System.out.printf("Total gasto: R$ %.2f%n", totalGastos);
                break;
            }
            // valor total de gastosMensais vai ser atibuido para totalGastos
            totalGastos += gastoMensal;
            if (totalGastos > 5000) {
                System.out.println("Alerta: seus gastos ultrapassaram R$ 5000!");
            }
        }

     scanner.close();
    }
}