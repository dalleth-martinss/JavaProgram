package com.agibank.ExerciciosIfEstruturasDados3;

import java.util.Scanner;

public class ExerciciosIfEstruturasDados3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua peso : ");
       float peso = scanner.nextFloat();

        System.out.println("Digite sua altura : ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso saudável.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3 (obesidade mórbida).");
        }
        scanner.close();
    }
}
