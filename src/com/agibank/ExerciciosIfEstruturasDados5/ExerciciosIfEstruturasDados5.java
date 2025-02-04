package com.agibank.ExerciciosIfEstruturasDados5;

import java.util.Scanner;

public class ExerciciosIfEstruturasDados5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota : ");
        float nota = scanner.nextFloat();

        if( nota < 4){
            System.out.println("Aluno reprovado");
        }else if (nota >= 6){
            System.out.println("Aluno aprovado");
        }
       scanner.close();
    }
}