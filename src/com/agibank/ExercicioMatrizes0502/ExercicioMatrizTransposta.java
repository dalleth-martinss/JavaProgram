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
        int dimensaoM = matriz.length;
        int dimensaoN = matriz[0].length;

        // Matriz transposta de dimensões n×m
        int[][] transposta = new int[dimensaoN][dimensaoM];

        // Calcula a transposta
        for (int i = 0; i < dimensaoM; i++) {
            for (int j = 0; j < dimensaoN; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // Imprime a matriz transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < dimensaoN; i++) {
            for (int j = 0; j < dimensaoM; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}



