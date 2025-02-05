package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatrizesMultiplicacao {

    public static void main(String[] args) {
        // Exemplo de matrizes A e B
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Dimensões das matrizes
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;

        // Verifica se a multiplicação é possível
        if (n != B.length) {
            System.out.println("Multiplicação impossível! O número de colunas de A deve ser igual ao número de linhas de B.");
            return;
        }

        // Matriz resultante de dimensões m×p
        int[][] C = new int[m][p];

        // Realiza a multiplicação
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprime a matriz resultante
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}


