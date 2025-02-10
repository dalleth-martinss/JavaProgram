package com.agibank.Maratona0702;

import java.text.DecimalFormat;


public class ExercicioMaratona0702 {

    public static void main(String[] args) {
        double P = 1000; // Contribuição mensal
        double[] taxas = {4, 6, 8, 10}; // Taxas de juros
        int[] anosContribuicao = {10, 20, 30, 40}; // Anos de contribuição
        double[][] saldoFinal = new double[taxas.length][anosContribuicao.length]; // Matriz para armazenar os saldos

        // Calculando o saldo final para cada taxa de juros e período de contribuição
        for (int i = 0; i < taxas.length; i++) {
            double taxaMensal = taxas[i] / 100 / 12; // Convertendo taxa para mensal e para decimal
            for (int j = 0; j < anosContribuicao.length; j++) {
                int meses = anosContribuicao[j] * 12;
                saldoFinal[i][j] = P * ((Math.pow(1 + taxaMensal, meses) - 1) / taxaMensal);
            }
        }

        // Formatação de valores monetários
        DecimalFormat formatoValor = new DecimalFormat("#,###,###.00");

        // Exibição dos resultados
        System.out.println("Saldo final estimado:");
        System.out.print("Taxas \\ Anos\t");
        for (int j = 0; j < anosContribuicao.length; j++) {
            System.out.print(anosContribuicao[j] + " anos\t\t");
        }
        System.out.println();

        for (int i = 0; i < taxas.length; i++) {
            System.out.print(taxas[i] + "%\t\t");
            for (int j = 0; j < anosContribuicao.length; j++) {
                System.out.print("R$ " + formatoValor.format(saldoFinal[i][j]) + "\t");
            }
            System.out.println();
        }
    }

}


/*
* para simularmos diferentes taxas de juros ao longo do tempo, utilizamos uma matriz, onde:
 as linhas representam diferentes taxas de juros  4%,6%,8%,10% que o cliente vai inserir
as colunas é o ano de contribuição que o cliente vai colocar exemplos de anos de contribuição 5, 10, 20 e 30 anos.

cada celula da matriz deve armazenar o saldo acumulado para um determinado ano e taxa de juros

exemplo de calculo dentro da matriz

matriz [i][j] = P * (1 + taxajurosemdecimal)^ (j+1)*12) - 1) / taxajurosdecimal
*
* */