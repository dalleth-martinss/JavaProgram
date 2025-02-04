package com.agibank.ExercicioSwitchEstruturasCondicionais;

import java.util.Scanner;

public class ExerciciosSwitchEstruturas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um opção de investimento: ");
        System.out.println(" 1 - CDB ");
        System.out.println(" 2 - CDI ");
        System.out.println(" 3 - Tesouro Direto ");
        System.out.println(" 4 - FII ");
        System.out.println(" 5 - Sair");

        int opcaoMenu = scanner.nextInt();

       switch (opcaoMenu){
           case 1:
               System.out.println( " CDB - Você escolheu um investimento de renda Fixa");
               break;
           case 2:
               System.out.println( "CDI - Você escolheu um investimento com rentabilidade taxa CDI ");
               break;
           case 3:
               System.out.println( "Tesouro Direto - Você escolheu investimento em titulos publicos federais ");
               break;
           case 4:
               System.out.println( "FII - Você escolheu um investimento mobiliario ");
               break;
           default:
               System.out.println( "Deslogado! ");
               break;
       }
        scanner.close();

    }
}
