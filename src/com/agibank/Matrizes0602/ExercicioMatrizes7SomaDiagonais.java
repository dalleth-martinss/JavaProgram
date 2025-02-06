package com.agibank.Matrizes0602;

//todo

public class ExercicioMatrizes7SomaDiagonais {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int tamMatriz = matriz.length;
        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

        System.out.println("Diagonal Principal:");
        for (int i = 0; i < tamMatriz; i++) {
            somaDiagonalPrincipal += matriz [i][i];
            somaDiagonalSecundaria += matriz [i][tamMatriz -1 -i];
        }
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundaria: " + somaDiagonalSecundaria);

        System.out.println();
    }
}


