package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatrizTransposta {

    public static void main(String[] args) {
        // Exemplo de matriz m×n
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Dimensões da matriz
        int m = matriz.length;
        int n = matriz[0].length;

        // Matriz transposta de dimensões n×m
        int[][] transposta = new int[n][m];

        // Calcula a transposta
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // Imprime a matriz transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}



