package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatrizDiagonal {

    public static void main(String[] args) {
        // Exemplo de matriz quadrada 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Dimensão da matriz
        int dimensaoMatriz = matriz.length;

        // Imprime os elementos da diagonal principal
        System.out.println("Diagonal Principal:");
        for (int i = 0; i < dimensaoMatriz; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}



