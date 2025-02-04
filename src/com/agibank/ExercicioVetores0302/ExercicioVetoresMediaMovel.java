package com.agibank.ExercicioVetores0302;

import java.util.Scanner;

public class ExercicioVetoresMediaMovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[7]; // Vetor para armazenar os preços
        int i = 0;

        // Entrada dos preços usando um loop while
        while (i < precos.length) {
            System.out.print("Digite o preço do dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
            i++;
        }

        // Cálculo da média móvel dos últimos 3 dias
        double soma = 0;
        i = precos.length - 3; // Começa nos últimos 3 índices

        while (i < precos.length) {
            soma += precos[i];
            i++;
        }

        double media = soma / 3;

        // Exibe o resultado formatado com duas casas decimais
        System.out.printf("Média móvel dos últimos 3 dias: %.2f\n", media);

        scanner.close();
    }
}
