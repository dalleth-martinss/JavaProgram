package com.agibank.ExercicioMatrizes0502;

//todo

public class ExercicioMatrizesMultiplicacao {

    public class Main {
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
            int dimensaoM = A.length;
            int dimensaoN = A[0].length;
            int dimensaoP = B[0].length;

            // Verifica se a multiplicação é possível
            if (dimensaoN != B.length) {
                System.out.println("Multiplicação impossível! O número de colunas de A deve ser igual ao número de linhas de B.");
                return;  // Caso a multiplicação não seja possível, termina a execução
            }

            // Matriz resultante de dimensões m×p
            int[][] matrizResultante = new int[dimensaoM][dimensaoP];

            // Realiza a multiplicação de matrizes
            for (int i = 0; i < dimensaoM; i++) {
                for (int j = 0; j < dimensaoP; j++) {
                    matrizResultante[i][j] = 0;
                    for (int k = 0; k < dimensaoN; k++) {
                        matrizResultante[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            // Imprime a matriz resultante
            System.out.println("Matriz Resultado:");
            for (int i = 0; i < dimensaoM; i++) {
                for (int j = 0; j < dimensaoP; j++) {
                    System.out.print(matrizResultante[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


