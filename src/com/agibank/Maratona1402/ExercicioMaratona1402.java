package com.agibank.Maratona1402;

import java.util.Scanner;
//Dev: Dálleth Martins
//Nota : 100 - 30 = 70
//Tester: Jennifer Kamily Silva Parreira


public class ExercicioMaratona1402 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número do índice para ver sua conta (1 a 3): ");

        try {
            // Exibição do menu com as opções de conta
            System.out.println(" ╔══════════════════════╗");
            System.out.println(" ║ Conta no índice:     ║");
            System.out.println(" ║ Ação 1: PETR4        ║");
            System.out.println(" ║ Ação 2: VALE3        ║");
            System.out.println(" ║ Ação 3: ITUB4        ║");
            System.out.println(" ╚══════════════════════╝");
        }catch (Exception e){
            System.out.println("O valor digitado está incorreto, digite um valor de 1 a 3");
        }

        double[][]  matrizValores ={
                {22.5, 23.0, 22.0, 24.5, 25.0},
                {85.0, 86.5, 84.0, 83.5,87.0},
                {30.0, 29.5, 30.5, 31.5,32.5},
        };
        int dias = 5;

       double resultado = mediaPrecos(matrizValores, dias);

        System.out.println(resultado);

    }

    private static double mediaPrecos(double[][] matrizValores, int dias) {

        double soma= 0;
        double result = 0;
        // Calcula media
        for (int i = 0; i < matrizValores[0].length; i++) {
            soma += matrizValores[0][i];
            result = soma / matrizValores[0].length;

        }
        return result;
    }

    // o codigo só encontra o maior valor da linha 0 da matriz enquanto deveria percorrer todos os ativos e comparar o primeiro e último valor retornando a maior variação (Após conversar com a dev ela me explicou que não conseguiu concluir para mudar a resolução mas a lógica dela estava correta) -5
    private static double maiorValorizacao(double[][] matrizValores, int dias) {
                double maior1 = matrizValores[0][0];

        for (int i = 0; i < matrizValores[0].length ; i++) {
            if (matrizValores[0][i] > maior1){
                maior1 = matrizValores[0][i];
            }
        }
        return maior1;
    }

    //-20
    private static double consultaPreco(double[][] matrizValores, int dias) {
        double maior1 = matrizValores[0][0];

        for (int i = 0; i < matrizValores[0].length ; i++) {
            if (matrizValores[0][i] > maior1){
                maior1 = matrizValores[0][i];
            }
        }
        return maior1;
    }

    // codigo incompleto -5
    private  static double simulacaoLucroPerdas(double[][] matrizValores, int dias) {
        double lucro = 0;
        double valor = 0;
        double perdas = 0;
       double result = 0;

        for (int i = 0; i < matrizValores[0].length ; i++) {
            if (matrizValores[0][i] > valor){
                System.out.println(" Lucro" + lucro);
                result = matrizValores[0][i];
            }else{
                System.out.println("Perda" + perdas);
                result = matrizValores[0][i];
            }
        }
        return result ;
    }

}
