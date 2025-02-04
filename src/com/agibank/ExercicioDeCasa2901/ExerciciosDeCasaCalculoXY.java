package com.agibank.ExercicioDeCasa2901;

import java.util.Scanner;

public class ExerciciosDeCasaCalculoXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        System.out.println(x + "^" + y + " = " + resultado);
        scanner.close();
    }
}
