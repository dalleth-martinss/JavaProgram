package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatrizes {

    public static void main(String[] args) {
        // Cria uma matriz 3x3 - Primeiro é linha e depois Coluna.
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Imprime a matriz no formato de tabela
        for (int i = 0; i < 3; i++) {  //  imprimi a linha
            for (int j = 0; j < 3; j++) {  // imprime a coluna
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}


