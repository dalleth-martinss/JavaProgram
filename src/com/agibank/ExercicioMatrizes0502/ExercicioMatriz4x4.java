package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatriz4x4 {

    public static void main(String[] args) {
        // Exemplo de matriz 4x4
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Inicializa variáveis para as somas
        int somaTotal = 0;
        int[] somaLinhas = new int[4];
        int[] somaColunas = new int[4];

        // Calcula as somas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaTotal += matriz[i][j];
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        // Imprime os resultados
        System.out.println("Soma de todos os elementos: " + somaTotal);

        for (int i = 0; i < 4; i++) {
            System.out.println("Soma dos elementos da linha " + (i + 1) + ": " + somaLinhas[i]);
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Soma dos elementos da coluna " + (j + 1) + ": " + somaColunas[j]);
        }
    }
}




