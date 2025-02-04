package com.agibank.ExercicioDeCasa2901;

import java.util.Scanner;

public class ExerciciosDeCasaQuadradoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int impar = 1;

        for (int i = 0; i < numero; i++) {
            soma += impar;
            impar += 2; // Pegando os números ímpares consecutivos
        }
        System.out.println("O quadrado de " + numero + " é: " + soma);
        scanner.close();
    }
}
