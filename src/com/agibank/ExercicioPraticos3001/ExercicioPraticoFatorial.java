package com.agibank.ExercicioPraticos3001;

import java.util.Scanner;

public class ExercicioPraticoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para calcular o fatorial");
        long num = scanner.nextInt();

        long fatorial = 1;
        for (long i = 1; i <= num ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);
        scanner.close();
    }
}
