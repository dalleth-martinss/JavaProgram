package com.agibank.ExercicioVetores0402;

//todo

public class ExercicioVetoresCarteiraAcoes {

    public static void main(String[] args) {
        // Valores das ações na carteira
        double[] carteira = {5000.0, 3000.0, 7000.0, 4000.0, 6000.0};

        // Calculando o total investido
        double totalInvestido = 0; // acumulador de valores
        for (int i = 0; i < carteira.length; i++) { // Laço for normal para percorrer o vetor
            totalInvestido += carteira[i];
        }
        // Exibindo o total investido
        System.out.printf("Total investido: R$ %.2f%n", totalInvestido);

        // Calculando e exibindo a porcentagem de cada ação
        System.out.print("Percentual de cada ação: ");
        for (int i = 0; i < carteira.length; i++) { // Laço for normal para percorrer o vetor
            double percentual = (carteira[i] / totalInvestido) * 100;
            System.out.printf("%.2f%% ", percentual);
        }
    }
}

