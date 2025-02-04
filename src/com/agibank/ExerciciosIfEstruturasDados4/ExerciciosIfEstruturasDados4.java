package com.agibank.ExerciciosIfEstruturasDados4;

import java.util.Scanner;

public class ExerciciosIfEstruturasDados4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma media : ");
        float media = scanner.nextFloat();

        System.out.println("Digite um valor : ");
        float valor = scanner.nextFloat();

        if( valor < 0){
            System.out.println("Digite um numero maior que 0.");
        }else {
            double diferenca = Math.abs(media - valor);

            double porcentagem = (diferenca / media) * 100;

            System.out.printf(" A aproximação em %.2f%% " , porcentagem);
        }
       scanner.close();
    }
}