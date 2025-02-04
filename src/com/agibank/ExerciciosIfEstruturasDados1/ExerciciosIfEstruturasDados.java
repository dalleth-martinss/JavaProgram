package com.agibank.ExerciciosIfEstruturasDados1;

import java.util.Scanner;

public class ExerciciosIfEstruturasDados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero : ");

       int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Numero positivo");

        }else if (numero == 0) {
            System.out.println("Numero igual a zero");
        }else {
            System.out.println("Numero Negativo");
        }

        scanner.close();

    }
}
