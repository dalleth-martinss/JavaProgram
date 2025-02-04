package com.agibank.ExercicioVetores0302;

//todo

import java.util.Scanner;

public class ExercicioVetoresTendencia  {
        public static void main(String[] args) {
           // Vetor de preços diários
//
//         int[] precosDiarios = {10, 12, 11, 14, 15, 17, 13, 16, 18, 19};
//            for (int i = 0; i < precosDiarios.length-2; i++) {
//                if (precosDiarios[i] < precosDiarios[i+1] && precosDiarios[i+1] < precosDiarios[i+2]){
//                    System.out.printf("Tendencia entre os dias %d e %d", i+1, i+3);
//                }
//            }


//===============  EXERCICIOS 1.2
    int[] precosDiarios = {10, 12, 11, 14, 15, 17, 13, 16, 18, 19};

        for (int i = 0; i < precosDiarios.length-2; i++) {
        if (precosDiarios[i] < precosDiarios[i+1] && precosDiarios[i+2] < precosDiarios[i+2]){
            int diaPrim = i+1;
            i = i+2;
            while (precosDiarios[i] < precosDiarios[i+1]){
                if(i == precosDiarios.length-1){
                    break;
                }
                else{
                    i++;
                }
            }
        }
    }

    }
}