package com.agibank.ExercicioDeCasa2901;

import java.util.Scanner;

public class ExerciciosDeCasaTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para  sua tabuada ser gerada: ");
        int num = scanner.nextInt();

        //Loop para ser construida a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}
