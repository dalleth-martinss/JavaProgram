package com.agibank.TryCatch1302;

import java.util.Scanner;

public class ExercicioTryCatchMediaGastos302 {

    public static void main(String[] args) {
        // Vetor com os gastos de 12 meses
        double[] gastos = {1288, 1350, 1180, 125, 140, 1300, 1250, 1400, 150, 1600, 1550, 1650};

        // Calcula a média dos gastos mensais
        double media = calcularMedia(gastos);

        // Conta quantos meses tiveram gastos acima da média
        int mesesAcimaDaMedia = contarMesesAcimaDaMedia(gastos, media);

        // Exibe os resultados
        System.out.printf("Média de gasto: %.2f\n", media);
        System.out.println("Meses acima da média: " + mesesAcimaDaMedia);
    }

    // Método para calcular a média dos gastos mensais
    public static double calcularMedia(double[] gastos) {
        double soma = 0;
        for (double gasto : gastos) {
            soma += gasto;
        }
        return soma / gastos.length;
    }

    // Método para contar quantos meses tiveram gastos acima da média
    public static int contarMesesAcimaDaMedia(double[] gastos, double media) {
        int contador = 0;
        for (double gasto : gastos) {
            if (gasto > media) {
                contador++;
            }
        }
        return contador;
    }
        }


