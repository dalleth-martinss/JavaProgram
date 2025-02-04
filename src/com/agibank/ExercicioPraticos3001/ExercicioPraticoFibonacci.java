package com.agibank.ExercicioPraticos3001;

import java.util.Scanner;

public class ExercicioPraticoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para imprimir a sequencia de fibonacci");
        int num = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Sequencia de Fibonancci até " + num + " : ");

        while (a <= num){
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
       scanner.close();
    }
}
