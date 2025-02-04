package com.agibank.ExercicioSwitchEstruturasCondicionais;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciciosSwitchEstruturas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("Gustavo");
        pessoas.add("Anderson");
        pessoas.add("Bruno");

        for(String pessoa : pessoas){
            for (int i = 0; i < pessoas.size() ; i++) {
                System.out.println( "Eu sou : " + pessoa);
            }

        }


//
//        System.out.println("Avalie nosso atendimento para que possamos melhora-lo ");
//        System.out.println(" 1 - Muito ruim ");
//        System.out.println(" 2 - Ruim ");
//        System.out.println(" 3 - Bom ");
//        System.out.println(" 4 - Muito Bom ");
//        System.out.println(" 5 - Excelente ");
//
//        int opcaoMenu = scanner.nextInt();
//
//       switch (opcaoMenu){
//           case 1:
//               System.out.println( " Muito Ruim ");
//               break;
//           case 2:
//               System.out.println( " Ruim ");
//               break;
//           case 3:
//               System.out.println( " Bom ");
//               break;
//           case 4:
//               System.out.println( " Muito Bom ");
//               break;
//           default:
//               System.out.println( " Excelente ");
//               break;
//       }
      //  scanner.close();

    }
}
